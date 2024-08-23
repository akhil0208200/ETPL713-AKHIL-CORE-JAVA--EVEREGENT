package com.evergent.corejava.JAVABEANS;

public class ProductImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(100,"Laptop",50000);
		System.out.println("Product no:"+p.getPno());
		System.out.println("Product name:"+p.getPname());
		System.out.println("Product price:"+p.getPrice());

	}

}
//In this Program we are Passing the values via Constructos
//And retriving those Values via getter Methods
