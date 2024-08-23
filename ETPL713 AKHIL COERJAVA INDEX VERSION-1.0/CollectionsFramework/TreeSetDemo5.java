package com.evergent.corejava.CollectionsFramework;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set=new TreeSet();
		set.add(100);
		set.add(10);
		set.add(35);
		set.add(1);
		System.out.println(set);
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
