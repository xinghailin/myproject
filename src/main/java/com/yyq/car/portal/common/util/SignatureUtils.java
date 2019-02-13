package com.yyq.car.portal.common.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

import com.yyq.car.portal.common.exception.PortalAppCheckedException;
import com.yyq.car.portal.common.exception.PortalAppUnCheckedException;


/**
 * <P>
 * 加解签工具类
 * </P>
 * 
 * @author Jonathan
 */
public class SignatureUtils {

	private static final Object CLASS_PROPERTY = "class";

	/**
	 * <p>
	 * 验证文件的签名信息
	 * </p>
	 * 
	 * @param filePath
	 * @param sign
	 * @param algorithm
	 * @param certificatePath
	 * @return
	 * @throws FundpayAppCheckedException
	 * @author Jonathan
	 * @throws PortalAppCheckedException
	 */
	public static boolean verifyFileSign(String filePath, byte[] sign, String algorithm, String certificatePath) throws PortalAppCheckedException {
		try {
			boolean result = false;
			File file = new File(filePath);
			if (file.exists()) {
				FileInputStream in = new FileInputStream(file);
				result = verifyFileSign(in, sign, algorithm, certificatePath);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PortalAppCheckedException(e.getMessage());
		}

	}

	/**
	 * <p>
	 * 验证文件签名
	 * </p>
	 * 
	 * @param in
	 * @param sign
	 * @param algorithm
	 * @param x509certPath
	 * @return
	 * @author Jonathan
	 * @throws PortalAppCheckedException
	 */
	public static boolean verifyFileSign(InputStream in, byte[] sign, String algorithm, String x509certPath) throws PortalAppCheckedException {
		try {
			boolean result = false;
			X509Certificate certificate = readX509Certificate(x509certPath);
			PublicKey publicKey = certificate.getPublicKey();
			Signature signature = Signature.getInstance(algorithm);
			signature.initVerify(publicKey);

			byte[] cache = new byte[1024];
			int nRead = 0;
			while ((nRead = in.read(cache)) != -1) {
				signature.update(cache, 0, nRead);
			}
			in.close();
			result = signature.verify(sign);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * @description: 验证签名
	 * @param data
	 * @param sign
	 * @param x509certificate
	 * @return
	 * @throws Exception
	 * @author: Jonathan
	 * @date: 2014-2-25 上午10:23:12
	 */
	public static boolean verify(byte[] data, byte[] sign, X509Certificate x509certificate) throws Exception {
		Signature signature = Signature.getInstance(x509certificate.getSigAlgName());
		signature.initVerify(x509certificate);
		signature.update(data);
		// 验证签名是否正常
		return signature.verify(sign);
	}

	/**
	 * @description:从文件中读取证书
	 * @param file
	 * @return
	 * @throws Exception
	 * @author: Jonathan
	 * @date: 2014-3-6 下午5:03:17
	 */
	public static X509Certificate readX509Certificate(String file) throws Exception {

		FileInputStream is = new FileInputStream(file);
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		return (X509Certificate) cf.generateCertificate(is);

	}

	/**
	 * <p>
	 * 签名,利用从证书里取出的签名算法和keystore的私钥,对数据进行签名.可以由公钥验证签名
	 * </p>
	 * 
	 * @param keystoreType
	 *            keystore的类型,例如:JKS或者PKCS12(.pfx)等
	 * @param data
	 *            待签名数据
	 * @param keyStorePath
	 *            keystore文件路径:可以直接加载指定的文件,例如"file:C:/KFTCIPKeystore.keystore",
	 *            也可以从classpath下加载,例如 "classpath:/KFTCIPKeystore.keystore"
	 *            支持ANT语法 注意:从classpath下加载时,优先使用 thread context
	 *            ClassLoader,没有找到的情况下,使用当前类加载器
	 * @param keyStorePassword
	 *            访问密钥库的密码
	 * @param alias
	 *            证书条目(包含公钥,私钥和数字证书)的别名.当keystore中只有一个条目时,此参数可以为null;如果有多个时,
	 *            不能为null
	 * @param keyPassword
	 *            私钥条目对应的密码
	 * @return
	 * @throws Exception
	 *             如果提示Key must not be null,可能是alias错误
	 */
	public static byte[] signByX509Certificate(byte[] data, String keystoreType, String keyStorePath, char[] keyStorePassword, String alias, char[] keyPassword)
			throws Exception {
		KeyStore ks = loadKeyStore(keyStorePath, keyStorePassword, keystoreType);
		if (StringUtils.isBlank(alias)) {
			List<String> aliases = Collections.list(ks.aliases());
			if (aliases.size() == 1) {
				alias = aliases.get(0);
			} else {
				throw new PortalAppUnCheckedException(keyStorePath + "制定的keystore文件中不包含任何别名信息");
			}
		}
		X509Certificate x509Certificate = (X509Certificate) ks.getCertificate(alias);
		Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
		PrivateKey privateKey = (PrivateKey) ks.getKey(alias, keyPassword);
		// 初始化签名,由私钥构建
		signature.initSign(privateKey);
		signature.update(data);
		return signature.sign();
	}

	/**
	 * <p>
	 * 加载KeyStore
	 * </p>
	 * 
	 * @param keyStorePath
	 *            keystore文件路径:可以直接加载指定的文件,例如"file:C:/KFTCIPKeystore.keystore"
	 * @param password
	 *            访问密钥库的密码
	 * @param keystoreType
	 *            keystore的类型,如果为NULL,则默认使用KeyStore.getDefaultType()
	 * @return
	 * @throws Exception
	 */
	public static KeyStore loadKeyStore(String keyStorePath, char[] password, String keystoreType) throws Exception {
		KeyStore ks = KeyStore.getInstance(keystoreType == null ? KeyStore.getDefaultType() : keystoreType);
		File keystore = new File(keyStorePath);
		if (keystore == null || (keystore.exists() && keystore.isDirectory())) {
			throw new PortalAppUnCheckedException("keystore[" + keyStorePath + "]必须是一个已经存在的文件,不能为空,且不能是一个文件夹");
		}
		InputStream is = null;
		try {
			is = new FileInputStream(keystore);
			ks.load(is, password);
			return ks;
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}

	/**
	 * @description:
	 * @param map
	 * @return
	 * @throws Exception
	 * @author: Jonathan
	 * @date: 2014-3-20 下午7:50:30
	 */
	public static <T> T parseMapToBean(Map<String, String> map, Class<T> clazz) throws Exception {
		T bean = clazz.newInstance();
		try {
			Field[] fields = clazz.getDeclaredFields();
			for (Field f : fields) {
				String fieldName = f.getName();
				String fieldValue = map.get(fieldName);
				String strLetter = fieldName.substring(0, 1).toUpperCase();
				String setMethodName = "set" + strLetter + fieldName.substring(1);
				Method setMethod = clazz.getMethod(setMethodName, String.class);
				setMethod.invoke(bean, new Object[] { fieldValue });
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("【解析Map转换成交易结果对象】对象转换时出现异常!", e);
		}
		return bean;
	}

	/**
	 * <p>
	 * 把指定的对象转换成String类型的Map键值对集合
	 * </p>
	 * 
	 * @param bean
	 *            指定的需要转换的对象
	 * @return 格式为Map<String,String>类型的键值对
	 * @throws Exception
	 * @author 邱林 Leon.Qiu 2013-3-13 下午5:36:16
	 */
	public static Map<String, String> parseObjectToStringMap(final Object bean) throws Exception {
		final Map<String, String> map = new HashMap<String, String>(1);
		try {
			final Class<? extends Object> type = bean.getClass();
			final BeanInfo beanInfo = Introspector.getBeanInfo(type);
			final PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (final PropertyDescriptor descriptor : propertyDescriptors) {
				final String propertyName = descriptor.getName();
				if (!CLASS_PROPERTY.equals(propertyName)) {
					final Method readMethod = descriptor.getReadMethod();
					final String result = (String) readMethod.invoke(bean, new Object[0]);
					if (result != null) {
						map.put(propertyName, result);
					} else {
						map.put(propertyName, "");
					}
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
			throw new Exception("【解析对象转换成Map】对象转换时出现异常!", e);
		}
		return map;
	}

	/**
	 * @description: 将待加密参数串接成字符串
	 * @param params
	 * @return
	 * @author: Jonathan
	 * @date: 2014-3-7 下午5:54:28
	 */
	public static String concatenateParam(final Map<String, String> params) {
		final List<String> keys = new ArrayList<String>(params.keySet());
		Collections.sort(keys);
		String prestr = "";
		for (int i = 0; i < keys.size(); i++) {
			final String key = keys.get(i);
			final String value = params.get(key);
			if (StringUtils.isEmpty(value))
				continue;
			if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
				prestr = prestr + key + "=" + value;
			} else {
				prestr = prestr + key + "=" + value + "&";
			}
		}
		return prestr;
	}

	public static void main(String args[]) {
		byte[] data = "ddddddd".getBytes();
		char[] keyStorePassword = "123456".toCharArray();
		char[] keyPassword = "123456".toCharArray();
		try {
			String file = "D:\\projectmanager\\certificate\\P2Pkeystore.jks";
			byte[] signData = signByX509Certificate(data, "jks", file, keyStorePassword, null, keyPassword);
			X509Certificate x509certificate = readX509Certificate("D:\\projectmanager\\certificate\\kfttest.cer");
			System.out.println(Base64.encodeBase64String(signData));
			System.out.println("验证签名：" + verify(data, signData, x509certificate));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}