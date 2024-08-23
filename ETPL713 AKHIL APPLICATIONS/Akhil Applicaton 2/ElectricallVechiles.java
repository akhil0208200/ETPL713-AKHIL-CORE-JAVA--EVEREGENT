package com.corejava.evergent.akhilapplication4;

public class ElectricallVechiles {
	
		String vname;
		String color;
		int speed;
		
		public ElectricallVechiles(String vname,String color,int speed) {
			this.vname=vname;
			this.color=color;
			this.speed=speed;
		}
		public void display() {
			System.out.println("Vechile Name:"+vname);
	        System.out.println("Vechile Color:"+color);
	        System.out.println("Vechile Speed:"+speed);
		}


}
