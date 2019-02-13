package com.yyq.car.portal.common.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


/**
 * 验证发送方的邮箱密码账户是否正确
 * @author dell
 *
 */
public class MailAuthenticator extends Authenticator {
	
	private String username;  
	private String password;
	
	public MailAuthenticator(String username, String password) {  
		super();  
		this.username = username;  
		this.password = password;  
	}  
	
	protected PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication(username, password);  
	}

}
