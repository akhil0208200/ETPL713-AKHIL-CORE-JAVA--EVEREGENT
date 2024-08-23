package com.evergent.corejava.JAVABEANS;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEno(100);
		e1.setEname("Raj");
		e1.setSal(55000);
         
		System.out.println("Employee no:"+e1.getEno());
		System.out.println("Employee Name:"+e1.getEname());
		System.out.println("Employee Salary:"+e1.getsSal());
	}

}
//setter method is initaializes and getter method methods are retriving 
//the values
