package moh.academic.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Helper {
	private static final Logger logger = Logger.getLogger(Helper.class);
	final private SimpleDateFormat sf = new SimpleDateFormat("/yyyy/mm/dd");

	private Properties props = null;
	
	Helper(){
		loadMyProps() ;
	}
	
	private  void loadMyProps() {
		//InputStream is = null;
		props = new Properties();
		try (InputStream is = new BufferedInputStream
				(Io.class.getResourceAsStream("props.txt"));){
			
			props.load(is);
		} catch(Exception e) {
			logger.warn("Load res ex " + e, e);
		}
		
	}
	
	 File getFolder() {
		String pid = "w43w";
		Date dt = new Date();

		String datePart = sf.format(dt);
		String root = props.getProperty("rootSavePath", "/apps/dat/");
		File parent = new File(root + pid + datePart);
		logger.debug("Msg parent " + parent);
		return parent;
	}
}
