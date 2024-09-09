package com.corejava.everegent.akhilapplication3;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			KidUser k = new KidUser();
			k.registerAccount(10);
			k.requestBook("kids");
			k.registerAccount(18);
			k.requestBook("Fiction");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			AdultUser a = new AdultUser();
			a.registerAccount(23);
			a.requestBook("Fiction");
			a.registerAccount(5);

			a.requestBook("kids");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
