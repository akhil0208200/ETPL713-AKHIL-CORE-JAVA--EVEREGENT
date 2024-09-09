package com.corejava.everegent.akhilapplication3;

public interface LibraryUser {
	public void registerAccount(int age)throws InvalidAge;
	public void requestBook(String btype)throws InvalidBookType;
	

}
