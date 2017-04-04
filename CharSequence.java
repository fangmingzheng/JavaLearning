package com._520it.eclipse_01;

public class CharSequence {
	public static void main(String[] args){
		testString();
		testStringBuilder();
		testStringBuffer();
		
	}
	private static void testString(){
		long begin = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 30000;i++) {
			str += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
	
	private static void testStringBuilder(){
		long begin = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder ("");
		for (int i = 0; i < 30000; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
	private static void testStringBuffer(){
		long begin = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer ("");
		for (int i = 0; i < 30000; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	
}
}
