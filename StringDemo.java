package com._520it.eclipse_01;

public class StringDemo {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	// get files named started with hello and take it .name
	private static void test1() {
		String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		String[] names = fileNames.split(";");
		for (String name : names) {
			if (name.startsWith("hello")) {
				int index = name.lastIndexOf(".");
				System.out.println(index);
				String newname = name.substring(index);
				System.out.println(newname);
			}

		}

	}

	// Capitalize first letter
	private static void test2() {
		String str = "abcdefg";
		String letter = str.substring(0, 1).toUpperCase();
		System.out.println(letter);
		String rest = str.substring(1);
		System.out.println(letter + rest);

	}

	// judge whether the string is null or not
	private static void test3() {
		String str1 = "";
		String str2 = " ";
		String str3 = null;
		String str4 = " A C ";

		String str = " ";
		// trim() delete pre,middle, and post blank space.
		if (str != null && !"".equals(str.trim())) {
			System.out.println("Not null");
		} else {
			System.out.println("is null");
		}
		System.out.println("...............");
		System.out.println(hasLength(str1));
		System.out.println(hasLength(str2));
		System.out.println(hasLength(str3));
		System.out.println(hasLength(str4));
		System.out.println(isBlank(str));

	}

	private static boolean hasLength(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		}
		return false;
		//return str != null && !"".equals(str.trim())

	}
	
	private static boolean isBlank(String str){
		return !hasLength(str);
	}

}
