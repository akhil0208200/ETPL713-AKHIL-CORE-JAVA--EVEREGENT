package com.evergent.corejava.CollectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;
public class CF10_ArrayList_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(10);
		al.add(200);
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
