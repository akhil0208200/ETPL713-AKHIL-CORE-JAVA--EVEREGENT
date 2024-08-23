package com.evergent.corejava.Strings;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		String s2="Java";
		if(s1==s2) System.out.println("True");
		else System.out.println("False");
		if(s1.equals(s2)) System.out.println("True");
		else System.out.println("False");

	}

}
// == it is a operator it checks for Memory Location it is possible only in 
//case of String pool without using new keyword
// equals() it is Method it checks for Content