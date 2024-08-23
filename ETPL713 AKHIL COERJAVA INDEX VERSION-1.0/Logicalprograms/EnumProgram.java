package com.evergent.corejava.Logicalprograms;
enum Color{
	RED,GREEN,YELLOW,PINK;
}
enum Days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
enum Names{
	Akhil,Sandeep,Satish,Guru,bhargav;
}


public class EnumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Names n=Names.Akhil;
		System.out.println(n);
		Color c=Color.RED;
		System.out.println(c);

	}

}
