package com.evergent.corejava.Abstract;

public class ProductImpl2 extends Product{
	
	public void newProduct() {
		System.out.println("My New Products");
	}
      
	public void show() {
		System.out.println("Local Show Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl2 p1=new ProductImpl2();
		p1.show();
		p1.newProduct();
		p1.allProduct();

	}

}
//if any class extends abstract class then all methods of abstract class
//should override otherwise that class will compiler time error
