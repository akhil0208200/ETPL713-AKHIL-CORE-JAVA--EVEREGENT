package com.evergent.corejava.ExceptionHandling;
import java.util.*;
import java.io.*;
public class CompileTimeFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("C:\\Users\\akhil.akula\\Documents\\Hello And Wellcome.txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
         //File Not Found Exception
	}

}
