package com._520it.eclipse_01;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws ParseException{
		Date d = new Date();
		System.out.println(d);
		DateFormat df = DateFormat.getInstance();
		String time = df.format(d);
		System.out.println(time);
		df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(df.format(d));
		//parse
		df = DateFormat.getInstance();
		time = df.format(d);
		Date d2 = df.parse(time);
		System.out.println(d2);;
		
		
		
		
		
	}

}
