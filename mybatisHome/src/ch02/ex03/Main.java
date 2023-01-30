package ch02.ex03;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);

		/*
		if(mapper.insertUser(new User(11, "abel", LocalDate.of(2023, 1, 27))) > 0)
			System.out.println("성공11");
		
		if(mapper.insertUser2(12, "ajh", LocalDate.of(2023, 1, 27)) > 0)
			System.out.println("성공12");
		*/
	}
}
