package com.evergent.corejava.ExceptionHandling;

class InvalidScoreException extends Exception{
	public InvalidScoreException(String message) {
		super(message);
	}
}

public class UserDefinedException {
	
	public  static void scoreB(int score) throws InvalidScoreException{
		if(score>0 || score <100) {
		throw	new InvalidScoreException("Score Should be between 0 and 100");
		}else System.out.println("Score is good");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			scoreB(20);
		}catch(InvalidScoreException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
