package com.corejava.evergent.akhilapplication5;

import java.util.*;
public class SupportTicketSystem {

	public static void main(String[] args) {
		 ArrayDeQue a=new ArrayDeQue();
		for(;;) {
	  System.out.println("1.Add Ticket 2.Remove Ticket 3.Retrive Ticket 4.Display All Tickets 5.exit");
	  System.out.println("Enter Your Option:");
	  Scanner sc=new Scanner(System.in);
	  String ticket=null;
	 
	  String s1=sc.next();
	  
	  switch(s1) {
	  case "1":
		  System.out.println("Enter your Ticket for ipl match:");
		  ticket=sc.next();
		  a.addTicket(ticket);
		  break;
	  case "2":
		  System.out.println("Delete Ticket");
		  a.processNextTicket();
		  break;
	  case "3":
		  System.out.println("Check the top ticket");
		  a.peekNextTicket();
		  break;
	  case "4":
		  
		  System.out.println("Display all tickets");
		  a.displayQueue();
		  break;
		  
	  case "5":
		  System.exit(0);
		  break;
	 default:
			  System.out.println("Invalid Input");
			  break;
	  }
	  

	}
	}

}

