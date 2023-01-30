package ch04.ex02;

import config.Configuration;

public class Main {
	public static void main(String[] arg) {
		Map mapper = Configuration.getMapper(Map.class);
		
		mapper.selectUsers().forEach(System.out::println);
	}
}
