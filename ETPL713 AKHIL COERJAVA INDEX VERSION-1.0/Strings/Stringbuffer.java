package com.evergent.corejava.Strings;

public class Stringbuffer {

	public static void main(String[] args) {
		// A thread-safe, mutable sequence of characters.A string buffer is like a String,
		//but can be modified. At anypoint in time it contains some particular sequence of characters,
		//butthe length and content of the sequence can be changed through certainmethod calls. 
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("world");//Appends the specified string to this character sequence
		System.out.println("After Append :"+sb);
		sb.insert(6, "Beautiful");//Inserts the string into this character sequence
		System.out.println("After Insert :"+sb);
		sb.replace(0, 5, "hi");//Replaces the characters in a substring of this sequencewith characters in the specified String.
		System.out.println("After Replace :"+sb);
		sb.delete(0, 3);//Removes the characters in a substring of this sequence
		System.out.println("After Delete :"+sb);
		//sb.reverse();
		System.out.println("After Reverse :"+sb.reverse());
		//sb.capacity();
		System.out.println("Capacity of The Buffer:"+sb.capacity());
		//sb.length();
		System.out.println(sb.length());
	}

}
