package tools;

import java.text.DecimalFormat;

public class MathUtils {

	public static String getDoubleValueWithTwoDigits(String number) {
		DecimalFormat twoFiguresFormat = new DecimalFormat("##0.00");
		return twoFiguresFormat.format(Double.valueOf(number));
	}

}
