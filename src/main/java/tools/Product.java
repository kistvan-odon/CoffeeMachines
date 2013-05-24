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
		product.smallImage = Constants.PRODUCT_IMAGES_FOLDER
				+ RandomGenerators.getRandomString("smallImage") + "."
				+ Constants.PRODUCT_IMAGE_TYPE;
		RandomGenerators.createRandomImage(product.smallImage, 175, 175, 10);
		product.bigImage = Constants.PRODUCT_IMAGES_FOLDER
				+ RandomGenerators.getRandomString("bigImage") + "."
				+ Constants.PRODUCT_IMAGE_TYPE;
		RandomGenerators.createRandomImage(product.bigImage, 450, 500, 10);
		product.brand = RandomGenerators.getRandomString("brand");
		product.model = RandomGenerators.getRandomString("model");
		product.characteristics = RandomGenerators
				.getRandomString("characteristics");
		product.price = MathUtils
				.getDoubleWithTwoDigits(RandomGenerators.random.nextDouble()
						* Constants.MAX_PRODUCT_PRICE);
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
}
