package tools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;

public final class RandomGenerators {

	public static SecureRandom random = new SecureRandom();

	public static String getRandomString() {
		String rndStr = new BigInteger(100, random).toString(32);
		return rndStr;
	}

	public static String getRandomString(String prefix) {
		return prefix + getRandomString();
	}

	public static String getRandomString(int length) {
		return getRandomString().substring(0, length);
	}

	public static void createRandomImage(String fileName, int width,
			int height, int pixelSize) {
		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D g = (Graphics2D) bi.getGraphics();
		for (int x = 0; x < width / pixelSize; x++) {
			for (int y = 0; y < height / pixelSize; y++) {
				g.setColor(new Color(random.nextInt(255), random.nextInt(255),
						random.nextInt(255)));
				g.fillRect(x * pixelSize, y * pixelSize, pixelSize, pixelSize);
			}
		}
		g.dispose();
		saveImageToFile(bi, fileName);
	}

	public static void saveImageToFile(BufferedImage img, String fileName) {
		ImageWriter writer = null;
		Iterator<ImageWriter> iterator = ImageIO
				.getImageWritersByFormatName(Constants.PRODUCT_IMAGE_TYPE);
		if (iterator.hasNext()) {
			writer = iterator.next();
		}
		ImageOutputStream ios = null;
		try {
			ios = ImageIO.createImageOutputStream(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.setOutput(ios);
		ImageWriteParam param = new JPEGImageWriteParam(
				java.util.Locale.getDefault());
		param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
		param.setCompressionQuality(0.98f);
		try {
			writer.write(null, new IIOImage(img, null, null), param);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ios.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
