package com.corejava.evergent.akhilapplication4;

public class Implimentation extends TwoWheelerImpl implements Twowheeler,Fourwheeler{

	int speed;
	int price;
	int number;
	int milleage;
	String name;
	String color;
	String brand;
	public void tname(String vname) {
		this.name=vname;
	}
	public void speed(int vs) {
		this.speed=vs;
		
	}
	public void milleage(int no) {
		this.milleage=no;
	}
	public void priceofTwo(int p ) {
		this.price=p;
	}
    public void impl() {
    	System.out.println("Vechile name:"+name);
    	System.out.println("Vechile speed:"+speed);
    	System.out.println("Vechile Milleage:"+milleage);
    	System.out.println("Vechile Price :"+price);
    }
    public void fname(String name) {
    	this.name=name;
    	System.out.println("Vehile name:"+name);
    }
    public void automatic() {
    	System.out.println("This car is not Automatic car");
    }
	public void seeter(int number) {
		this.number=number;
		System.out.println("Number of Seaters:"+number);
	}
    public void priceofFour() {
    	System.out.println("Price of "+name+" is 4500000");
    }
    public void milleage() {
    	System.out.println("Milleage of "+name+ " is 15");
    }
    public void local() {
    	System.out.println("This is local Method");
    }
	
	public static void main(String[] args) {
		Implimentation m=new Implimentation();
		m.tname("BMW G310R");
		m.speed(150);
		m.milleage(25);
		m.priceofTwo(230000);
		
		m.brand("BMW");
		m.color("Black");
		m.impl();
		m.fname("BMW X3");
		m.automatic();
		m.seeter(5);
		m.priceofFour();
		m.milleage();
		m.local();
		ElectricallVechiles e=new ElectricallVechiles("Ola","White",80);
		e.display();
	}
	

}
