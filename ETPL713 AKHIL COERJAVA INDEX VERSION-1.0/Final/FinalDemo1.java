package com.evergent.corejava.Final;

public class FinalDemo1 {
	final String cname="India";
	public void myData() {
		//cname="Demo";
		//The final field FinalDemo1.cname cannot be assigned
		System.out.println("Name :"+cname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo1 fd1=new FinalDemo1();
		fd1.myData();

	}

}
