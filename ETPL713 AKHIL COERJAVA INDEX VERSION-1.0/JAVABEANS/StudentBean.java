package com.evergent.corejava.JAVABEANS;
import java.io.Serializable;

public class StudentBean implements Serializable{
private int sno;
private String sname;
private String address;
    public void setSno(int no) {
    	this.sno=sno;
    }
    public void setSname(String sname) {
    	this.sname=sname;
    }
    public void setSaddress(String address) {
    	this.address=address;
    }
    public String toString() {
    	return "student no:"+sno+"student name:"+sname+"student address:"+address;
    }
}
