package com.evergent.corejava.CollectionsFramework;
import java.util.*;
class Book{
	 String name;
	public Book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}

public class CF9_ArrayList_BookObject {

	public static void main(String[] args) {
		Book b1=new Book("Core Java");
		Book b2=new Book("Let Us C");
		Book b3=new Book("Java Index");
		Book b4=new Book("Java Interview Book");
		ArrayList al=new ArrayList();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		System.out.println(al);
		

	}

}
