package com.evergent.corejava.Constructors;
class MyEmployee{
	int eno;
public MyEmployee() {
		
	}
	MyEmployee(int eno){
		System.out.println("Emplyee No in Super Class:"+eno);
	}
}

public class Employee6 extends MyEmployee {
	int eno;
	String ename;
	double sal;
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		//System.out.println("Employee no:"+eno);
		System.out.println("Employee ename:"+ename);
		System.out.println("Emplyee salary:"+sal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee6 emp6=new Employee6(123,"raj",50000);
		emp6.display();
		

	}

}
//Super is a keyword used to call the super class Constructors in subclass through 
//super keyword
