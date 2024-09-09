package com.corejava.everegent.akhilapplication3;
 
public class AdultUser  implements LibraryUser{
	int age;
	String btype;
	
	
	public void registerAccount(int age)throws InvalidAge {
		this.age=age;
		if(age>12) {
		System.out.println("You have successfully registered under an Adult Account");
		}else {
			throw   new InvalidAge("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook(String btype)throws InvalidBookType {
		this.btype=btype;
		if(btype=="Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else {
		throw	new InvalidBookType("Oops, you are allowed to take only adult Fiction books");
		}
	}

}
