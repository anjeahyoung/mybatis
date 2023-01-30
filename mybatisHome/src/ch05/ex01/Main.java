package ch05.ex01;

import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUsers(new Search("john", null));
		
		System.out.println(user);
	}
}
