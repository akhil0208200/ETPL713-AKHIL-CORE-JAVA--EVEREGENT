package com.corejava.evergent.studentapplication6;
import java.util.*;
public class StudentDAO {
	public int add(StudentBean sb) {
		try {
			ArrayList al=new ArrayList();
			al.add(sb.getSid());
			al.add(sb.getSname());
			al.add(sb.getMarks());
			al.add(sb.getGrade());
			
			System.out.println(al);
			System.out.println("Student ID:"+sb.getSid());
			System.out.println("Student Name:"+sb.getSname());
			System.out.println("Student Marks:"+sb.getMarks());
			System.out.println("Student Grade:"+sb.getGrade());
		}catch(Exception e) {
			System.out.println(e);
		}
		return 1;
	}

}
