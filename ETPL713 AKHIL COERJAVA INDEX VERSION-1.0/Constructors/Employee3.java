package com.evergent.corejava.Constructors;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("Default Constructor");
	}
	Employee3(int eno1,String ename1,double sal1){
		this.eno=eno1;
		this.ename=ename1;
		this.sal=sal1;
	}
	public void display() {
		System.out.println("Employee no :"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee Salary:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		Employee3 emp3=new Employee3(123,"raj",55000);
		emp3.display();

	}

}
