package com.evergent.corejava.Interface;

public class BookImpl3 implements Book ,NewBook
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
	public void addNewBook() {
		System.out.println("Multiple inheritance");
	}
	public void myDataInfo() {
		System.out.println("We can override the Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl3 b1=new BookImpl3();
		b1.addNewBook();
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTittle();
		b1.show();

	}

}
