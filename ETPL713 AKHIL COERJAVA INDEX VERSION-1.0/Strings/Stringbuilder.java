package com.evergent.corejava.Strings;

public class Stringbuilder {

	public static void main(String[] args) {
		// Constructs a string builder initialized to the contents of thespecified string. 
		//The initial capacity of the string builder is 16 plus the length of the string argument.
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("world");
		System.out.println("After Append :"+sb);
		sb.insert(6, "Beautiful");
		System.out.println("After Insert :"+sb);
		sb.replace(0, 5, "hi");
		System.out.println("After Replace :"+sb);
		sb.delete(0, 3);
		System.out.println("After Delete :"+sb);
		//sb.reverse();
		System.out.println("After Reverse :"+sb.reverse());
		System.out.println(sb.length());
	}

}
