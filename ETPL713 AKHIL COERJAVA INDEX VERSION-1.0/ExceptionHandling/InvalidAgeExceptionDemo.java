package com.evergent.corejava.ExceptionHandling;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
//		System.out.println(message); 
		super(message);
	}
}

public class InvalidAgeExceptionDemo {
	public static void checkAge(int age) throws InvalidAgeException {
		if (age > 18) {
			throw new InvalidAgeException("Age Must be 18 or old");
		} else {
			System.out.println("Access Granted you are old Enough");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(19);

		} catch (InvalidAgeException e) {
			System.out.println("Caught the exception :" + e.getMessage());
			System.out.println(e);
		}
		System.out.println("wdfkjhsadkfhsakjdhf");
	}

}
