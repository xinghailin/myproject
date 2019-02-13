/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.service.ResourceAsyncService
 * Created By: Jonathan 
 * Created on: 2014年12月9日 下午11:09:05
 * Copyright ? 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.net.ftp.FTP;
/**
 * 
 * 
 */
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.ufa.log.Logger;
import org.ufa.log.LoggerFactory;

import com.yyq.car.portal.common.constant.Constants;
import com.yyq.car.portal.common.constant.ExceptionCode;
import com.yyq.car.portal.common.constant.FileTypeEnum;
import com.yyq.car.portal.common.dto.Riskfiledto;
import com.yyq.car.portal.common.exception.PortalAppCheckedException;
import com.yyq.car.portal.common.exception.PortalBizCheckedException;
import com.yyq.car.portal.common.util.DateUtils;
import com.yyq.car.portal.common.util.ImageCompress;
import com.yyq.car.portal.common.util.StringUtil;


/**
 * <P>文件持久化服务类</P>
 * @author Jonathan
 */
@Service
public class ResourcePersistenceService {

	final private Logger logger = LoggerFactory.getLogger(ResourcePersistenceService.class);

	@Autowired
	private SnowflakeIdWorker snowflakeIdWorker;

	@Value("${app.root.path}")
	private String rootPath;
	@Value("${app.biz.relative.path}")
	private String bizRelativePath;

	@Value("${app.product.relative.path}")
	private String productFilePath;

	@Value("${app.scenic.relative.path}")
	private String scenicRelativePath;

	@Value("${app.banner.relative.path}")
	private String bannerRelativePath;

	@Value("${app.app.relative.path}")
	private String appRelativePath;

	@Value("${app.avatar.relative.path}")
	private String avatarRelativePath;

	@Value("${app.task.relative.path}")
	private String taskRelativePath;

	@Value("${app.biz.area.path}")
	private String bizAreaPath;

	@Value("${app.trends.relative.path}")
	private String trendsPath;

	@Value("${app.product.home.relative.path}")
	private String productHomePath;

	@Value("${app.product.pros.relative.path}")
	private String productProsPath;

	@Value("${app.product.room.relative.path}")
	private String productRoomPath;

	@Value("${recommend.relative.path}")
	private String recommendPath;

	@Value("${recommendtype.relative.path}")
	private String recommendTypePath;

	@Value("${app.product.house.relative.path}")
	private String productHouseTypePath;

	@Value("${app.auth.relative.path}")
	private String authPath;

	@Value("${car.identify.path}")
	private String idenPath;

	@Value("${car.model.path}")
	private String modelPath;

	@Value("${contract.video.path}")
	private String videoPath;

	@Value("${car.carClearanceOfGoodsFiles.path}")
	private String carClearanceOfGoodsFilesPath;
	@Value("${car.taxRefund.path}")
	private String cartaxRefundPath;

	@Value("${jndcontract.path}")
	private String jndcontractPath;

	@Value("${leasebackcontract.Path}")
	private String leasebackcontractPath;
	@Value("${paymentRequest.Path}")
	private String paymentRequest;
	@Value("${supplycar.Path}")
	private String supplycarPath;

	@Value("${newsalecontract}")
	private String newsalecontract;

	@Value("${newreportbill}")
	private String newreportbill;

	@Value("${newdownpayposbill}")
	private String newdownpayposbill;

	@Value("${riskapply}")
	private String riskapply;

	@Value("${riskidentify}")
	private String riskidentify;

	@Value("${riskdriver}")
	private String riskdriver;

	@Value("${riskworkprove}")
	private String riskworkprove;

	@Value("${riskcreditreport}")
	private String riskcreditreport;

	@Value("${riskpaycard}")
	private String riskpaycard;

	@Value("${riskflow}")
	private String riskflow;

	@Value("${riskhouse}")
	private String riskhouse;

	@Value("${riskmarriage}")
	private String riskmarriage;

	@Value("${riskensure}")
	private String riskensure;

	@Value("${riskapprovaltable}")
	private String riskapprovaltable;

	@Value("${wholesaleCarfile}")
	private String wholesaleCarfile;

	@Value("${krcarbatchexcel}")
	private String krcarbatchexcel;

	@Value("${invoicerun}")
	private String invoicerun;

	@Value("${invoiceflow}")
	private String invoiceflow;

	@Value("${invoicereplace}")
	private String invoicereplace;

	@Value("${invoicereplaceid}")
	private String invoicereplaceid;

	@Value("${invoiceidentify}")
	private String invoiceidentify;

	@Value("${riskcase}")
	private String riskcase;

	@Value("${web_pic}")
	private String web_pic;

