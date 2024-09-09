package com.corejava.evergent.akhilapplication4;

import java.util.*;

public class WeekDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Week w = new DayImpl();
		for (;;) {
			
			System.out.println("1.ADD DAY  2.DayName to find Concept  3.Test 4.DisplayAll details 5.exit");
			System.out.println("Select The  Option:");
			String input = sc.next();
			switch (input) {

			case "1":
				System.out.println("Enter the Day:");
				String dname = sc.next();
				System.out.println("Enter the  concept:");
				String concept = sc.next();
				System.out.println("Enter The Duration:");
				int time = sc.nextInt();
				Days day = new Days();
				day.setDname(dname);
				day.setConcept(concept);
				day.setTime(time);
				

				break;
			case "2":
				System.out.println("Enter Day Name");
				String dname1 = sc.next();
				w.search(dname1);

				break;
			case "3":
				w.Test();

				break;
			case "4":
				w.displayAll();
				break;

			case "5":
				System.exit(0);
			}

		}

	}

}
