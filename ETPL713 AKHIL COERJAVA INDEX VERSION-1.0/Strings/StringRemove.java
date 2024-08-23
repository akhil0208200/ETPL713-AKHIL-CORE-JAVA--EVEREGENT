package com.evergent.corejava.Strings;

public class StringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="The brown fox Jumped over the lazy Dog";
		s1=s1.replaceAll(" ","");
		System.out.println(s1);

	}

}
//Replaces each substring of this string that matches 
//the given regular expression with thegiven replacement