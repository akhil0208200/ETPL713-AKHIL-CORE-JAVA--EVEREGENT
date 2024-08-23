package com.evergent.corejava.ExceptionHandling;

public class StackOverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			recursiveMethod();
		}catch(StackOverflowError e) {
			System.out.println("Stack OverFlow Error:"+e.getMessage());
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
