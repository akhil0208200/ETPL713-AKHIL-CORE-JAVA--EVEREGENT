package com.evergent.corejava.Strings;

public class StringAscii2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			s1=s1+ch;
		}
		System.out.println(s1);
	}

}
