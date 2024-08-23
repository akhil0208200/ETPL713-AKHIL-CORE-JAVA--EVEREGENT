package com.evergent.corejava.OOPS;

class D {
         
	public void personInfo() {
		System.out.println("Rajesh");
	}
}
class PersonDetails extends D {
    
	public void persondata() {
		System.out.println("hyderabad");
	}
}

class MyPerson extends PersonDetails{
        
	public void show() {
		System.out.println("Rajesh");
	}
	 public static void main(String[] args) {
		 MyPerson mp=new MyPerson();
		 mp.personInfo();
		 mp.persondata();
		 mp.show();
		 
	 }
}

