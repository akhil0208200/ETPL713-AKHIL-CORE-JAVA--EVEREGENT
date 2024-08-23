package com.evergent.corejava.JAVABEANS;

import java.io.Serializable;

public class Product implements Serializable{
           private int pno;
           public Product(int pno, String pname, double price) {
		
			this.pno = pno;
			this.pname = pname;
			this.price = price;
		}

		private String pname;
           private double price;
           
           
            
		public int getPno() {
			return pno;
		}
		
		public String getPname() {
			return pname;
		}
		
		public double getPrice() {
			return price;
		}
		
		
}
