package com.evergent.corejava.ExceptionHandling;
//User  Defined Exception 

class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello"+message);
	}

}

public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100)
	 throw		new ProductNotFoundException("This product is not There ");
		else
			System.out.println("Product is there");
	}

	public static void main(String[] args) {
		try {
			ProductImpl p=new ProductImpl();
			p.myData();
		}
		catch(Exception e) {
			System.out.println("I can Handle:"+e);
		}

	}

}
