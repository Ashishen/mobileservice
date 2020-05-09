package com.mobileservice.injector;

import com.mobileservice.client.AppClientService;
import com.mobileservice.client.MyMobileAppClient;
import com.mobileservice.service.SMSService;

public class SMSServiceInjector implements MobileAppServiceInjector {

	public AppClientService getConsumer() {
		return new MyMobileAppClient(new SMSService());
	}

}
