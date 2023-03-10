package ch05.domain;

import java.time.LocalDate;
import java.util.List;

import ch04.domain.Post;

public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	private List<Post> posts;
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, posts);
	}
}
