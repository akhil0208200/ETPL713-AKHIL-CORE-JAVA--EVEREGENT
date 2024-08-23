package com.evergent.corejava.Strings;

public class SplitDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java is a powerfull language";
		String arr[]=s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//for each loop
		for(String i:arr) {
			System.out.println(i);
		}

	}

}
