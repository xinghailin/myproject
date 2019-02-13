/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.util.JedisPoolFactory
 * Created By: mjy 
 * Created on: 2014年11月4日 下午2:40:00
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.util.StringUtils;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.Protocol;
import redis.clients.util.Pool;


/**
 * <P>TODO</P>
 * @author mjy
 */
public class JedisFactory implements InitializingBean, DisposableBean, FactoryBean<Jedis> {
	protected final static Logger log = LoggerFactory.getLogger(JedisFactory.class);
	private JedisShardInfo shardInfo;
	private String hostName = "localhost";
	private int port = Protocol.DEFAULT_PORT;
	private int timeout = Protocol.DEFAULT_TIMEOUT;
	private String password;
	private boolean usePool = true;

	public SentinelConfiguration getSentinelConfig() {
		return sentinelConfig;
	}

	public void setSentinelConfig(SentinelConfiguration sentinelConfig) {
		this.sentinelConfig = sentinelConfig;
	}

	private Pool<Jedis> pool;
	private JedisPoolConfig poolConfig = new JedisPoolConfig();
	private SentinelConfiguration sentinelConfig;

	/**
	 * 暂没使用
	 */
	// private int dbIndex = 0;
	// private boolean convertPipelineAndTxResults = true;

	private boolean isRedisSentinelAware() {
		return sentinelConfig != null;
	}

	private JedisShardInfo getShardInfo() {
		return shardInfo;
	}

	private JedisPoolConfig getPoolConfig() {
		return poolConfig;
	}

	private Pool<Jedis> createPool() {

		if (isRedisSentinelAware()) {
			return createRedisSentinelPool(this.sentinelConfig);
		}
		return createRedisPool();
	}

	/**
	 * 
	 * <p>创建sentinelRedis</p>
	 * @param config
	 * @return
	 * @author mjy
	 */
	protected Pool<Jedis> createRedisSentinelPool(SentinelConfiguration config) {
		return new JedisSentinelPool(config.getMasterName(), config.getSentinels(), getPoolConfig() != null ? getPoolConfig() : new JedisPoolConfig(),
				getShardInfo().getTimeout(), getShardInfo().getPassword());
	}

	/**
	 * 
	 * <p>创建单机Redis</p>
	 * @return
	 * @author mjy
	 */
	protected Pool<Jedis> createRedisPool() {
		return new JedisPool(getPoolConfig(), getShardInfo().getHost(), getShardInfo().getPort(), getShardInfo().getTimeout(), getShardInfo().getPassword());
	}

	public void destroy() throws Exception {
		if (usePool && pool != null) {
			try {
				pool.destroy();
			} catch (Exception ex) {
				log.warn("Cannot properly close Jedis pool", ex);
			}
			pool = null;
		}

	}

	public void afterPropertiesSet() throws Exception {
		if (shardInfo == null) {
			shardInfo = new JedisShardInfo(hostName, port);

			if (StringUtils.hasLength(password)) {
				shardInfo.setPassword(password);
			}

			if (timeout > 0) {
				shardInfo.setTimeout(timeout);
			}
		}

		if (usePool) {
			this.pool = createPool();
		}

	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Jedis getObject() {
		try {
			if (usePool && pool != null) {
				return pool.getResource();
			}
			Jedis jedis = new Jedis(getShardInfo());
			jedis.connect();
			return jedis;
		} catch (Exception ex) {
			throw new RedisConnectionFailureException("Cannot get Jedis connection", ex);
		}
	}

	public Class<?> getObjectType() {
		return Jedis.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
