package com.selenium;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;


public class RequiredMethods {
	

	public String[] randomDateGenerator() {
		// generate random date in string
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, 0, 0);
		calendar.set(Calendar.DAY_OF_YEAR, new Random().nextInt() % 365);
		String d3 = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
		// cast the string to date format
		LocalDate d1 = LocalDate.parse(d3);
		// add one day to the start date
		LocalDate d2 = d1.plusDays(1);
		// change the format of the generated dates
		String sedt = (DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(d1));
		String rtw = (DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(d2));
		String[] result = new String[] { sedt, rtw };
		return result;
		
	}
	public String generateRandomPassword(int len) {
		String chars = "012345678910!@#$%^&*()QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm"
				+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()!)123456789010abcvnmfkgjlwotiudgjkjkkl";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}

	
}
