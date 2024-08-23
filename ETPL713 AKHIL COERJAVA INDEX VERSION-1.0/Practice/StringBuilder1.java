package com.evergent.corejava.Practice;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("HELLO");
		sb.append("World");
		System.out.println("After Append:"+sb);
		sb.insert(5, "Java");
		System.out.println("After Insert:"+sb);
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 4, "Welcome"));
		System.out.println(sb.length());

	}

}
