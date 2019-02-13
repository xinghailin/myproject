package com.yyq.car.portal.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * 
 * <P> TODO 消息摘要</P>
 *
 * @author lidongfu_2005@sina.com
 * @date 2014年8月8日 下午2:41:30
 *
 */
public class MessageDigestUtils {

	/**
	 * 根据给定摘要算法创建一个消息摘要实例
	 * 
	 * @param algorithm
	 *            摘要算法名
	 * @return 消息摘要实例
	 * @see MessageDigest#getInstance(String)
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	static MessageDigest getDigest(String algorithm) {
		try {
			return MessageDigest.getInstance(algorithm);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	/**
	 * 获取MD5 消息摘要实例
	 * 
	 * @return MD5 消息摘要实例
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	private static MessageDigest getMd5Digest() {
		return getDigest("MD5");
	}

	/**
	 * 获取SHA-1 消息摘要实例
	 * 
	 * @return SHA-1 消息摘要实例
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	private static MessageDigest getShaDigest() {
		return getDigest("SHA");
	}

	/**
	 * 获取SHA-256 消息摘要实例
	 * 
	 * @return SHA-256 消息摘要实例
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	private static MessageDigest getSha256Digest() {
		return getDigest("SHA-256");
	}

	/**
	 * 获取SHA-384 消息摘要实例
	 * 
	 * @return SHA-384 消息摘要实例
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	private static MessageDigest getSha384Digest() {
		return getDigest("SHA-384");
	}

	/**
	 * 获取SHA-512 消息摘要实例
	 * 
	 * @return SHA-512 消息摘要实例
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	private static MessageDigest getSha512Digest() {
		return getDigest("SHA-512");
	}

	
	/**
	 * 获取3DES 消息摘要实例
	 * 
	 * @return 3DES 消息摘要实例
	 * @throws RuntimeException
	 *             当{@link java.security.NoSuchAlgorithmException} 发生时
	 */
	private static MessageDigest get3DESDigest() {
		return getDigest("DESede");
	}

	/**
	 * 使用MD5消息摘要算法计算消息摘要
	 * 
	 * @param data
	 *            做消息摘要的数据
	 * @return 消息摘要（长度为16的字节数组）
	 */
	public static byte[] encodeMD5(byte[] data) {
		return getMd5Digest().digest(data);
	}

	
	/**
	 * 使用SHA-1消息摘要算法计算消息摘要
	 * 
	 * @param data
	 *            做消息摘要的数据
	 * @return SHA-1消息摘要（长度为20的字节数组）
	 */
	public static byte[] encodeSHA(byte[] data) {
		return getShaDigest().digest(data);
	}

	

	/**
	 * 使用SHA-256消息摘要算法计算消息摘要
	 * 
	 * @param data
	 *            做消息摘要的数据
	 * @return SHA-256消息摘要（长度为32的字节数组）
	 */
	public static byte[] encodeSHA256(byte[] data) {
		return getSha256Digest().digest(data);
	}

	

	/**
	 * 使用SHA-384消息摘要算法计算消息摘要
	 * 
	 * @param data
	 *            做消息摘要的数据
	 * @return SHA-384消息摘要（长度为43的字节数组）
	 */
	public static byte[] encodeSHA384(byte[] data) {
		return getSha384Digest().digest(data);
	}

	

	/**
	 * 使用SHA-512消息摘要算法计算消息摘要
	 * 
	 * @param data
	 *            做消息摘要的数据
	 * @return SHA-512消息摘要（长度为64的字节数组）
	 */
	public static byte[] encodeSHA512(byte[] data) {
		return getSha512Digest().digest(data);
	}
	
	
    /**
     * <p>TODO 使用SHA-512消息摘要算法计算消息摘要</p>
     * @param data 
     * @return 
     * @author lidongfu_2005@sina.com
     */
	public static byte[] encodeSHA(String data){
		return encodeSHA(data.getBytes());
	}
	
    /**
     * <p>TODO 使用3DES消息摘要算法计算消息摘要</p>
     * @param data 
     * @return 
     * @author lidongfu_2005@sina.com
     */
	public static byte[] encode3DES(String data){
		return get3DESDigest().digest(data.getBytes());
	}
}