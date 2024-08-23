package com.evergent.corejava.Practice;

 final class PersonImmutable {
   private final String name;
   private final int age;
   PersonImmutable(String name,int age){
	   this.name=name;
	   this.age=age;
   }
   public String myName() {
	   return name;
   }
   public int myAge() {
	   return age;
   }
}
public class Person{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable p=new PersonImmutable("Raju",30);
		System.out.println("Name:"+p.myName());
		System.out.println("Age:"+p.myAge());

	}

}
