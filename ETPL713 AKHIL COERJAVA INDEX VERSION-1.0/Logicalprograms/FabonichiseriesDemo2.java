package com.evergent.corejava.Logicalprograms;

public class FabonichiseriesDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2); //printing n1 and n2 with Default values
		for(int i=2;i<n;i++) {
			n3=n1+n2;  //adding n1 and n2 in n3
			System.out.print(" "+n3);//printing n3
			n1=n2; //keping n2 val in n1
			n2=n3; // keeping n3 val in n3
		}

	}

}
