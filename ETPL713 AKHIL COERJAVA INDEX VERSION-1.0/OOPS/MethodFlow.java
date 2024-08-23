package com.evergent.corejava.OOPS;

public class MethodFlow {
	public void show() {
		System.out.println("No Parameters and No Return types");
	}
	public void mydata(int a,int b) {
		System.out.println(a+b);
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int data() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow m=new MethodFlow();
		m.show();
		m.mydata(20, 30);
		int t=m.mul(5,5);
		System.out.println(t);
		int k=m.data();
		System.out.println(k);

	}

}
