package com.yyq.car.portal.common.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import net.coobird.thumbnailator.Thumbnails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.exception.PortalBizCheckedException;
import com.yyq.car.portal.common.util.DateUtils;
import com.yyq.car.portal.common.util.StringUtil;


/**
 * 
 * <P>文件处理</P>
 * @author lidongfu
 */
@Service
public class FileService {

	final private Logger logger = LoggerFactory.getLogger(FileService.class);

	@Value("${app.root.path}")
	private String storageIconFilePath;

	@Value("${app.avatar.relative.path}")
	private String readIconFilePath;

	@Value("${app.album.relative.path}")
	private String readAlbumFilePath;

	@Value("${app.image.relative.path}")
	private String activityFilePath;

	@Value("${app.auth.relative.path}")
	private String authFilePath;

	@Value("${app.banner.relative.path}")
	private String bannerFilePath;

	@Value("${app.update.relative.path}")
	private String updateFilePath;

	/**
	 * 
	 * <p>图片保存 同时生成缩略图</p>
	 * @param filename
	 * @param file
	 * @param filePath
	 * @throws PortalBizCheckedException
	 * @throws IOException
	 * @author lidongfu
	 */
	@Async
	public String storeHeaderIcon(MultipartFile file, String targetFileName) {

		return storePicture(file, targetFileName, readIconFilePath, "160", "320");
	}

	/**
	 * 
	 * <p>相册图片保存 同时生成缩略图</p>
	 * @param filename
	 * @param file
	 * @param filePath
	 * @throws PortalBizCheckedException
	 * @throws IOException
	 * @author lidongfu
	 */
	@Async
	public String storeAlbumPhoto(MultipartFile file, String filePath) {

		return storePicture(file, filePath, readAlbumFilePath, "160", "320");
	}

	/**
	 * 
	 * <p>活动图片上传</p>
	 * @param file
	 * @param targetFileName
	 * @return
	 * @throws PortalBizCheckedException
	 * @throws IOException
	 * @author mjy
	 */
	@Async
	public String storeActivityphoto(MultipartFile file, String targetFileName) {
		return storePicture(file, targetFileName, activityFilePath, "160", "320");
	}

	/** 
	 * <p>保存实名认证照片</p>
	 * @param file
	 * @param targetFileName
	 * @return
	 * @author dell
	 */
	@Async
	public String storeAuthPic(MultipartFile file, String targetFileName) {
		return storePicture(file, targetFileName, authFilePath, "160", "320");
	}

	/** 
	 * <p>上传Banner图</p>
	 * @param file
	 * @param targetFileName
	 * @return
	 * @author dell
	 */
	@Async
	public String storeBannerPic(MultipartFile file, String targetFileName) {
		return storePicture(file, targetFileName, bannerFilePath, "160", "320");
	}

	/** 
	 * <p>上传话题评论图片</p>
	 * @param file
	 * @param targetFileName
	 * @return
	 * @author dell
	 */
	public String storeUpdatePic(MultipartFile file, String targetFileName) {
		return storePicture(file, targetFileName, updateFilePath, "160", "320");
	}

	/**
	 * 
	 * <p>保存图片通用方法</p>
	 * @param filename
	 * @param file
	 * @param filePath
	 * @param thumbnailNames
	 * @throws IOException
	 * @throws PortalBizCheckedException
	 * @author lidongfu
	 */
	public String storePicture(MultipartFile file, String targetFileName, String readFilePath, String... thumbnailNames) {
		InputStream stream = null;
		try {
			stream = file.getInputStream();
		} catch (IOException e) {
			logger.error("读取文件流出现异常", e.getMessage());
			return null;
		}
		String suffix = targetFileName.substring(targetFileName.lastIndexOf(".") + 1);
		String prefix = StringUtil.createFileName();
		String fileName1 = prefix + "." + suffix;
		String nowTime = DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT);
		String filePath = storageIconFilePath + readFilePath;
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
		String relativeFilePath = rootPicPath + "/" + fileName1;
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
