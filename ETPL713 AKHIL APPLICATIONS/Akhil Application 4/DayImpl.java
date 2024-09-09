package com.corejava.evergent.akhilapplication4;

import java.util.*;
public class DayImpl implements Week{
	HashSet<Days> h=null;
	public DayImpl() {
		h=new HashSet<Days>();
		
	}
	public String addDay(Days d) {
		h.add(d);
		return d.getDname();
	}
	
	public void search(String dname) {
		boolean b=false;
		if(h.size()>0 && h!=null) {
			for(Days days:h) {
				if(days.getDname().equals(dname)) {
					System.out.println(days.getConcept()+" "+days.getTime());
					b=true;
					break;
				}
			}
		}
		if(!b) System.out.println("Inavlid Day You Entered");
	}
	public void Test() {
		if(h.size()>0) {
			for(Days days:h) {
			System.out.println("Test ");
			System.out.println(days.getConcept());
			}
		}
		else {
			System.out.println("No Test");
		}
		
	} 
	public void displayAll() {
		if(h.size()>0) {
			System.out.println("Details");
			for(Days days:h) {
				//System.out.println("Details");
				System.out.println(days.getDname()+" "+days.getConcept()+" "+days.getTime());
			}
		}else {
			System.out.println("Nothing to Display");
		}
	}
 
}
