package com.evergent.corejava.nestedloops;

public class NestedloopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		for(int i=0;i<5;i++) {
			
			for(int j=1;j<=5;j++) {
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}

	}

}
