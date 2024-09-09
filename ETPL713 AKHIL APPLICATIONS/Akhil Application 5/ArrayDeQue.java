package com.corejava.evergent.akhilapplication5;

import java.util.ArrayDeque;
import java.util.*;
public class ArrayDeQue implements Queue{
	
	
	ArrayDeque<String> ticketQueue=new ArrayDeque<String>();
	
	public void addTicket(String ticket) {
		
		ticketQueue.add(ticket);
		
	}
	public void processNextTicket() {
		
		if(ticketQueue.size()>0) {
			System.out.println("Deleted Ticket:"+ticketQueue.poll());
		}else System.out.println("Queue is Empty");
		
	}
	public void peekNextTicket() {
		
		if(ticketQueue.size()!=0) {
			System.out.println("First Ticket in the List:"+ticketQueue.peek());
		}else System.out.println("Nothing to show");
		
	}
	public void displayQueue() {
		
		if(ticketQueue.size()>0)
			System.out.println(ticketQueue);
		else {
			System.out.println("Queue is Empty");
		}
		
	}

}

