package com._520it.eclipse_01;

public class StringBuilderDemo {
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder(16);
		sb1.append("A").append("B");
		System.out.println(sb1);
		String str = "ABCDEFG";
		String newstr = new StringBuilder (str).deleteCharAt(str.length()-1).toString();
		System.out.println(newstr);
		System.out.println(new StringBuilder("ABCDEFG").reverse());
	}
	

}
