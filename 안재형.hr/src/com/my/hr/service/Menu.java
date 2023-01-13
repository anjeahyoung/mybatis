package com.my.hr.service;

public enum Menu {
	EXIT, LIST, ADD, FIX, DEL;
	
	public static final Menu valueOf(int ordinal) {
		return values()[ordinal];
	}
}
