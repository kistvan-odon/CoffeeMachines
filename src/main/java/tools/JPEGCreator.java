package tools;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.stream.ImageOutputStream;

public class JPEGCreator {

	public static String generate(String prefix) throws Exception {
		Random random = new Random(56743793);
		int x, y = 0;
		// image block size in pixels, 1 is 1px, use smaller values for
		// greater granularity
		int PIX_SIZE = 5;
		// image size in pixel blocks
		int X = 100;
		int Y = 100;
		BufferedImage bi = new BufferedImage(PIX_SIZE * X, PIX_SIZE * Y,
				BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D g = (Graphics2D) bi.getGraphics();
		String filename = prefix + "img.jpg";
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				x = i * PIX_SIZE;
				y = j * PIX_SIZE;
				// this is a writing condition, my choice here is purely random
				// just to generate some pattern
				// this condition
				if ((i * j) % 6 == 0) {
					g.setColor(Color.GRAY);
				} else if ((i + j) % 5 == 0) {
					g.setColor(Color.BLUE);
				} else {
					g.setColor(Color.WHITE);
				}// end else
					// fil the rectangles with the pixel blocks in chosen color
				g.fillRect(y, x, PIX_SIZE, PIX_SIZE);
			}// end for j
		}// end for i
		g.dispose();
		saveToFile(bi, new File(filename));
		return filename;
	}// end method

	public static void saveToFile(BufferedImage img, File file)
			throws IOException {
		ImageWriter writer = null;
		java.util.Iterator iter = ImageIO.getImageWritersByFormatName("jpg");
		if (iter.hasNext()) {
			writer = (ImageWriter) iter.next();
		}
		ImageOutputStream ios = ImageIO.createImageOutputStream(file);
		writer.setOutput(ios);
		ImageWriteParam param = new JPEGImageWriteParam(
				java.util.Locale.getDefault());
		param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
		param.setCompressionQuality(0.98f);
		writer.write(null, new IIOImage(img, null, null), param);
	}

	public static void main(String args[]) throws Exception {
		JPEGCreator.generate("test-");
		System.out.println("Image created.");
	}
}
