package com.home.aop;

public class MessageCommunicator {

	Authenticator authenticator = new Authenticator();
	
	public void deliver(String message) {
		
		authenticator.Authenticate();
        System.out.println(message);
    }

    public void deliver(String person, String message) {
    	authenticator.Authenticate();
        System.out.println(person + ", " + message);
    }
    
}
