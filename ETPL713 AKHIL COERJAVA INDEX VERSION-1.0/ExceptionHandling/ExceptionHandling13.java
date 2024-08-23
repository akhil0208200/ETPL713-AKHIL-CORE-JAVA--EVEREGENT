package com.evergent.corejava.ExceptionHandling;

public class ExceptionHandling13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		try {
			System.out.println("Accessing Element:"+arr[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
