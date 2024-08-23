package com.evergent.corejava.WrapperClasses;
import java.util.ArrayList;
public class WrapperClassDemo4_ArraytList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		Integer i1=new Integer(a);
		ArrayList al=new ArrayList();
		al.add(i1);
		Integer i2=new Integer(200);
		al.add(i2);
		al.add(new Integer(45));
		System.out.println(al);
		System.out.println(al.get(1));
		 //jdk5
		ArrayList al1=new ArrayList();
		al1.add(100);
		System.out.println(al1.get(0));

	}

}
