/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.EncryptionUtils
 * Created By: Jonathan 
 * Created on: 2014-6-11 下午4:01:24
 * Copyright © 2008-2014 NATIE All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.exception.PortalAppCheckedException;
import com.yyq.car.portal.common.exception.PortalAppUnCheckedException;


/**
 * <P>加解密工具类</P>
 * @author Jonathan
 */
public class EncryptionUtils {

	public static final String KEY_ALGORITHM_AES = "AES";
	public static final String KEY_ALGORITHM_RSA = "RSA";
	public final static String KEY_ALGORITHM_3DES = "DESede";
	public final static String KEY_ALGORITHM_DES = "DES";
	public static final String ALGORITHM_DES_CBC_PKCS5PADDING = "DES/CBC/PKCS5Padding";
	public static final String ALGORITHM_DES_ECB_PKCS5PADDING = "DES/ECB/PKCS5Padding";
	public static final String ALGORITHM_3DES_ECB_PKCS5PADDING = "DESede/ECB/PKCS5Padding";
	public static final String ALGORITHM_AES_CBC_PKCS7PADDING = "AES/CBC/PKCS7Padding";
	public final static String SIGNATURE_ALGORITHM_SHA1_RSA = "SHA1withRSA";
	public final static String SIGNATURE_ALGORITHM_MD5_RSA = "MD5withRSA";

	private static final Logger log = LoggerFactory.getLogger(EncryptionUtils.class);

