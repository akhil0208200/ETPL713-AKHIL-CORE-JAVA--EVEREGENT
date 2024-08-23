package com.evergent.corejava.CollectionsFramework;
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		set.add("Hello");
		set.add("Welcome");
		set.add("to");
		set.add("java");
		set.add("hello");
		set.add("Hello");
		System.out.println(set);
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
