package com.evergent.corejava.CollectionsFramework;
import java.util.*;
import java.util.Iterator;

public class CF6_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		al.add("ram");
		al.add("ravi");
		al.add("balu");
		al.add("bhanu");
		
		ListIterator li=al.listIterator();
		li.add("welcome");
		while(li.hasNext()) {
			String s=(String)li.next();
			System.out.println(s);
			if(s.equals("balu")) {
				li.remove();
			}
		}
			while(li.hasPrevious()) {
				System.out.println(li.previous());
			}
		}

	}


