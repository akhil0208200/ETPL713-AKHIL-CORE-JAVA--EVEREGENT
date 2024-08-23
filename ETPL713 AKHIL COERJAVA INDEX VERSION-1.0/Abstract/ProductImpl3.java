package com.evergent.corejava.Abstract;

public class ProductImpl3 extends Product3
{
	ProductImpl3(){
		System.out.println("Sub class Constructor");
	}
	public void newProduct() {
		System.out.println("My New Products");
	}
      
	public void show() {
		System.out.println("Local Show Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl3 p1=new ProductImpl3();
		p1.show();
		p1.newProduct();
		p1.allProducts();

	}

}
//Here we are Initializing the constructor in product3 abstract class
//by creating object to sub class it automatically executed 
//before the sub class constructor 

