package com.evergent.corejava.CollectionsFramework;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		set.add(100);
		set.add("Hello");
		set.add(3.5);
		set.add(100);
		System.out.println(set);
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
