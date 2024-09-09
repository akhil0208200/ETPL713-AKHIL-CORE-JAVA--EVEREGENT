package com.corejava.everegent.akhilapplication3;

public class KidUser  implements LibraryUser{
	int age ;
	String btype;
	
	
	public void registerAccount(int age)throws InvalidAge {
		this.age=age;
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
		throw	new InvalidAge("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String btype) throws InvalidBookType{
		if(btype=="kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else {
		throw	new InvalidBookType("Oops, you are allowed to take only kids books");
		}
	}

}
