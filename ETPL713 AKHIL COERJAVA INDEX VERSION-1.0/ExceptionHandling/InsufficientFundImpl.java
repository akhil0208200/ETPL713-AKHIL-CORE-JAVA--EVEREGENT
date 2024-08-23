package com.evergent.corejava.ExceptionHandling;

class InsufficientFundException extends Exception{
	public InsufficientFundException(String message) {
		System.out.println(message);
		//super(message);
	}
}

public class InsufficientFundImpl {
	//double balance=500.0;
	public static void CheckBal(int amount,double balance)throws InsufficientFundException {
		if(amount>balance) {
		throw	new InsufficientFundException("Insufficient Balance") ;
		}
		else System.out.println("You Have Sufficient Balance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CheckBal(1400,600);
		}
		catch(InsufficientFundException e) {
			e.printStackTrace();
		}

	}

}
