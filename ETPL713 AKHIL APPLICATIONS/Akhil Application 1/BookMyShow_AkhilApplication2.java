package com.corejava.evergent.akhilapplicatuons2;
import java.io.IOException;
import java.util.Scanner;

public class BookMyShow_AkhilApplication2 {

	enum module1 {
		B,P,R,E
		};
	enum mainmodule{
		K,Sal
		};
	enum submodule1 {
		F,R,S,M
		};
	enum submodule2  {
		T,P,M
		};
	enum submodule3  {
		I,S,M
		};
	enum menucode  {
		A,B,C
		};
	
	static int ticketprice;
	static int amount;
	static int tickets;
	static int amountdisc;
	static int itemcost;
	public static void main(String[] args) throws IOException {
		  String input= null;
		
		  Scanner br =new Scanner(System.in);
	    
	    System.out.println("\n\t\t \t\t Welcome To Movie World");
	    
		while(true)
		{
	
	  
		System.out.println("======================");
		System.out.println(" Booking ");
		System.out.println("======================");
		System.out.println("B-BOOK YOUR TICKET");
		System.out.println("P-Payment ");
		System.out.println("R-Report");
		System.out.println("E-Quit ");
		System.out.println("======================");
	    System.out.println("Enter your Module code (B,P,R,E) : ");


input=br.nextLine();
System.out.println("You entered module is  : " );   

switch(module1.valueOf(input))
{

case B:
	System.out.println(" Book our Tickets");
	System.out.println("======================");
	System.out.println("K-KALKI");
	System.out.println("Sal-Salaar");
	System.out.println("======================");
	System.out.println("Enter your Movie Name (K,Sal) : ");
	
	input=br.nextLine();
	switch(mainmodule.valueOf(input)) {
	
	case K:
	   System.out.println(" Kalki-Movie");
	   System.out.println("======================");
	   System.out.println("F-Sudharshan Theator");
	   System.out.println("R-Sandhya Theator");
	   System.out.println("S-to place Oder for Food");
	   System.out.println("M-Return to Main Menu");
	   System.out.println("======================");
	   System.out.println("Enter your Module code (F,R,S,M) : ");

		input=br.nextLine();
	switch(submodule1.valueOf(input))
	{

	case F:
		
		
		System.out.println("Menu \t Description  \t Charge per head ");
		System.out.println("===============================================");
		System.out.println("A \t Balcony\t RM150.00");
		System.out.println("");
		System.out.println("B \t Middle Class\t RM100.00");
		System.out.println("");
		System.out.println("C \t Low Class \t RM50");
		System.out.println("===============================================");
		System.out.println("Enter your Menu code (A,B,C) : ");
		
		
		input=br.nextLine();
		
		
		switch(menucode.valueOf(input))
		{

		case A:
			ticketprice=150;
			break;
		case B:
			ticketprice=100;
			break;
		case C:
		   ticketprice=50;
		}
		
		
		
		System.out.println("Enter the number of TICKETS");
		
		tickets =Integer.parseInt( br.nextLine());
		System.out.println("you selected no of TICKETSB"
				+ " are "+tickets);
		 amount=ticketprice*tickets;
		
		System.out.println("Amount for TICKETS before discount is Rs"+amount);
			
		
	break;
	case R:
		
		
		System.out.println("Menu \t Description  \t Charge per head ");
		System.out.println("===============================================");
		System.out.println("A \t Balcony\t RM200.00");
		System.out.println("");
		System.out.println("B \t Middle Class\t RM150.00");
		System.out.println("");
		System.out.println("C \t Low Class \t Rms:100");
		System.out.println("===============================================");
		System.out.println("Enter your Menu code (A,B,C) : ");
		
		
		input=br.nextLine();
		
		
		switch(menucode.valueOf(input))
		{

		case A:
			ticketprice=200;
			break;
		case B:
			ticketprice=150;
			break;
		case C:
			ticketprice=100;
		}
		
		
		
		System.out.println("Enter the number of TICKETS");
		
		tickets =Integer.parseInt( br.nextLine());
		System.out.println("you selected no of tickets are "+tickets);
		 amount=ticketprice*tickets;
		
		System.out.println("Amount for ordered food before discount is Rs"+amount);	

		//System.out.println("Amount for ordered food after Discount for selected tickets is  Rs"+amountdisc);
	
	break;
    case S:
		
		System.out.println("Item \t Description  \t Charge per Unit ");
		System.out.println("========================================================================");
		System.out.println("1 \t COOL DRINKS \t 1-Thump's Up \t 2-Sprite \t   RM40");
		System.out.println("");
		System.out.println("2 \t Snacks-Egg Puff,pop Corn,Sweet Corn \t RM50.00 ");
		System.out.println("");
		System.out.println("3 \t Jumbo pop corn or Jumbo sweet corn  \t RM80.00 ");
		System.out.println("");
		System.out.println("4 \t Combo-Cool Drinks And Sanks \t RM120.00 ");
		System.out.println("========================================================================");
		System.out.println("Enter your Menu code (1,2,3,4) : ");
		
		input=br.nextLine();
		
		int i=Integer.parseInt(input);
		switch(i)
		{

		case 1:
			itemcost=40;
			break;
		case 2:
			itemcost=50;
			break;
		case 3:
			itemcost=80;
			break;
		case 4:
			itemcost=120;
			break;
		}
		
		System.out.println("Your Additional Cost : Rs "+itemcost);
		
		
	break;	
	}
	 break;

       
	
case Sal:
		   System.out.println(" Salaar Movie");
		   System.out.println("======================");
		   System.out.println("F-Sudharshan Theator");
		   System.out.println("R-Sandhya Theator");
		   System.out.println("S-to place Oder for Food");
		   System.out.println("M-Return to Main Menu");
		   System.out.println("======================");
		   System.out.println("Enter your Module code (F,R,S,M) : ");

			input=br.nextLine();
		switch(submodule1.valueOf(input))
		{

		case F:
			
			
			System.out.println("Menu \t Description  \t Charge per head ");
			System.out.println("===============================================");
			System.out.println("A \t Balcony\t RM150.00");
			System.out.println("");
			System.out.println("B \t Middle Class\t RM100.00");
			System.out.println("");
			System.out.println("C \t Low Class \t RM50");
			System.out.println("===============================================");
			System.out.println("Enter your Menu code (A,B,C) : ");
			
			
			input=br.nextLine();
			
			
			switch(menucode.valueOf(input))
			{

			case A:
				ticketprice=150;
				break;
			case B:
				ticketprice=100;
				break;
			case C:
				ticketprice=50;
			}
			
			
			
			System.out.println("Enter the number of Tickets");
			
			tickets =Integer.parseInt( br.nextLine());
			System.out.println("you selected no of Tickets are "+tickets);
			 amount=ticketprice*tickets;
			
			System.out.println("Amount for TICKETS before discount is Rs"+amount);			
			
		break;
		case R:
			
			
			System.out.println("Menu \t Description  \t Charge per head ");
			System.out.println("===============================================");
			System.out.println("A \t Balcony\t RM200.00");
			System.out.println("");
			System.out.println("B \t Middle Class\t RM150.00");
			System.out.println("");
			System.out.println("C \t Low Class \t Rms:100");
			System.out.println("===============================================");
			System.out.println("Enter your Menu code (A,B,C) : ");
			
			
			input=br.nextLine();
			
			
			switch(menucode.valueOf(input))
			{

			case A:
				ticketprice=200;
				break;
			case B:
				ticketprice=150;
				break;
			case C:
				ticketprice=100;
			}
			
			
			
			System.out.println("Enter the number of Tickets");
			
			tickets =Integer.parseInt( br.nextLine());
			System.out.println("you selected no of tickets are "+tickets);
			 amount=ticketprice*tickets;
			
			System.out.println("Amount for Movie Tickets before discount is Rs"+amount);	
			
			
		
		
	
      break;

case S:
	
	System.out.println("Item \t Description  \t Charge per Unit ");
	System.out.println("========================================================================");
	System.out.println("1 \t COOL DRINKS-Thump's Up,Sprite \t   RM40");
	System.out.println("");
	System.out.println("2 \t Snacks-Egg Puff,pop Corn,Sweet Corn \t RM50.00 ");
	System.out.println("");
	System.out.println("3 \t Jumbo pop corn or Jumbo sweet corn  \t RM80.00 ");
	System.out.println("");
	System.out.println("4 \t Combo-Cool Drinks And Sanks \t RM120.00 ");
	System.out.println("========================================================================");
	System.out.println("Enter your Menu code (1,2,3,4) : ");
	
	input=br.nextLine();
	
	int i=Integer.parseInt(input);
	switch(i)
	{

	case 1:
		itemcost=40;
		break;
	case 2:
		itemcost=50;
		break;
	case 3:
		itemcost=80;
		break;
	case 4:
		itemcost=120;
		break;
	}
	
	System.out.println("Your Additional Cost : Rs "+itemcost);
	
	
break;	
}
 break;
	}
	break;

//break;
 
case P:
	System.out.println(" Payment Module");
	System.out.println("======================");
	System.out.println("T-to display total amount to be paid");
	System.out.println("P-to make payment");
	System.out.println("M-Return to Main Menu");
	System.out.println("======================");
	System.out.println("Enter your Module code (T,P,M) : ");

	input=br.nextLine();
	switch(submodule2.valueOf(input))
	{

	case T:
		System.out.println("Total Amount to be Paid : Rs"+(amount+itemcost));
		
	break;
	case P:System.out.println("To Make Payment : Rs"+(amountdisc+itemcost));
	break;	
	}
	break;
	
			
case R:

System.out.println(" Payment Module");
System.out.println("======================");
System.out.println("I-to dispaly invoice for order mode");
System.out.println("S-to display the summary of orders and payments made");
System.out.println("M-Return to Main Menu");
System.out.println("======================");
System.out.println("Enter your Module code (I,S,M) : ");

	input=br.nextLine();
switch(submodule3.valueOf(input))
{

case I:
System.out.println("Invoice Display");
System.out.println("==================");
System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
System.out.println("you selected no of tickets are "+tickets);
System.out.println("To Make Payment : Rs"+(amountdisc+itemcost));

break;
case S:
	System.out.println("Summary Of Order");
System.out.println("======================");
System.out.println("you selected Movie Tickets cost Rs"+amount);
System.out.println("you selected no of tickets are "+tickets);

System.out.println("Your Additional Cost : Rs "+itemcost);
System.out.println("\n");
System.out.println("Total Amount to be Paid : Rs"+(amount+itemcost));

   input=br.nextLine();

int i=Integer.parseInt(input);
switch(i)
{

case 1:
	itemcost=40;
	break;
case 2:
	itemcost=50;
	break;
case 3:
	itemcost=80;
	break;
case 4:
	itemcost=120;
	break;
}

break;	
}
break;
case E:
System.out.println("Quit Module");
System.exit(0);
	break;

		
		}
		
		}
	}
}