	@Value("${web_model_pic}")
	private String web_model_pic;
	@Value("${area.path}")
	private String area_path;
	@Value("${areaBrand}")
	private String areaBrand;

	@Value("${contract_one}")
	private String contract_one;
	@Value("${contract_two}")
	private String contract_two;
	@Value("${contract_three}")
	private String contract_three;
	@Value("${carsource}")
	private String carsource;
	@Value("${carsourcepic}")
	private String carsourcepic;

	// ftp服务器ip地址
	@Value("${ftp.address}")
	private String fTP_ADDRESS;
	// 端口号
	@Value("${ftp.port}")
	private int fTP_PORT = 21;
	// 用户名
	@Value("${ftp.username}")
	private String fTP_USERNAME;
	// 密码
	@Value("${ftp.password}")
	private String fTP_PASSWORD;
	// 文件路径
	@Value("${ftp.filepath}")
	private String fTP_BASEPATH;
	// 本地字符编码
	static String LOCAL_CHARSET = "UTF-8";
	// FTP协议里面，规定文件名编码为iso-8859-1
	static String SERVER_CHARSET = "ISO-8859-1";

	/**
	 * <p>文件上传</p>
	 * @param file 上传的文件
	 * @param fte 上传的目录
	 * @return
	 * @throws IOException
	 * @author wangzh
	 */
	public String uploadFileProcess(MultipartFile file, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > Constants.PROFILE_PHOTO_MAX_SIZE) {
				throw new PortalBizCheckedException("文件不能超过10M");
			}
			String targetFileName = StringUtil.createFileName();
			String path = getFilePath(fte);
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + targetFileName;
			asyncSaveFile(picPath, file.getInputStream(), true);
		}
		return picPath;
	}

	/**
	 * 出库单报关文件保存地址
	 * @param file
	 * @param fte
	 * @return
	 * @throws IOException
	 */
	public String CustomsDeclarationOutboundSave(MultipartFile file, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > Constants.PROFILE_PHOTO_MAX_SIZE) {
				throw new PortalBizCheckedException("文件不能超过10M");
			}

			String targetFileName = StringUtil.createFileName();
			String path = getFilePath(fte);
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + targetFileName + "."
					+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		}
		return picPath;
	}

	public String uploadFileProcessStr(MultipartFile file, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > Constants.PROFILE_PHOTO_MAX_SIZE) {
				throw new PortalBizCheckedException("文件不能超过10M");
			}
			String targetFileName = StringUtil.createFileName();
			String path = getFilePath(fte);
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + targetFileName + ".jpg";
		}
		return picPath;
	}

	/**
	 * 
	 * <p>保存单个风控文件</p>
	 * @param file
	 * @param fte
	 * @return
	 * @throws IOException
	 * @author wangzh
	 */
	public String uploadOneFileForRisk(MultipartFile file, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > 1024 * 1024 * 5) {
				throw new PortalBizCheckedException(file.getOriginalFilename() + "超过了5M，请选择大小合适的图片");
			}
			String targetFileName = StringUtil.createFileNameN();
			String path = getFilePath(fte);
			String on = file.getOriginalFilename();
			String su = on.lastIndexOf('.') > -1 ? on.substring(on.lastIndexOf('.')) : "";
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + targetFileName + su;
			syncSaveFilecompress(picPath, file.getInputStream(), true);
		}
		return picPath;
	}

	/**
	 * 
	 * <p>风控进件保存</p>
	 * @param file
	 * @param fte
	 * @return
	 * @throws IOException
	 * @author wangzh
	 */
	public String risksave(MultipartFile file, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > Constants.PROFILE_PHOTO_MAX_SIZE) {
				throw new PortalBizCheckedException("文件不能超过10M");
			}
			String targetFileName = StringUtil.createFileNameN();
			String path = getFilePath(fte);
			String on = file.getOriginalFilename();
			String su = on.lastIndexOf('.') > -1 ? on.substring(on.lastIndexOf('.')) : "";
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + targetFileName
			// + "."
			// + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") +
			// 1);
					+ su;
		}
		return picPath;
	}

	/**
	 * 合同视频
	 * @param file
	 * @param InfoNum
	 * @param fte
	 * @return
	 * @throws IOException
	 */
	public String uploadFileProcessStrVideo(MultipartFile file, String InfoNum, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > Constants.PROFILE_VIDEO_MAX_SIZE) {
				throw new PortalBizCheckedException("视频不能超过500M");
			}
			String path = getFilePath(fte);
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + InfoNum + ".mp4";
		}
		return picPath;
	}

	/**
	 * 视频保存
	 * @param map
	 * @param isDelete
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@Async
	public void asyncSaveVideoss(Map<String, Object> map, Boolean isDelete) {
		for (Map.Entry<String, Object> entry : map.entrySet()) {

			String fileName = entry.getKey();
			Map<String, Object> tMap = (Map<String, Object>) entry.getValue();
			// Map<String, Object> file0 = entry.getValue();
			InputStream inputStream = (InputStream) tMap.get("is");// null;

			logger.debug("开始保存文件, 文件名为:{}", fileName);

			long size = (long) tMap.get("size");

			boolean compress = false;
			// double scale = 1.0d;
			if (size > 300 * 1024) {
				compress = true;
			}
			String path = rootPath + fileName;
			File file = new File(path);

			if (file.exists()) {
				logger.info("数据重复:{}", fileName);
				if (isDelete) {
					logger.info("删除数据重复:{}", fileName);
					file.delete();
				} else {
					throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
				}
			}
			if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
				throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
			}

			FileOutputStream fs = null;
			try {
				fs = new FileOutputStream(path);
				byte[] buffer = new byte[1024 * 1024];
				int byteread = 0;
				while ((byteread = inputStream.read(buffer)) != -1) {
					fs.write(buffer, 0, byteread);
					fs.flush();
				}
			} catch (Exception e) {
				logger.error("保存图视频出现异常", e);
				throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
			} finally {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.error("关闭流出现异常", e);
				}
			}
		}

	}

	@SuppressWarnings({ "unused" })
	@Async
	public void carCustomsDeclarationOutboundSave(Map<String, Map<String, Object>> maps, Boolean isDelete) {
		for (Entry<String, Map<String, Object>> entry : maps.entrySet()) {

			String fileName = entry.getKey();
			Map<String, Object> tMap = (Map<String, Object>) entry.getValue();
			// Map<String, Object> file0 = entry.getValue();
			InputStream inputStream = (InputStream) tMap.get("is");// null;

			logger.debug("开始保存文件, 文件名为:{}", fileName);

			long size = (long) tMap.get("size");

			boolean compress = false;
			// double scale = 1.0d;
			if (size > 300 * 1024) {
				compress = true;
			}
			String path = rootPath + fileName;
			File file = new File(path);

			if (file.exists()) {
				logger.info("数据重复:{}", fileName);
				if (isDelete) {
					logger.info("删除数据重复:{}", fileName);
					file.delete();
				} else {
					throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
				}
			}
			if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
				throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
			}

			FileOutputStream fs = null;
			try {
				fs = new FileOutputStream(path);
				byte[] buffer = new byte[1024 * 1024];
				int byteread = 0;
				while ((byteread = inputStream.read(buffer)) != -1) {
					fs.write(buffer, 0, byteread);
					fs.flush();
				}
			} catch (Exception e) {
				logger.error("保存文件出现异常", e);
				throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
			} finally {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.error("关闭流出现异常", e);
				}
			}
		}
	}

	/**
	 * 出库单(报关文件保存)
	 * 
	 * @param map
	 * @param isDelete
	 */
	/*
	 * @Async public void carCustomsDeclarationOutboundSave(Map<String, Map<String, Object>> map,
	 * Boolean isDelete) { for (Map.Entry<String, Map<String, Object>> entry : map.entrySet()) {
	 * String fileName = entry.getKey(); Map<String, Object> tMap = entry.getValue(); InputStream
	 * inputStream = (InputStream) tMap.get("is");// null; logger.debug("开始保存文件, 文件名为:{}",
	 * fileName); long size = (long) tMap.get("size"); boolean compress = false; if (size > 300 *
	 * 1024) { compress = true; } String path = rootPath + fileName; File file = new File(path); if
	 * (file.exists()) { logger.info("数据重复:{}", fileName); if (isDelete) { logger.info("删除数据重复:{}",
	 * fileName); file.delete(); } else { throw new
	 * PortalBizCheckedException(ExceptionCode.FILE_EXISTING); } } if
	 * (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) { throw new
	 * PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE); } if (compress) { try {
	 * if (path.contains(".jpg")) { path = path.substring(0, path.length() - 4); }
	 * Thumbnails.of(inputStream).scale(1f).outputFormat("jpg").outputQuality(0.5f).toFile(path);//
	 * useOriginalFormat(). // ImageCompress imageUtil = new ImageCompress(); //
	 * imageUtil.compressPic(originatePath, path, width, height, true); } catch (Exception e) {
	 * e.printStackTrace(); throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
	 * } finally { } } else {// 直接保存源文件 FileOutputStream fs = null; try { fs = new
	 * FileOutputStream(path); byte[] buffer = new byte[1024 * 1024]; int byteread = 0; while
	 * ((byteread = inputStream.read(buffer)) != -1) { fs.write(buffer, 0, byteread); fs.flush(); }
	 * } catch (Exception e) { logger.error("保存图片出现异常", e); throw new
	 * PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE); } finally { try { fs.close(); }
	 * catch (IOException e) { e.printStackTrace(); logger.error("关闭流出现异常", e); } } } } }
	 */
	// public void asyncSaveFiles(String fileName, InputStream inputStream, Boolean isDelete) {
	@Async
	public void asyncSaveFiles(Map<String, Map<String, Object>> map, Boolean isDelete) {
		for (Map.Entry<String, Map<String, Object>> entry : map.entrySet()) {

			String fileName = entry.getKey();
			Map<String, Object> tMap = entry.getValue();
			// Map<String, Object> file0 = entry.getValue();
			InputStream inputStream = (InputStream) tMap.get("is");// null;
			// try {
			// inputStream =
			// file0.getInputStream();
			// } catch (IOException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// try {
			// throw e1;
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// }
			logger.debug("开始保存文件, 文件名为:{}", fileName);

			long size = (long) tMap.get("size");

			boolean compress = false;
			// double scale = 1.0d;
			if (size > 300 * 1024) {
				// scale = (200 * 1024f) / size;
				compress = true;
			}
			String path = rootPath + fileName;
			File file = new File(path);
			if (file.exists()) {
				logger.info("数据重复:{}", fileName);
				if (isDelete) {
					logger.info("删除数据重复:{}", fileName);
					file.delete();
				} else {
					throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
				}
			}
			if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
				throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
			}
			if (compress) {
				// 保存压缩文件
				// int dot = -1;
				// if ((dot = fileName.lastIndexOf(".")) > -1) {// 有.
				// String suffix = fileName.substring(dot + 1);
				// if (ThumbnailatorUtils.isSupportedOutputFormat(suffix)) {
				// String path = rootPath + fileName.substring(0, fileName.length() - 5);
				try {
					// IOUtils.copy(inputStream, new FileOutputStream(file));
					// FileOutputStream fs = null;
					// try {
					// fs = new FileOutputStream(file);
					// byte[] buffer = new byte[1024 * 1024];
					// // int bytesum = 0;
					// int byteread = 0;
					// while ((byteread = inputStream.read(buffer)) != -1) {
					// // bytesum += byteread;
					// fs.write(buffer, 0, byteread);
					// fs.flush();
					// }
					// } catch (IOException e) {
					// logger.error("写入文件出现异常", e);
					// } finally {
					// try {
					// fs.close();
					// inputStream.close();
					// } catch (IOException e) {
					// logger.error("关闭流出现异常", e);
					// }
					// }

					// 图片压缩
					// if (path.indexOf(".jpg") > -1)
					if (path.contains(".jpg")) {
						path = path.substring(0, path.length() - 4);
					}
					Thumbnails.of(inputStream).scale(1f).outputFormat("jpg").outputQuality(0.5f).toFile(path);// useOriginalFormat().
					// ImageCompress imageUtil = new ImageCompress();
					// imageUtil.compressPic(originatePath, path, width, height, true);
				} catch (Exception e) {
					e.printStackTrace();
					throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
				} finally {

				}

			} else {// 直接保存源文件
				FileOutputStream fs = null;
				try {
					fs = new FileOutputStream(path);
					byte[] buffer = new byte[1024 * 1024];
					int byteread = 0;
					while ((byteread = inputStream.read(buffer)) != -1) {
						fs.write(buffer, 0, byteread);
						fs.flush();
					}
				} catch (Exception e) {
					logger.error("保存图片出现异常", e);
					throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
				} finally {
					try {
						fs.close();
					} catch (IOException e) {
						e.printStackTrace();
						logger.error("关闭流出现异常", e);
					}
				}
			}

		}
	}

	@Async
	public void asyncSaveFilesDirect(List<Riskfiledto> lst, Boolean isDelete) {
		for (Riskfiledto entry : lst) {
			String fileName = entry.getName();
			InputStream inputStream = entry.getInput();
			logger.debug("开始保存文件, 文件名为:{}", fileName);

			String path = rootPath + fileName;
			File file = new File(path);
			if (file.exists()) {
				logger.info("数据重复:{}", fileName);
				if (isDelete) {
					logger.info("删除数据重复:{}", fileName);
					file.delete();
				} else {
					throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
				}
			}
			if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
				throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
			}
			FileOutputStream fs = null;
			try {
				fs = new FileOutputStream(path);
				byte[] buffer = new byte[1024 * 1024];
				int byteread = 0;
				while ((byteread = inputStream.read(buffer)) != -1) {
					fs.write(buffer, 0, byteread);
					fs.flush();
				}
			} catch (Exception e) {
				logger.error("保存文件出现异常", e);
				throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
			} finally {
				try {
					fs.close();
				} catch (IOException e) {
					e.printStackTrace();
					logger.error("关闭流出现异常", e);
				}
			}
		}
	}

	/**
	 * <p>异步保存文件</p>
	 * @param fileType
	 * @param fileName
	 * @param inputStream
	 * @return
	 * @author Jonathan
	 */
	@Async
	public void asyncSaveFile(String fileName, InputStream inputStream, Boolean isDelete) {
		logger.debug("开始保存文件, 文件名为:{}", fileName);
		String path = rootPath + fileName;
		File file = new File(path);
		if (file.exists()) {
			logger.info("数据重复:{}", fileName);
			if (isDelete) {
				logger.info("删除数据重复:{}", fileName);
				file.delete();
			} else {
				throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
			}
		}
		if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
			throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
		}
		try {
			// IOUtils.copy(inputStream, new FileOutputStream(file));
			FileOutputStream fs = null;
			try {
				fs = new FileOutputStream(file);
				byte[] buffer = new byte[1024 * 1024];
				// int bytesum = 0;
				int byteread = 0;
				while ((byteread = inputStream.read(buffer)) != -1) {
					// bytesum += byteread;
					fs.write(buffer, 0, byteread);
					fs.flush();
				}
			} catch (IOException e) {
				logger.error("写入文件出现异常", e);
			} finally {
				try {
					fs.close();
					inputStream.close();
				} catch (IOException e) {
					logger.error("关闭流出现异常", e);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
		} finally {

		}
	}

	/**
	 * <p>保存缩略图</p>
	 * @param fileName
	 * @param inputStream
	 * @param isDelete
	 * @author lkd
	 */
	@Async
	public void saveSmallFile(String fileName, InputStream inputStream, Boolean isDelete, int height, int width) {
		logger.debug("开始保存缩略文件, 文件名为:{}", fileName);
		String originatePath = rootPath + fileName;
		String path = rootPath + fileName + "-" + width + "-" + height; // 这里是原文件的地址
		logger.debug("保存缩略文件地址, 文件名为:{}", fileName);
		File file = new File(path);
		if (file.exists()) {
			logger.info("数据重复:{}", fileName);
			if (isDelete) {
				logger.info("删除数据重复:{}", fileName);
				file.delete();
			} else {
				throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
			}
		}
		if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
			throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
		}
		try {
			// 图片压缩
			ImageCompress imageUtil = new ImageCompress();
			imageUtil.compressPic(originatePath, path, width, height, true);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
		} finally {

		}
	}

	/**
	 * 
	 * <p>同步保存文件</p>
	 * @param fileName
	 * @param inputStream
	 * @param isDelete
	 * @author wangzh
	 */
	public void syncSaveFile(String fileName, InputStream inputStream, Boolean isDelete) {
		logger.debug("开始保存文件, 文件名为:{}", fileName);
		String path = rootPath + fileName;
		File file = new File(path);
		if (file.exists()) {
			logger.info("数据重复:{}", fileName);
			if (isDelete) {
				logger.info("删除数据重复:{}", fileName);
				file.delete();
			} else {
				throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
			}
		}
		// if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
		// throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
		// }
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		try {
			// IOUtils.copy(inputStream, new FileOutputStream(file));
			FileOutputStream fs = null;
			try {
				fs = new FileOutputStream(file);
				byte[] buffer = new byte[1024 * 1024];
				// int bytesum = 0;
				int byteread = 0;
				while ((byteread = inputStream.read(buffer)) != -1) {
					// bytesum += byteread;
					fs.write(buffer, 0, byteread);
					fs.flush();
				}
			} catch (IOException e) {
				logger.error("写入文件出现异常", e);
				throw new PortalBizCheckedException("写入文件出现异常:" + e);
			} finally {
				try {
					fs.close();
					inputStream.close();
				} catch (IOException e) {
					logger.error("关闭流出现异常", e);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
		} finally {
		}
	}

	/**
	 * 
	 * <p>coobird压缩</p>
	 * @param fileName
	 * @param inputStream
	 * @param isDelete
	 * @author wangzh
	 */
	public void syncSaveFilecompress(String fileName, InputStream inputStream, Boolean isDelete) {
		logger.debug("开始保存文件, 文件名为:{}", fileName);
		String path = rootPath + fileName;
		File file = new File(path);
		if (file.exists()) {
			logger.info("数据重复:{}", fileName);
			if (isDelete) {
				logger.info("删除数据重复:{}", fileName);
				file.delete();
			} else {
				throw new PortalBizCheckedException(ExceptionCode.FILE_EXISTING);
			}
		}
		// if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
		// throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
		// }
		int creatcount = 0;
		if (!(file.getParentFile().exists())) {// 目录不存在时
			do {
				file.getParentFile().mkdirs();
			} while (!(file.getParentFile().exists()) && ++creatcount < 5);// 创建5次
			if (creatcount > 4) {
				throw new PortalAppCheckedException("创建目录[" + file.getParentFile() + "]失败！");
			}
		}

		try {
			Thumbnails.of(inputStream).scale(1f).outputQuality(0.5f).toFile(file);
		} catch (Exception e1) {
			e1.printStackTrace();
			logger.error("压缩并写入文件出现异常{}", e1.getMessage());
			// throw new PortalBizCheckedException("保存压缩文件错误");
			// 压缩有问题那咱就不压缩
			try {
				// IOUtils.copy(inputStream, new FileOutputStream(file));
				FileOutputStream fs = null;
				try {
					fs = new FileOutputStream(file);
					byte[] buffer = new byte[1024 * 1024];
					// int bytesum = 0;
					int byteread = 0;
					while ((byteread = inputStream.read(buffer)) != -1) {
						// bytesum += byteread;
						fs.write(buffer, 0, byteread);
						fs.flush();
					}
				} catch (IOException e) {
					logger.error("写入文件出现异常", e);
				} finally {
					try {
						fs.close();
						inputStream.close();
					} catch (IOException e) {
						logger.error("关闭流出现异常", e);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
			} finally {
			}
		}
	}

	/**
	 * 
	 * <p>保存头像 并进行裁剪</p>
	 * @param fileName
	 * @param inputStream
	 * @author lidongfu
	 */
	@Async
	public void storeAvatarPicture(String fileName, InputStream inputStream) {
		// InputStream stream = null;
		String path = rootPath + fileName;
		String sourceFilePath = rootPath + fileName + "_source";
		File file = new File(sourceFilePath);
		if (file.exists()) {
			logger.info("数据重复:{}", fileName);
		}
		if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
			throw new PortalAppCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
		}
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(path);
			byte[] buffer = new byte[1024 * 1024];
			// int bytesum = 0;
			int byteread = 0;
			while ((byteread = inputStream.read(buffer)) != -1) {
				// bytesum += byteread;
				fs.write(buffer, 0, byteread);
				fs.flush();
			}
		} catch (Exception e) {
			logger.error("保存图片出现异常", e);
			throw new PortalAppCheckedException(ExceptionCode.FILE_FAILED_TO_SAVE);
		} finally {
			try {
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("关闭流出现异常", e);
			}
		}
	}

	/**
	 * 
	 * <p>上传服务器    ftp</p>
	 * @param fileName
	 * @param input
	 * @param isDelete
	 * @author liliang
	 */
	public void saveFileFtp(String filePath, InputStream input, Boolean isDelete) {
		logger.debug("开始保存文件, 文件名为:{}", filePath);
		FTPClient ftp = new FTPClient();
		ftp.setControlEncoding(LOCAL_CHARSET);
		try {
			int reply;
			ftp.connect(fTP_ADDRESS, fTP_PORT);// 连接FTP服务器
			ftp.login(fTP_USERNAME, fTP_PASSWORD);// 登录
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
			}
			ftp.enterLocalPassiveMode();
			ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
			String fileFullPath = filePath.substring(0, filePath.lastIndexOf("/"));
			boolean createStatus = createMultiDirectory(fileFullPath, ftp);
			if (createStatus) {
				String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
				ftp.storeFile(fileName, input);
			} else {
				throw new PortalBizCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
			}
			input.close();
			ftp.logout();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
	}

	/**
	 * 
	 * <p>ftp保存/未压缩（不知如何压缩）</p>
	 * @param file
	 * @param fte
	 * @return
	 * @throws IOException
	 * @author wangzh
	 */
	public String ftpSave(MultipartFile file, FileTypeEnum fte) throws IOException {
		String picPath = null;
		if (file != null && file.getSize() > 0) {
			if (file.getSize() > 1024 * 1024 * 5) {
				throw new PortalBizCheckedException(file.getOriginalFilename() + "超过了5M，请选择大小合适的图片");
			}
			String targetFileName = String.valueOf(snowflakeIdWorker.nextId());// 雪花算法
			String path = getFilePath(fte);
			String on = file.getOriginalFilename();
			String su = on.lastIndexOf('.') > -1 ? on.substring(on.lastIndexOf('.')) : "";
			picPath = path + "/" + DateUtils.formateCurrent(DateUtils.COMPACT_DATE_FORMAT) + "/" + targetFileName + su;
			saveFileFtp(picPath, file.getInputStream(), true);
		}
		return picPath;
	}

	@SuppressWarnings("finally")
	private boolean createMultiDirectory(String multiDirectory, FTPClient ftpClient) {
		boolean bool = false;
		try {
			String[] dirs = multiDirectory.split("/");
			ftpClient.changeWorkingDirectory("/");
			// 按顺序检查目录是否存在，不存在则创建目录
			for (int i = 0; dirs != null && i < dirs.length; i++) {
				if (!ftpClient.changeWorkingDirectory(dirs[i])) {
					if (ftpClient.makeDirectory(dirs[i])) {
						if (!ftpClient.changeWorkingDirectory(dirs[i])) {
							return false;
						}
					} else {
						return false;
					}
				}
			}

			bool = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			return bool;
		}
	}

	/**
	 * 
	 * <p>下载 ftp 文件 , 以流的形式返回</p>
	 * @param path   文件全路径
	 * @author liliang
	 * @throws IOException 
	 * @throws SocketException 
	 */

	public byte[] downloadFileFtp(String path) throws SocketException, IOException {
		byte[] bytes = null;
		InputStream in = null;
		FTPClient ftp = new FTPClient();  // 创建一个客户端实例
		int reply;
		ftp.connect(fTP_ADDRESS, fTP_PORT);// 连接FTP服务器
		ftp.login(fTP_USERNAME, fTP_PASSWORD);// 登录
		ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
		reply = ftp.getReplyCode();
		if (!FTPReply.isPositiveCompletion(reply)) {
			ftp.disconnect();
		}
		// 转到指定下载目录
		if (path != null) {// 验证是否有该文件夹，有就转到，没有创建后转到该目录下
			ftp.changeWorkingDirectory(path);// 转到指定目录下
		}
		String remoteAbsoluteFile = toFtpFilename(path);

		// 下载文件
		ftp.setBufferSize(1024);
		ftp.setControlEncoding(LOCAL_CHARSET);
		// ftp.setFileType(ftp.BINARY_FILE_TYPE);
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		in = ftp.retrieveFileStream(remoteAbsoluteFile);
		bytes = input2byte(in);
		in.close();
		logger.info("下载成功!" + bytes.length);
		return bytes;
	}

	/**转化输出的编码
	* @throws UnsupportedEncodingException */
	private String toFtpFilename(String fileName) throws UnsupportedEncodingException {
		return new String(fileName.getBytes(LOCAL_CHARSET), SERVER_CHARSET);
	}

	/**
	 * 文件转成 byte[] <一句话功能简述> <功能详细描述>
	 *
	 * @param inStream
	 * @return
	 * @throws IOException
	 * @see [类、类#方法、类#成员]
	 */
	public static byte[] input2byte(InputStream inStream) throws IOException {
		ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
		// byte[] buff = new byte[inStream.available()];
		byte[] buff = new byte[1024 * 1024];
		int rc = 0;
		while ((rc = inStream.read(buff)) > 0) {
			swapStream.write(buff, 0, rc);
		}
		byte[] in2b = swapStream.toByteArray();
		swapStream.close();
		return in2b;
	}

	public String getFilePath(FileTypeEnum fileType) {
		if (FileTypeEnum.supplycar.equals(fileType)) {
			return supplycarPath;
		}
		if (FileTypeEnum.CARIDENTIFY.equals(fileType)) {
			return idenPath;
		}
		if (FileTypeEnum.paymentRequest.equals(fileType)) {
			return paymentRequest;
		}
		if (FileTypeEnum.leasebackcontract.equals(fileType)) {
			return leasebackcontractPath;
		}
		if (FileTypeEnum.jndcontract.equals(fileType)) {
			return jndcontractPath;
		}
		if (FileTypeEnum.MODEL.equals(fileType)) {
			return modelPath;
		}
		if (FileTypeEnum.VIDEO.equals(fileType)) {
			return videoPath;
		}
		if (FileTypeEnum.carClearanceOfGoodsFiles.equals(fileType)) {
			return carClearanceOfGoodsFilesPath;
		}
		if (FileTypeEnum.taxRefund.equals(fileType)) {
			return cartaxRefundPath;
		}
		if (FileTypeEnum.AUTH.equals(fileType)) {
			return authPath;
		}
		if (FileTypeEnum.BIZ.equals(fileType)) {
			return bizRelativePath;
		}
		if (FileTypeEnum.PRODUCT.equals(fileType)) {
			return productFilePath;
		}
		if (FileTypeEnum.SCENIC.equals(fileType)) {
			return scenicRelativePath;
		}
		if (FileTypeEnum.BANNER.equals(fileType)) {
			return bannerRelativePath;
		}
		if (FileTypeEnum.APP.equals(fileType)) {
			return appRelativePath;
		}
		if (FileTypeEnum.AVATAR.equals(fileType)) {
			return avatarRelativePath;
		}
		if (FileTypeEnum.TASK.equals(fileType)) {
			return taskRelativePath;
		}
		if (FileTypeEnum.BIZAREA.equals(fileType)) {
			return bizAreaPath;
		}
		if (FileTypeEnum.TRENDS.equals(fileType)) {
			return trendsPath;
		}
		if (FileTypeEnum.PRODUCT_HOME.equals(fileType)) {
			return productHomePath;
		}
		if (FileTypeEnum.PRODCUT_PROS.equals(fileType)) {
			return productProsPath;
		}
		if (FileTypeEnum.PRODUCT_ROOM.equals(fileType)) {
			return productRoomPath;
		}
		if (FileTypeEnum.RECOMMEND.equals(fileType)) {
			return recommendPath;
		}
		if (FileTypeEnum.RECOMMENDTYPE.equals(fileType)) {
			return recommendTypePath;
		}
		if (FileTypeEnum.PRODUCT_HOUSE.equals(fileType)) {
			return productHouseTypePath;
		}
		if (FileTypeEnum.newsalecontract.equals(fileType)) {
			return newsalecontract;
		}
		if (FileTypeEnum.newreportbill.equals(fileType)) {
			return newreportbill;
		}
		if (FileTypeEnum.newdownpayposbill.equals(fileType)) {
			return newdownpayposbill;
		}
		if (FileTypeEnum.riskapply.equals(fileType)) {
			return riskapply;
		}
		if (FileTypeEnum.riskidentify.equals(fileType)) {
			return riskidentify;
		}
		if (FileTypeEnum.riskdriver.equals(fileType)) {
			return riskdriver;
		}
		if (FileTypeEnum.riskworkprove.equals(fileType)) {
			return riskworkprove;
		}
		if (FileTypeEnum.riskcreditreport.equals(fileType)) {
			return riskcreditreport;
		}
		if (FileTypeEnum.riskpaycard.equals(fileType)) {
			return riskpaycard;
		}
		if (FileTypeEnum.riskflow.equals(fileType)) {
			return riskflow;
		}
		if (FileTypeEnum.riskhouse.equals(fileType)) {
			return riskhouse;
		}
		if (FileTypeEnum.riskmarriage.equals(fileType)) {
			return riskmarriage;
		}
		if (FileTypeEnum.riskensure.equals(fileType)) {
			return riskensure;
		}
		if (FileTypeEnum.riskapprovaltable.equals(fileType)) {
			return riskapprovaltable;
		}
		if (FileTypeEnum.wholesaleCarfile.equals(fileType)) {
			return wholesaleCarfile;
		}
		if (FileTypeEnum.krcarbatchexcel.equals(fileType)) {
			return krcarbatchexcel;
		}
		if (FileTypeEnum.invoicerun.equals(fileType)) {
			return invoicerun;
		}
		if (FileTypeEnum.invoiceflow.equals(fileType)) {
			return invoiceflow;
		}
		if (FileTypeEnum.invoicereplace.equals(fileType)) {
			return invoicereplace;
		}
		if (FileTypeEnum.invoicereplaceid.equals(fileType)) {
			return invoicereplaceid;
		}
		if (FileTypeEnum.invoiceidentify.equals(fileType)) {
			return invoiceidentify;
		}
		if (FileTypeEnum.riskcase.equals(fileType)) {
			return riskcase;
		}
		if (FileTypeEnum.web_pic.equals(fileType)) {
			return  "/" + fTP_BASEPATH +  web_pic;
		}
		if (FileTypeEnum.web_model_pic.equals(fileType)) {
			return  "/" + fTP_BASEPATH + web_model_pic;
		}
		if (FileTypeEnum.area_path.equals(fileType)) {
			return area_path;
		}
		if (FileTypeEnum.areaBrand.equals(fileType)) {
			return areaBrand;
		}
		if (FileTypeEnum.carsource.equals(fileType)) {
			return carsource;
		}
		if (FileTypeEnum.carsourcepic.equals(fileType)) {
			return carsourcepic;
		}
		if (FileTypeEnum.contract_one.equals(fileType)) {
			return "/" + fTP_BASEPATH + contract_one;
		}
		if (FileTypeEnum.contract_two.equals(fileType)) {
			return "/" + fTP_BASEPATH + contract_two;
		}
		if (FileTypeEnum.contract_three.equals(fileType)) {
			return "/" + fTP_BASEPATH + contract_three;
		}
		throw new PortalBizCheckedException(ExceptionCode.DIRECTORY_FAILED_TO_CREATE);
	}

}
