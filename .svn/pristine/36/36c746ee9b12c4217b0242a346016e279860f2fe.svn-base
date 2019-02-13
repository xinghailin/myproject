/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.util.FileUtil
 * Created By: lidongfu 
 * Created on: 2014年12月9日 下午5:46:18
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import net.coobird.thumbnailator.Thumbnails;

import org.springframework.web.multipart.MultipartFile;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;


/**
 * <P>TODO</P>
 * @author lidongfu
 */
public class FileUtil {

	final private static Logger logger = LoggerFactory.getLogger(FileUtil.class);

	/**
	 * <p>保存图片 并生成缩略图</p>
	 * @param file
	 * @param targetFileName
	 * @param filePath
	 * @param thumbnailNames
	 * @return
	 * @author lidongfu
	 */
	public static String storePicture(MultipartFile file, String targetFileName, String filePath, String... thumbnailNames) {
		InputStream stream = null;
		try {
			stream = file.getInputStream();
		} catch (IOException e) {
			logger.error("读取文件流出现异常", e.getMessage());
			return null;
		}
		String suffix = targetFileName.substring(targetFileName.lastIndexOf(".") + 1);
		String prefix = StringUtil.createFileName();
		String nowTime = DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT);
		// String filePath = storageIconFilePath + readFilePath;
		// 根目录
		String rootPicPath = filePath + "/" + nowTime;
		logger.info("该上传图片路径{}", rootPicPath);
		File rootFile = new File(rootPicPath);
		// 如果该目录不存在 则创建
		if (!rootFile.exists()) {
			boolean isHasDir = rootFile.mkdir();
			if (!isHasDir) {
				logger.error("创建目录失败{}", rootPicPath);
				return null;
			}
		}
		// 写入文件
		String relativeFilePath = rootPicPath + "/" + targetFileName;
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(relativeFilePath);
			byte[] buffer = new byte[1024 * 1024];
			int bytesum = 0;
			int byteread = 0;
			while ((byteread = stream.read(buffer)) != -1) {
				bytesum += byteread;
				fs.write(buffer, 0, byteread);
				fs.flush();
			}
		} catch (IOException e) {
			logger.error("写入文件出现异常", e);
			return null;
		} finally {
			try {
				fs.close();
				stream.close();
			} catch (IOException e) {
				logger.error("关闭流出现异常", e);
				return null;
			}
		}
		// 生成缩略图
		for (String thumbnailName : thumbnailNames) {
			String fileName = prefix + "_" + thumbnailName + "." + suffix;
			// 生成缩略图路径
			String thumbnailPath = rootPicPath + "/" + fileName;
			int size = Integer.parseInt(thumbnailName);
			try {
				Thumbnails.of(relativeFilePath).size(size, size).toFile(thumbnailPath);
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("生成缩略图出现异常", e);
				e.printStackTrace();
				return null;
			}
		}
		return targetFileName;
	}
}
