package com.evergent.corejava.OOPS;

public class Calculation {
	int a=10;
	int b=20;
	int c;
	public void Addition(){
		c=a+b;
		System.out.println(c);
	}
	public void Subtraction() {
		c=a-b;
		System.out.println(c);
	}
	public void Multiplication() {
		c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c=new Calculation();
		c.Addition();
		c.Subtraction();
		c.Multiplication();
		

	}

}
