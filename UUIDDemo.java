package com._520it.eclipse_01;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args){
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
}
//random unique string, 128bytes
