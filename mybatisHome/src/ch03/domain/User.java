package ch03.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

import oracle.net.jdbc.TNSAddress.Address;

@Alias("myUser")
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	private Address address;
	
	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}
