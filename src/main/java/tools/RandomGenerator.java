package tools;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class RandomGenerator {

//	public static BufferedImage createImage(int red, int green, int blue,
//			int width, int height) {
//
//		BufferedImage ret;
//			ret = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//		WritableRaster raster = ret.getRaster();
//
//		for (int i = 0; i < height; i++) {
//			for (int j = 0; j < width; j++) {
//					raster.setSample(j, i, 0, red[i][j]);
//					raster.setSample(j, i, 1, green[i][j]);
//					raster.setSample(j, i, 2, blue[i][j]);
//					raster.setSample(j, i, 0, red[i][j]);
//			}
//		}
//
//		return ret;
//	}

	public static BufferedImage createImage(int red[][], int green[][], int blue[][],
			int width, int height) {

		BufferedImage ret;
			ret = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		WritableRaster raster = ret.getRaster();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
					raster.setSample(j, i, 0, red[i][j]);
					raster.setSample(j, i, 1, green[i][j]);
					raster.setSample(j, i, 2, blue[i][j]);
					raster.setSample(j, i, 0, red[i][j]);
			}
		}

		return ret;
	}

	// public static BufferedImage createImage(int[][] r, int[][] g, int[][] b,
	// int width, int height, boolean isColor) {
	//
	// BufferedImage ret;
	// if (isColor)
	// ret = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	// else
	// ret = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
	// WritableRaster raster = ret.getRaster();
	//
	// for (int i = 0; i < height; i++) {
	// for (int j = 0; j < width; j++) {
	// if (isColor) {
	// raster.setSample(j, i, 0, r[i][j]);
	// raster.setSample(j, i, 1, g[i][j]);
	// raster.setSample(j, i, 2, b[i][j]);
	// }
	// else
	// raster.setSample(j, i, 0, r[i][j]);
	// }
	// }
	//
	// return ret;
	// }
}
