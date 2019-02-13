/*******************************************************************************
 * Project   : portal-common
 * Class Name: com.yyq.cloud.portal.common.util.FileUtils
 * Created By: Jonathan 
 * Created on: 2014年12月2日 上午12:12:42
 * Copyright © 2013-2014 YYQ All rights reserved.
 ******************************************************************************/
package com.yyq.car.portal.common.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;

import com.yyq.car.portal.common.exception.PortalAppCheckedException;
import com.yyq.car.portal.common.exception.PortalBizCheckedException;


/**
 * <P>保存文件工具类</P>
 * @author Jonathan
 */
public class ImageUtils {

	/**
	 * <p>保存文件到指定路径</p>
	 * @param inputStream
	 * @param path
	 * @author Jonathan
	 * @throws PortalBizCheckedException 
	 * @throws PortalAppCheckedException 
	 */
	static public void saveImage(InputStream inputStream, String path, String imageFormat) throws PortalBizCheckedException, PortalAppCheckedException {
		try {
			BufferedImage image = ImageIO.read(inputStream);

			Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(imageFormat);
			// ImageWriter writer = writers.next();
			ImageWriter writer = null;

			while (writers.hasNext()) {
				ImageWriter candidate = writers.next();

				if (candidate.getClass().getSimpleName().equals("CLibPNGImageWriter")) {
					writer = candidate; // This is the one we want
					break;
				} else if (writer == null) {
					writer = candidate; // Any writer is better than no writer ;-)
				}
			}
			ImageWriteParam param = writer.getDefaultWriteParam();
			if (param.canWriteCompressed()) {
				// NOTE: Any method named [set|get]Compression.* throws
				// UnsupportedOperationException if false
				param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
				param.setCompressionQuality(0.3f);
			}

			// 设置压缩比为 0.8
			// ImageWriteParam param = jpegWriter.getDefaultWriteParam();
			// param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			// param.setCompressionQuality(1.0f);

			// param.setCompressionMode(BMPImageWriteParam.MODE_EXPLICIT);
			// param.setCompressionQuality(0.0f);
			// param.setCompressionType("BI_BITFIELDS");

			// 将图片先入文件
			FileImageOutputStream out;

			out = new FileImageOutputStream(new File(path + "." + imageFormat));
			writer.setOutput(out);
			writer.write(null, new IIOImage(image, null, null), param);
			writer.dispose();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static public byte[] compress(InputStream inputStream, String imageFormat) {
		try {
			BufferedImage image = ImageIO.read(inputStream);
			Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(imageFormat);
			// ImageWriter writer = writers.next();
			ImageWriter writer = null;
			while (writers.hasNext()) {
				ImageWriter candidate = writers.next();

				if (candidate.getClass().getSimpleName().equals("CLibPNGImageWriter")) {
					writer = candidate; // This is the one we want
					break;
				} else if (writer == null) {
					writer = candidate; // Any writer is better than no writer ;-)
				}
			}
			ImageWriteParam param = writer.getDefaultWriteParam();
			if (param.canWriteCompressed()) {
				param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
				param.setCompressionQuality(0.01f);
			}

			// 设置压缩比为 0.8
			// ImageWriteParam param = jpegWriter.getDefaultWriteParam();
			// param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			// param.setCompressionQuality(1.0f);

			// param.setCompressionMode(BMPImageWriteParam.MODE_EXPLICIT);
			// param.setCompressionQuality(0.0f);
			// param.setCompressionType("BI_BITFIELDS");

			ByteArrayOutputStream out = new ByteArrayOutputStream();

			writer.setOutput(out);
			writer.write(null, new IIOImage(image, null, null), param);
			writer.dispose();
			out.close();
			return out.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int height, int width, int type) {

		BufferedImage resizedImage = new BufferedImage(width, height, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, width, height, null);
		g.dispose();
		g.setComposite(AlphaComposite.Src);

		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		return resizedImage;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("d:/login.png");
		FileInputStream inputStream = new FileInputStream(file);
		ImageUtils.saveImage(inputStream, "d:/test", "png");
	}
}
