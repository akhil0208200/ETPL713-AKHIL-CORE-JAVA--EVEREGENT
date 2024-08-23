package com.evergent.corejava.Practice;

class Q{
	public Q() {
		System.out.println("Class Q"); 
	}
	public void Show() {
		System.out.println("Show Method");
	}
}

public class P  extends Q{
	public P() {
		System.out.println("P class Constructor");
	}
	public void display() {
		System.out.println("Display Method");
	}
	public static void main(String[] args) {
		P p=new P();
		p.display();
		p.Show();
	}
}

