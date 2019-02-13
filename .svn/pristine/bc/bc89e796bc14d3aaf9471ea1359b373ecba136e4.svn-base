package com.yyq.car.portal.common.service;

import java.security.cert.X509Certificate;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.yyq.car.portal.common.util.SignatureUtils;


/**
 * <P>签名服务</P>
 * @author Jonathan
 */
// @Service
public class SignatureService {

	final private Logger logger = LoggerFactory.getLogger(SignatureService.class);

	@Value("${signature.keystoreType}")
	private String keystoreType;

	@Value("${signature.keystorePassword}")
	private String keystorePassword;

	@Value("${signature.keystorePath}")
	private String keystorePath;

	@Value("${signature.keyPassword}")
	private String keyPassword;

	@Value("${signature.keyAlise}")
	private String keyAlise;

	/**
	 * @description:签名
	 * @param plainValue
	 * @return
	 * @throws Exception
	 * @author: Jonathan
	 * @date: 2014-3-8 上午9:48:15
	 */
	public String sign(byte[] plainValue) throws Exception {
		try {
			byte[] signature = SignatureUtils.signByX509Certificate(plainValue, keystoreType, keystorePath, keystorePassword.toCharArray(), keyAlise,
					keyPassword.toCharArray());
			return Base64.encodeBase64String(signature);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("签名异常：{}", e.getMessage());
			throw new Exception("签名异常，详细信息：" + e.getMessage());
		}
	}

	/**
	 * @description:验证签名
	 * @param plainText
	 * @param signature
	 * @param merchantId
	 * @return
	 * @throws Exception
	 * @author: Jonathan
	 * @date: 2014-3-8 上午9:51:36
	 */
	public Boolean verifySignature(byte[] plainText, byte[] signature, String merchantId) throws Exception {
		// 调用客户信息获取商户证书
		// X509Certificate certificate = merchantService.getCertificate(merchantId);
		X509Certificate certificate = SignatureUtils.readX509Certificate("D:/tmp/certificate/KFTJJPT.cer");
		Boolean verifyResult = SignatureUtils.verify(plainText, signature, certificate);
		return verifyResult;
	}

}
