package com.evergent.corejava.Abstract;

public class ProductImpl extends Product
{
	
	public void newProduct() {
		System.out.println("My New Products");
	}
      
	public void show() {
		System.out.println("Local Show Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new ProductImpl();
		//p1.show();    //The method show() is undefined for the type Product
		p1.newProduct();
		p1.allProduct();

	}

}
//here I am taking the abstract class reference to call abstract class
//methods
