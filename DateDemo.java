package com._520it.eclipse_01;

public class DateDemo {
	public static void main(String[] args){
		java.util.Date date = new java.util.Date();
		System.out.println(date);//Tue Apr 04 19:02:40 EDT 2017
		long time =System.currentTimeMillis();
		date = new java.util.Date(time);
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.toLocaleString());
		
		
	}

}
