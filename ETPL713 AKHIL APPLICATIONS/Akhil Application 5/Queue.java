package com.corejava.evergent.akhilapplication5;

public interface Queue {
	public void addTicket(String ticket) ;
	public void processNextTicket();
	public void peekNextTicket();
	public void displayQueue();

}
