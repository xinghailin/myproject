package com.yyq.car.portal.common.util;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import com.yyq.car.portal.common.constant.Constants;


/**
 * FTP文件上传处理工具类
 * 
 * @author lidongfu
 * 
 */
public class FTPManager {

	private static Log log = LogFactory.getLog(FTPManager.class);
    
	
  	/**
	 * 生成上传文件名
	 * 
	 * @param merchantCode
	 * @return
	 */
	public static String createUploadFileName(String merchantCode) {
		String fileName = merchantCode + "-txt" + "-"
				+ DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "-"
				+ StringUtil.generaryRandom(4)+"."
				+Constants.ACCOUNT_RESULT_FILE_SUFIX;
		return fileName;
	}
	
    /**
     * 生成银行开户反馈数据文件名
     * 
     */
	public static String createDownFileName() {
		String fileName = Constants.ACCOUNT_RESULT_FILE_PREFIX
				+ "_"+DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "."
				+ Constants.ACCOUNT_RESULT_FILE_SUFIX;
		return fileName;
	}
    
     
	/**
	 * 删除FTP服务器的文件
	 * 
	 * @param remotePath
	 * @param remoteFile
	 * @return
	 */
	public static boolean delete(FTPClient ftpClient,String remoteFilePath) {
		boolean status = false;
		try {
			boolean flag = ftpClient.deleteFile(remoteFilePath);
			if (flag)
				if (ftpClient.getReplyCode() == 250)
					status = true;
		} catch (IOException e) {
			log.error("删除文件 " + remoteFilePath + " 失败！！！",e);
			e.printStackTrace();
		}
		return status;
	}

	/**
	 * 断开与远程服务器的连接
	 * 
	 * @throws IOException
	 */
	public void disconnect(FTPClient ftpClient) throws IOException {
		if (ftpClient.isConnected()) {
			ftpClient.disconnect();
		}
	}

	/**
	 * 递归创建远程服务器目录
	 * 
	 * @param remote
	 *            远程服务器文件绝对路径
	 * @param ftpClient
	 *            FTPClient 对象
	 * @return 目录创建是否成功
	 * @throws IOException
	 */
	public UploadStatus createDirecroty(String remote, FTPClient ftpClient)
			throws IOException {
		UploadStatus status = UploadStatus.Create_Directory_Success;
		String directory = remote.substring(0, remote.lastIndexOf("/") + 1);
		if (!directory.equalsIgnoreCase("/")
				&& !ftpClient.changeWorkingDirectory(new String(directory
						.getBytes("UTF-8"), "iso-8859-1"))) {
			// 如果远程目录不存在，则递归创建远程服务器目录
			int start = 0;
			int end = 0;
			if (directory.startsWith("/")) {
				start = 1;
			} else {
				start = 0;
			}
			end = directory.indexOf("/", start);
			while (true) {
				String subDirectory = new String(remote.substring(start, end)
						.getBytes("UTF-8"), "iso-8859-1");
				if (!ftpClient.changeWorkingDirectory(subDirectory)) {
					if (ftpClient.makeDirectory(subDirectory)) {
						ftpClient.changeWorkingDirectory(subDirectory);
					} else {
						log.error("创建目录失败");
						return UploadStatus.Create_Directory_Fail;
					}
				}

				start = end + 1;
				end = directory.indexOf("/", start);
				// 检查所有目录是否创建完毕
				if (end <= start) {
					break;
				}
			}
		}
		return status;
	}

	
	/**
	 * 判断指定文件名的文件是否存在<br>
	 * 返回匹配到的文件个数
	 * 
	 * @param fileName
	 * @return
	 */
	public static int doExistsFile(FTPClient ftpClient ,String fileName) {
		try {
			FTPFile[] fileList = ftpClient.listFiles(fileName);
			return fileList.length;
		} catch (IOException e) {
			log.info(fileName+"该文件不存在",e);
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 连接到FTP服务器
	 * 
	 * @param hostname
	 *            主机名
	 * @param port
	 *            端口
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 是否连接成功
	 * @throws IOException
	 */
	public Object connect(FTPClient ftpClient,String host,int port,String username,String password) throws IOException {
		ftpClient.connect(host, port);
		ftpClient.setControlEncoding("GBK");
		if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
			if (ftpClient.login(username, password)) {
				return true;
			}
		}
		disconnect(ftpClient);
		return false;
	}
    
	public int listFtpFile(FTPClient ftpClient,String remotefileName) {
		int filesize = 0;
		// 生成文件名称
		try {
			// 判断该文件是否存在
			FTPFile[] fileList = ftpClient.listFiles(remotefileName);
			System.out.println(fileList[0].getName()) ;
			filesize = fileList.length;
			if (filesize == 0) {// 如果该文件不存在 则返回
				log.info("待处理文件不存在");
				return filesize;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
			log.error("判断文件是否存在出现异常" , e1);
			return filesize;
		}
		return filesize;
	}
	
	
	public static void main(String[] ddd) {
		FTPManager ftp = new FTPManager();
		FTPClient ftpClient = new FTPClient();
		try {
			ftp.connect(ftpClient, "192.168.25.35", 21, "ftptest", "123456");
			int size = ftp.listFtpFile(ftpClient, "/home/ftptest/upload"); 
			System.out.println("......"+size); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ftp.doExistsFile(ftpClient,"/home/ftptest/upload/bank_account_result_20140709.txt") ;
	}
	
	// 枚举类UploadStatus代码
	public enum UploadStatus {
		Create_Directory_Fail, // 远程服务器相应目录创建失败
		Create_Directory_Success, // 远程服务器闯将目录成功
		Upload_New_File_Success, // 上传新文件成功
		Upload_New_File_Failed, // 上传新文件失败
		File_Exits, // 文件已经存在
		Remote_Bigger_Local, // 远程文件大于本地文件
		Delete_Remote_Faild; // 删除远程文件失败
	}
}
