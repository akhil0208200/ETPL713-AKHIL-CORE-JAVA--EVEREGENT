package com.evergent.corejava.CollectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Hello");
		al.add(3.5);
		al.add(100);
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
