package com.mobileservice.client;

import com.mobileservice.service.MobileAppService;

public class MyMobileAppClient implements AppClientService{

	private MobileAppService service;
	
	public MyMobileAppClient(MobileAppService svc){
		this.service=svc;
	}
	
	public MyMobileAppClient(){}
	
	public void setService(MobileAppService service) {
		this.service = service;
	}

	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}
