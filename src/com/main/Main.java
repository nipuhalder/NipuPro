package com.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(Math.abs(-0.54));
		
		//test_pattern();
		
	}
	
	private static void test_pattern()
	{
		String s100 = "[sd] [dfdf]JOE]Some message [dsd[text] here";
	      
	       // Pattern p3 = Pattern.compile("\\[(.*?)\\]");
	        	        
	        Pattern p4 = Pattern.compile("\\[(.*?)\\]");

	       // Matcher m3 = p3.matcher(s100);
	        Matcher m4 = p4.matcher(s100);
	        while (m4.find()) {
	           System.out.println(m4.group(1));
	        }
	}
	
	private void date_format()
	{
		String current_date_check = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
		System.out.println("Nitul".substring(1));
		System.out.println(Integer.parseInt(current_date_check) -1 );
	}

}
