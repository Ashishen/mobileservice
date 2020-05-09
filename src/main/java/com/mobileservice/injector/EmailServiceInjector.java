package com.mobileservice.injector;

import com.mobileservice.client.AppClientService;
import com.mobileservice.client.MyMobileAppClient;
import com.mobileservice.service.EmailService;

public class EmailServiceInjector implements MobileAppServiceInjector {

	public AppClientService getConsumer() {
		MyMobileAppClient app = new MyMobileAppClient();
		app.setService(new EmailService());
		return app;
	}

}
