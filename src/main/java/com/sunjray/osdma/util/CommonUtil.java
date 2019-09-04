package com.sunjray.osdma.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;

@SuppressWarnings("restriction")
public class CommonUtil {
	
	public static final DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

	public static String fetchTimeInMilliSeconds() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("NPT"));
		return String.valueOf(cal.getTimeInMillis());
	}

	public static File convertBS64ImgToFile(String profilePic, String path) {
		try {
			String imageFileName = path + "temp.png";
			File file = new File(imageFileName);
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] decodedBytes = decoder.decodeBuffer(profilePic);
			BufferedImage image = ImageIO.read(new ByteArrayInputStream(decodedBytes));
			ImageIO.write(image, "png", file);
			file.deleteOnExit();
			return file;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String checkNullValue(Object object) {
		if(object != null) {
			return object.toString();
		}
		return "";
	}
	
	
	public static String convertToDD_MM_YYYY(Object object) {
		if(object != null) {
			try {
				 return formatter.format(new SimpleDateFormat("yyyy-mm-dd").parse(object.toString()));
			} catch (ParseException e) {
				e.printStackTrace();
				return "";
			}
		}
		return "";
	}

}
