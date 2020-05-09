package com.mobileservice;

import com.mobileservice.client.AppClientService;
import com.mobileservice.injector.EmailServiceInjector;
import com.mobileservice.injector.MobileAppServiceInjector;
import com.mobileservice.injector.SMSServiceInjector;

public class MobileServiceApplication {

	public static void main(String[] args) {
		String msg = "Hi Ashish";
		String email = "ashish@abc.com";
		String phone = "6587654321";
		MobileAppServiceInjector injector = null;
		AppClientService app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
