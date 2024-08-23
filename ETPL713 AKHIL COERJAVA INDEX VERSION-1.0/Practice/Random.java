package com.evergent.corejava.Practice;
class MyEmployee{
	int eno;
	public MyEmployee(int eno){
		this.eno=eno;
		//System.out.println("Eno:"+eno);
	}
	public void show() {
		System.out.println("Eno:"+eno);
	}
}

public class Random extends MyEmployee{
	int eno;
	String name;
	String add;
	Random(int eno,String name,String add){
		super(eno);
		this.name=name;
		this.add=add;
	}
	public void show() {
		super.show();
		
		//System.out.println("Eno:"+eno);
		System.out.println("Name;"+name);
		System.out.println("Address:"+add);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Random();
		Random r=new Random(22,"Raju","Hyd");
		r.show();

	}

}
