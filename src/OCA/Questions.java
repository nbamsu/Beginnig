package OCA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Questions {

	public static void main(String[] args) {
		// What is the result if the integer aVar is 9?
		int aVar = 9;

		if (aVar++ < 10) {
			//System.out.println(aVar + " Hello World!");
		} else {
			//System.out.println(aVar + " Hello Universe!");
		}
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);

	}
}
