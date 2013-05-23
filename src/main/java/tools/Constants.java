package tools;

import java.util.Arrays;
import java.util.List;

public class Constants {

	public static final String BASE_URL = "http://localhost/coffeemachines/";
	public static final String ADMIN_USER = "Kis";

	// Menu entries
	public static final String AUTOMATE_NOI = "Automate noi";
	public static final String AUTOMATE_SECOND_HAND = "Automate s-h";
	public static final String CAFEA = "Cafea";
	public static final String INSTANT = "Instant";
	public static final String SERVICII = "Servicii";
	public static final String SISTEME_DE_PLATA = "Sisteme de plata";

	public static final List<String> PRODUCT_CATEGORIES = Arrays.asList(
			AUTOMATE_NOI, AUTOMATE_SECOND_HAND, CAFEA, INSTANT, SERVICII,
			SISTEME_DE_PLATA);

	public static final Integer MAX_PRODUCT_PRICE = 10000;

	public static final String EXISTING_PRODUCTS_FILE_PATH = FileUtils
			.getProjectPath()
			+ "\\src\\test\\java\\resources\\testdata\\ProductsList.txt";
	public static final String PRODUCT_IMAGES_FOLDER = FileUtils
			.getProjectPath()
			+ "\\src\\test\\java\\resources\\testdata\\productimages\\";
	public static final String PRODUCT_IMAGE_TYPE = "jpg";
}
