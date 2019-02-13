package org.ufa.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;


/**
 * <P>缓存测试</P>
 * @author Jonathan
 */
@ContextConfiguration(locations = { "/test_ufa_cache.xml" })
public class UfaCacheTest extends AbstractTestNGSpringContextTests {

	protected final transient Logger logger = LoggerFactory.getLogger(UfaCacheTest.class);

	@Autowired
	private UfaCacheService ufaCacheService;

	@Test
	public void testCache() {

		logger.info("清楚缓存后调用参数:{}", "darius");
		UserDTO user1 = ufaCacheService.getUser("darius");
		logger.info("再次调用", user1);
		user1 = ufaCacheService.getUser("darius");
		ufaCacheService.clearCache();
		user1 = ufaCacheService.getUser("darius");
		ufaCacheService.clearCache();

	}

}
