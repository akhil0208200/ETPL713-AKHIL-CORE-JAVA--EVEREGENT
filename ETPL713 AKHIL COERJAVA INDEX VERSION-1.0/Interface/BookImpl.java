package com.evergent.corejava.Interface;

public class BookImpl implements Book 
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
		BookImpl b1=new BookImpl();
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTittle();
		b1.show();

	}

}
