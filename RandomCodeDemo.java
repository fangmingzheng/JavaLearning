package com._520it.eclipse_01;

import java.util.Random;
import java.util.UUID;

public class RandomCodeDemo {
	//generate random 5 character code
	public static void main (String[] args){
		String code = UUID.randomUUID().toString().substring(0,5);
		System.out.println(code);
		System.out.println("......................");
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str += str.toLowerCase();
		str += "0123456789";
		System.out.println(str);
		StringBuilder sb = new StringBuilder(5);
		for (int i = 0; i < 5; i++){
			//index between [ 0, str.length());
			char ch = str.charAt(new Random().nextInt(str.length()));
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
