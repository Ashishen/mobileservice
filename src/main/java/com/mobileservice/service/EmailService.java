package com.mobileservice.service;

public class EmailService implements MobileAppService {

	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("Email sent to "+rec+ " with Message="+msg);
	}

}
