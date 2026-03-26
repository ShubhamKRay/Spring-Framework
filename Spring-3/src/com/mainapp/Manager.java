package com.mainapp;

import java.util.Scanner;

public class Manager {
	
	static {
		System.out.println("MNG BEAN LOADING");
	}
	
	public Manager() {
		System.out.println("MNG BEAN INSTANTIATED");
	}

	public String permission() {
		System.out.println("MNG TESTED........");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENTRY KEY");
		
		int key = scanner.nextInt();
		
		if(key==1111) {
			return "GRANTED";
		}else {
			return "NOT_GRANTED";
		}
	}
}
