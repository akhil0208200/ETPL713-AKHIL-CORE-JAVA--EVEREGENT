package com.evergent.corejava.Interface;

public class BookImpl2 implements Book 
{
	public void bookTittle() {
		System.out.println("Tittle : core java");
	}
	public void bookAuthor() {
		System.out.println("Author : Oracle");
	}
	public void bookPrice() {
		System.out.println("Price : 550");
	}
	public void show() {
		System.out.println("Local Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new BookImpl2();  //here we are taking the reference of the interface so it will only call 
		                        //only interface Methods local methods cannot be called
		b.bookAuthor();
		b.bookPrice();
		b.bookTittle();
		//b.show();  The method show() is undefined for the type Book

	}

}
