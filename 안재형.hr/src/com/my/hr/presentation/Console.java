package com.my.hr.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg + ": ");
	}
	
	static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
			do {
				Console.inMsg(msg);
				input = sc.nextLine();
				isGood = input.matches("[a-zA-Z가-힣]*");
				if(!isGood) Console.Err("문자가아닙니다.");
			}while(!isGood);
			
			return input;
	}
	
	static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.Err("숫자가 아닙니다.");
		}while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static void Err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}
