package com.evergent.corejava.Logicalprograms;
import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Days=sc.next();
		switch(Days){
		case "M":
			System.out.println("Monday");
			break;
		case "T":
			System.out.println("Tuesday");
			break;
		case "W":
			System.out.println("Thursday");
			break;
		case "Th":	
			System.out.println("Thursday");
			break;
		case "F":
			System.out.println("Friday");
			break;
		case "S":
			System.out.println("Saturday");
			break;
		}
		

	}

}
