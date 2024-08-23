package com.evergent.corejava.Strings;

public final class PersonImmutable {
	private final String name;
	private final int age;
	//constructor to initialize final variable/Feilds
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
