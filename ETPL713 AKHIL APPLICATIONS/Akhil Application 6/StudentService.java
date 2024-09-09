package com.corejava.evergent.studentapplication6;

public class StudentService {
	public int addStudentService(int sid,String sname,float marks) {
		String grade=null;
		if(marks <=30)
			grade="C";
		else if(marks <=60)
			grade="B";
		else
			grade="A";
		
		StudentDAO sd=new StudentDAO();
		StudentBean sb=new StudentBean();
		sb.setSid(sid);
		sb.setSname(sname);
		sb.setMarks(marks);
		sb.setGrade(grade);
		
		int updateresult=sd.add(sb);
		
		return 1;
	}

}
