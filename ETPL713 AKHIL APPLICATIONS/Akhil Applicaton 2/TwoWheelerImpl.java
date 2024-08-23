package com.corejava.evergent.akhilapplication4;

abstract public class TwoWheelerImpl implements Commontwoandfour{
	String name;
	String color;
    static {
    	System.out.println("Information Related to two and Four Wheelers ");
    }
    public TwoWheelerImpl() {
    	
    }
	abstract public void milleage();
	
	public void brand(String name) {
		this.name=name;
		System.out.println("Name:"+name);
	}
	public void color(String color) {
		this.color=color;
		System.out.println("Color:"+color);
	}

}