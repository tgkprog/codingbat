package moh.academic.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Io {
	static {
		System.out.println("d3");
		//System.setProperty("log4j.debug", "true");
		//System.setProperty("log4j.config", "/u/w/w2nps/ApFiles/log4j.xml");
		//printCurrentFolderName();
		// LangUtils.sleep(3000);

	}

	public static void printCurrentFolderName() {
		try {
			java.io.File f = new File("./");
			System.err.println("Current Folder (-) :" + f.getAbsolutePath());
			f = f.getCanonicalFile();
			System.err.println("Canonical Folder :" + f);
		} catch (Exception e) {
			System.err.println("Error getting current folder ./ :" + e);
			e.printStackTrace(System.err);
		}
	}

	private static final Logger logger = Logger.getLogger(Io.class);
	
	public final static String NAME = "MOH";
	
	
	
	private Helper hlp = new Helper();
	
	// "/data/ddt/config/ma

	public static void main(String[] args) {
		logger.debug("started " );
		Io app = new Io();
		
		File f = app.saveFile("hi there \n at " + new java.util.Date(), "avi", "my.txt", false);
		//System.out.println("File saved " + f.getAbsolutePath());
		
		logger.info("File saved " + f.getAbsolutePath());

	}
	

	public File saveFile(String contents, String pathPre, String extn, boolean unique) {
		PrintWriter ps = null;

		File parent = hlp.getFolder();
		try {
			if (!parent.exists()) {
				parent.mkdirs();
			}
			File fileOut = null;
			if (unique) {
				fileOut = File.createTempFile(pathPre, extn, parent);
			} else {
				fileOut = new File(parent, pathPre + extn);
			}
			ps = new PrintWriter(fileOut);
			ps.write(contents);
			return fileOut;
		} catch (Exception e) {
			System.out.println("Error " + e + " pre " + pathPre);
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					System.out.println("Error close " + e2);

				}
			}
		}
		return null;
	}
	
	public File saveFile2(String contents, String pathPre, String extn, boolean unique) {
		PrintWriter ps = null;
		//try with res
		File parent = hlp.getFolder();
		try {
			if (!parent.exists()) {
				parent.mkdirs();
			}
			File fileOut = null;
			if (unique) {
				fileOut = File.createTempFile(pathPre, extn, parent);
			} else {
				fileOut = new File(parent, pathPre + extn);
			}
			ps = new PrintWriter(fileOut);
			ps.write(contents);
			return fileOut;
		} catch (Exception e) {
			System.out.println("Error " + e + " pre " + pathPre);
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					System.out.println("Error close " + e2);

				}
			}
		}
		return null;
	}

	// File saved /apps/dat/w43w/2014/17/25/avimy.txt

	

}
