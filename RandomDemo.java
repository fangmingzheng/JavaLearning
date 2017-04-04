package com._520it.eclipse_01;

import java.util.Random;

//generate fake random number
public class RandomDemo {
	public static void main(String[] args){
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(100));//[0 100)
		
		
	}

}
