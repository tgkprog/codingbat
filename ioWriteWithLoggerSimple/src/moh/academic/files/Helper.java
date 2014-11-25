package moh.academic.files;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Helper {
	private static final Logger logger = Logger.getLogger(Helper.class);
	final private SimpleDateFormat sf = new SimpleDateFormat("/yyyy/mm/dd");

	
	 File getFolder() {
		String pid = "w43w";
		Date dt = new Date();

		String datePart = sf.format(dt);
		File parent = new File("/apps/dat/" + pid + datePart);
		logger.debug("Msg parent " + parent);
		return parent;
	}
}
