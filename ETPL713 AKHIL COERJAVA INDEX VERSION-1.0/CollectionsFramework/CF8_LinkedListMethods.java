package com.evergent.corejava.CollectionsFramework;
import java.util.*;
public class CF8_LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		
		l.add("Apple");
		l.add("Banana");
		l.add("Cherry");
		l.add("Data");
		System.out.println("Initail Linked List:"+l);
		l.addFirst("Mango");
		System.out.println("After adding First Element:"+l);
		l.addLast("Orange");
		System.out.println("After Adding Last Element :"+l);
		System.out.println(l.get(2));
		l.remove("Banana");
		System.out.println("After removing the element:"+l);
		l.removeFirst();
		System.out.println("After removing the First Elemen:"+l);
		l.removeLast();
		System.out.println("After removing the Last Elemen:"+l);
		l.contains("Cherry");
		System.out.println(l.size());
		l.clear();

	}

}
