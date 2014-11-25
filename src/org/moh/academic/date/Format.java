package org.moh.academic.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Format {

	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.US);
			String strDate = "5 Nov 2010";
			Date dt = sdf.parse(strDate);
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMM yy", Locale.US);

			System.out.println(sdf2.format(dt));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
