package Application9;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
public class Controller {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Service service=new Service();
		String dname;
		String dconcept;
		int dtime;
		Scanner sc=new Scanner(System.in);
		int ch = 1;
		int input=0;
		while(ch!=0) {
			System.out.println("------------Wellcome to Java Training Session----------------");
			System.out.println("1.Enter Details Regarding Training");
			System.out.println("2.Enter Day Name To Find Concept");
			System.out.println("3.Show All Tarining Details");
			System.out.println("4.Enter Day Name to Update Concept");
			System.out.println("Enter Your Choice:");
			input =sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("Please Enter The Day Name:");
				dname=sc.next();
				System.out.println("Enter The Concept:");
				dconcept=sc.next();
				System.out.println("Enter Time :");
				dtime=sc.nextInt();
				int updateCount=service.create(dname,dconcept,dtime);
				System.out.println("Details Uploaded Sucessfully:"+updateCount);
				break;
			case 2:
				try
				{
				System.out.println("Enter your DayName to find concept");
				String name=sc.next();
				String concept=service.showConcept(name);
				System.out.println("Concept Name on : "+name+" is "+concept);
				}catch(Exception e){e.printStackTrace();}
				break;
				
			case 3:
				System.out.println("Display All Details Of Training");
			      try {
			    	  service.showD();
			      }catch(Exception e) {
			    	 System.out.println(e);
			      }
				
				break;
			case 4:
				System.out.println("Enter Day name :");
				String name=sc.next();
				System.out.println("Enter Concept Name:");
				String concept=sc.next();
				int updateCount1=service.change(name,concept);
				System.out.println("Details Uploaded Sucessfully:"+updateCount1);
			    break;
			default:
				System.out.println("Enter Valid Input");
				break;
				}
			}

		}

	}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
/*
 * Connection con=DBConnection.getConnection();
			   Statement stmt=con.createStatement();
				ResultSet rs1=stmt.executeQuery("Select * from DB");
				while(rs1.next()){
		            System.out.print("\nDay Name :" + rs1.getString(1));
		        	System.out.print("\t\tDay Concept:" + rs1.getString(2));
		            System.out.print("\tDay Time :" + rs1.getInt(3));
				}
				System.out.println("\n\n");
 */				
 
