package tools;

import java.util.Arrays;
import java.util.List;

public class Product {

	public String category, smallImage, bigImage, brand, model,
			characteristics;
	public Double price;

	public static Product generateNewProduct() {
		Product product = new Product();
		product.category = Constants.PRODUCT_CATEGORIES
				.get(RandomGenerators.random
						.nextInt(Constants.PRODUCT_CATEGORIES.size()));
		product.smallImage = RandomGenerators.getRandomString("smallImage");
		RandomGenerators.createRandomImage(Constants.PRODUCT_IMAGES_FOLDER
				+ product.smallImage, Constants.PRODUCT_IMAGE_TYPE, 175, 175,
				10);
		product.bigImage = RandomGenerators.getRandomString("bigImage");
		RandomGenerators.createRandomImage(Constants.PRODUCT_IMAGES_FOLDER
				+ product.bigImage, Constants.PRODUCT_IMAGE_TYPE, 450, 500, 10);
		product.brand = RandomGenerators.getRandomString("brand");
		product.model = RandomGenerators.getRandomString("model");
		product.characteristics = RandomGenerators
				.getRandomString("characteristics");
		product.price = RandomGenerators.random.nextDouble()
				* Constants.MAX_PRODUCT_PRICE;
		Product.saveProductToFile(product);
		return product;
	}

	public static Product getRandomExistingProduct() {
		List<String> existingProductsList = FileUtils
				.getFileLinesAsList(Constants.EXISTING_PRODUCTS_FILE_PATH);
		// we remove the first line which is the header
		existingProductsList.remove(0);
		String productInfo = StringUtils
				.getRandomItemFromList(existingProductsList);
		List<String> productDetails = Arrays.asList(StringUtils
				.getSubstringsSplitByKey(productInfo, ","));
		Product product = new Product();
		product.category = productDetails.get(0);
		product.smallImage = productDetails.get(1);
		product.bigImage = productDetails.get(2);
		product.brand = productDetails.get(3);
		product.model = productDetails.get(4);
		product.characteristics = productDetails.get(5);
		product.price = Double.valueOf(productDetails.get(6));
		return product;
	}

	public static String getProductDetailsForCSV(Product product) {
		String productDetailsForCSV = "\n";
		for (String detail : Arrays.asList(product.category,
				product.smallImage, product.bigImage, product.brand,
				product.model, product.characteristics,
				product.price.toString())) {
			productDetailsForCSV += detail.toString() + ",";
		}
		return productDetailsForCSV;
	}

	public static void saveProductToFile(Product product) {
		FileUtils.writeToFile(Constants.EXISTING_PRODUCTS_FILE_PATH,
				getProductDetailsForCSV(product), true);
	}

	// public Product() {
	// }
	//
	// public Product(String productCategory, String productSmallImage,
	// String productBigImage, String productBrand, String productModel,
	// String productCharacteristics, Double productPrice) {
	// category = productCategory;
	// this.smallImage = productSmallImage;
	// this.bigImage = productBigImage;
	// this.brand = productBrand;
	// this.model = productModel;
	// this.characteristics = productCharacteristics;
	// this.productPrice = productPrice;
	// }
}