	static {
		try {
			Security.addProvider(new BouncyCastleProvider());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private EncryptionUtils() {
	}

	/**
	 * <p>采用DES/ECB padding模式的数据加密</p>
	 * @param data
	 * @param key
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static byte[] encryptByDES(byte[] data, byte[] key) throws PortalAppCheckedException {
		try {
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_DES);
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(ALGORITHM_DES_ECB_PKCS5PADDING, "BC");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			return cipher.doFinal(data);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用DES加密时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	
	/**
	 * <p>采用DES/ECB模式的数据解密</p>
	 * @param data
	 * @param key
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static byte[] decryptByDES(byte[] data, byte[] key) throws PortalAppCheckedException {
		try {
			Security.addProvider(new BouncyCastleProvider());
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_DES);
			Cipher cipher = Cipher.getInstance(ALGORITHM_DES_ECB_PKCS5PADDING, "BC");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return cipher.doFinal(data);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用DES加密时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}
	
	
	
	/**
	 * <p>DES/ECB/PKCS5PADDING文件加密</p>
	 * @param plainFilePath
	 * @param encryptedFilePath
	 * @param key
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static void encryptFileByDES(String plainFilePath, String encryptedFilePath, byte[] key) throws PortalAppCheckedException {

		File sourceFile = new File(plainFilePath);
		File destFile = new File(encryptedFilePath);
		if (sourceFile.exists() && sourceFile.isFile()) {
			if (!destFile.getParentFile().exists()) {
				destFile.getParentFile().mkdirs();
			}
			try {
				destFile.createNewFile();
				FileInputStream in = new FileInputStream(sourceFile);
				FileOutputStream out = new FileOutputStream(destFile);
				encryptFileByDES(in, out, key);
			} catch (Exception e) {
				e.printStackTrace();
				log.error("采用DES加密文件时发生异常，异常信息为：{}", e.getMessage());
				throw new PortalAppCheckedException(e.getMessage());
			}
		} else {
			log.warn("源文件[{}]不存在!", plainFilePath);
		}

	}

	/**
	 * <p>3DES/ECB/PKCS5PADDING文件加密</p>
	 * @param in
	 * @param out
	 * @param key
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static void encryptFileByDES(InputStream in, OutputStream out, byte[] key) throws PortalAppCheckedException {
		try {
			SecretKeySpec secretKeySpec = new SecretKeySpec(key, KEY_ALGORITHM_DES);
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(ALGORITHM_DES_ECB_PKCS5PADDING, "BC");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
			CipherInputStream cin = new CipherInputStream(in, cipher);

			byte[] cache = new byte[1024];
			int nRead = 0;
			while ((nRead = cin.read(cache)) != -1) {
				out.write(cache, 0, nRead);
				out.flush();
			}
			out.close();
			cin.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用DES加密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>DES/ECB/PKCS5PADDING文件解密</p>
	 * @param encryptedFilePath
	 * @param decryptedFilePath
	 * @param key
	 * @throws FundpayAppCheckedException
	 * @author Jonathan
	 */
	public static void decryptFileByDES(String encryptedFilePath, String decryptedFilePath, byte[] key) throws PortalAppCheckedException {
		try {
			InputStream in = new FileInputStream(encryptedFilePath);
			OutputStream out = new FileOutputStream(decryptedFilePath);
			decryptFileByDES(in, out, key);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用DES解密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}

	}

	/**
	 * <p>DES/ECB/PKCS5PADDING文件解密</p>
	 * @param in
	 * @param out
	 * @param key
	 * @throws FundpayAppCheckedException
	 * @author Jonathan
	 */
	public static void decryptFileByDES(InputStream in, OutputStream out, byte[] key) throws PortalAppCheckedException {
		try {
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_DES);
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(ALGORITHM_DES_ECB_PKCS5PADDING, "BC");

			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			CipherOutputStream cos = new CipherOutputStream(out, cipher);
			byte[] buffer = new byte[1024];
			int r = 0;
			while ((r = in.read(buffer)) != -1) {
				cos.write(buffer, 0, r);
				cos.flush();
			}
			cos.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用DES解密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	
	
	/**
	 * <p>采用3DES/ECB模式的数据加密</p>
	 * @param data
	 * @param key
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static byte[] encryptBy3DES(byte[] data, byte[] key) throws PortalAppCheckedException {
		try {
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_3DES);
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(ALGORITHM_3DES_ECB_PKCS5PADDING, "BC");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			return cipher.doFinal(data);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用3DES加密时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>采用3DES/ECB模式的数据解密</p>
	 * @param data
	 * @param key
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static byte[] decryptBy3DES(byte[] data, byte[] key) throws PortalAppCheckedException {
		try {
			Security.addProvider(new BouncyCastleProvider());
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_3DES);
			Cipher cipher = Cipher.getInstance(ALGORITHM_3DES_ECB_PKCS5PADDING, "BC");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			return cipher.doFinal(data);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用3DES加密时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>3DES/CBC/PKCS5PADDING文件加密</p>
	 * @param plainFilePath
	 * @param encryptedFilePath
	 * @param key
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static void encryptFileBy3DES(String plainFilePath, String encryptedFilePath, byte[] key) throws PortalAppCheckedException {

		File sourceFile = new File(plainFilePath);
		File destFile = new File(encryptedFilePath);
		if (sourceFile.exists() && sourceFile.isFile()) {
			if (!destFile.getParentFile().exists()) {
				destFile.getParentFile().mkdirs();
			}
			try {
				destFile.createNewFile();
				FileInputStream in = new FileInputStream(sourceFile);
				FileOutputStream out = new FileOutputStream(destFile);
				encryptFileBy3DES(in, out, key);
			} catch (Exception e) {
				e.printStackTrace();
				log.error("采用3DES加密文件时发生异常，异常信息为：{}", e.getMessage());
				throw new PortalAppCheckedException(e.getMessage());
			}
		} else {
			log.warn("源文件[{}]不存在!", plainFilePath);
		}

	}

	/**
	 * <p>3DES/ECB/PKCS5PADDING文件加密</p>
	 * @param in
	 * @param out
	 * @param key
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static void encryptFileBy3DES(InputStream in, OutputStream out, byte[] key) throws PortalAppCheckedException {
		try {
			SecretKeySpec secretKeySpec = new SecretKeySpec(key, KEY_ALGORITHM_3DES);
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(ALGORITHM_3DES_ECB_PKCS5PADDING, "BC");
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
			CipherInputStream cin = new CipherInputStream(in, cipher);

			byte[] cache = new byte[1024];
			int nRead = 0;
			while ((nRead = cin.read(cache)) != -1) {
				out.write(cache, 0, nRead);
				out.flush();
			}
			out.close();
			cin.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用3DES加密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>3DES/ECB/PKCS5PADDING文件解密</p>
	 * @param encryptedFilePath
	 * @param decryptedFilePath
	 * @param key
	 * @throws FundpayAppCheckedException
	 * @author Jonathan
	 */
	public static void decryptFileBy3DES(String encryptedFilePath, String decryptedFilePath, byte[] key) throws PortalAppCheckedException {
		try {
			InputStream in = new FileInputStream(encryptedFilePath);
			OutputStream out = new FileOutputStream(decryptedFilePath);
			decryptFileBy3DES(in, out, key);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用3DES解密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}

	}

	/**
	 * <p>3DES/ECB/PKCS5PADDING文件解密</p>
	 * @param in
	 * @param out
	 * @param key
	 * @throws FundpayAppCheckedException
	 * @author Jonathan
	 */
	public static void decryptFileBy3DES(InputStream in, OutputStream out, byte[] key) throws PortalAppCheckedException {
		try {
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_3DES);
			Security.addProvider(new BouncyCastleProvider());
			Cipher cipher = Cipher.getInstance(ALGORITHM_3DES_ECB_PKCS5PADDING, "BC");

			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			CipherOutputStream cos = new CipherOutputStream(out, cipher);
			byte[] buffer = new byte[1024];
			int r = 0;
			while ((r = in.read(buffer)) != -1) {
				cos.write(buffer, 0, r);
				cos.flush();
			}
			cos.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用3DES解密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>采用AES算法加密数据</p>
	 * @param data
	 * @param key
	 * @param ivStr
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static byte[] encryptByAES(byte[] data, byte[] key, byte[] iv) throws PortalAppCheckedException {

		try {
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_AES);
			IvParameterSpec ivps = new IvParameterSpec(iv);
			Cipher cipher = Cipher.getInstance(ALGORITHM_AES_CBC_PKCS7PADDING, "BC");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivps);
			return cipher.doFinal(data);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用AES加密时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>采用AES算法解密数据</p>
	 * @param data
	 * @param key
	 * @param ivStr
	 * @return
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static byte[] decryptByAES(byte[] data, byte[] key, byte[] iv) throws PortalAppUnCheckedException {
		try {
			SecretKey secretKey = new SecretKeySpec(key, KEY_ALGORITHM_AES);
			IvParameterSpec ivps = new IvParameterSpec(iv);
			Cipher cipher = Cipher.getInstance(ALGORITHM_AES_CBC_PKCS7PADDING, "BC");
			cipher.init(Cipher.DECRYPT_MODE, secretKey, ivps);
			return cipher.doFinal(data);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用AES加密时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppUnCheckedException(e.getMessage());
		}
	}

	/**
	 * <p>采用AES加密文件</p>
	 * @param plainFilePath
	 * @param encryptedFilePath
	 * @param key
	 * @param ivStr
	 * @throws PortalAppCheckedException
	 * @author Jonathan
	 */
	public static void encryptFileByAES(String plainFilePath, String encryptedFilePath, byte[] key, String ivStr)
			throws PortalAppCheckedException {
		try {
			File sourceFile = new File(plainFilePath);
			File destFile = new File(encryptedFilePath);
			if (sourceFile.exists() && sourceFile.isFile()) {
				if (!destFile.getParentFile().exists()) {
					destFile.getParentFile().mkdirs();
				}
				destFile.createNewFile();
				InputStream in = new FileInputStream(sourceFile);
				OutputStream out = new FileOutputStream(destFile);
				SecretKeySpec secretKeySpec = new SecretKeySpec(key, KEY_ALGORITHM_AES);
				IvParameterSpec iv = new IvParameterSpec(ivStr.getBytes());
				Cipher cipher = Cipher.getInstance(ALGORITHM_AES_CBC_PKCS7PADDING, "BC");
				cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, iv);
				CipherInputStream cin = new CipherInputStream(in, cipher);
				byte[] cache = new byte[1024];
				int nRead = 0;
				while ((nRead = cin.read(cache)) != -1) {
					out.write(cache, 0, nRead);
					out.flush();
				}
				out.close();
				cin.close();
				in.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用AES加密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}

	}

	/**
	 * <p>采用AES算法解密文件</p>
	 * @param encryptedFilePath
	 * @param decryptedFilePath
	 * @param key
	 * @param ivStr
	 * @throws Exception
	 * @author Jonathan
	 */
	public static void decryptFileByAES(String encryptedFilePath, String decryptedFilePath, byte[] key, String ivStr) throws Exception {
		try {
			File sourceFile = new File(encryptedFilePath);
			File destFile = new File(decryptedFilePath);
			if (sourceFile.exists() && sourceFile.isFile()) {
				if (!destFile.getParentFile().exists()) {
					destFile.getParentFile().mkdirs();
				}
				destFile.createNewFile();
				FileInputStream in = new FileInputStream(sourceFile);
				FileOutputStream out = new FileOutputStream(destFile);
				SecretKeySpec secretKeySpec = new SecretKeySpec(key, KEY_ALGORITHM_AES);
				IvParameterSpec iv = new IvParameterSpec(ivStr.getBytes());
				Cipher cipher = Cipher.getInstance(ALGORITHM_AES_CBC_PKCS7PADDING, "BC");
				cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, iv);
				CipherOutputStream cout = new CipherOutputStream(out, cipher);
				byte[] cache = new byte[1024];
				int nRead = 0;
				while ((nRead = in.read(cache)) != -1) {
					cout.write(cache, 0, nRead);
					cout.flush();
				}
				cout.close();
				out.close();
				in.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("采用AES解密文件时发生异常，异常信息为：{}", e.getMessage());
			throw new PortalAppCheckedException(e.getMessage());
		}
	}

	public static byte[] initKey(String algorithm, int length) throws PortalAppCheckedException {
		try {
			KeyGenerator kg = KeyGenerator.getInstance(algorithm);
			kg.init(length);
			SecretKey secretKey = kg.generateKey();
			return secretKey.getEncoded();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new PortalAppCheckedException("签名算法不支持");
		}
	}

}
