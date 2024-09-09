package com.corejava.evergent.studentapplication6;
import java.util.*;
public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid;
		String sname=null;
		float marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		sid=sc.nextInt();
		System.out.println("Enter Student Name:");
		sname=sc.next();
		System.out.println("Enter student marks:");
		marks=sc.nextFloat();
		StudentService s=new StudentService();
		int updatecount=s.addStudentService(sid, sname, marks);
		System.out.println("Data Inserted :"+updatecount);

	}

}
