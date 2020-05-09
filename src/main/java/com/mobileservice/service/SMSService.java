package com.mobileservice.service;

public class SMSService implements MobileAppService {

	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
	}

}
