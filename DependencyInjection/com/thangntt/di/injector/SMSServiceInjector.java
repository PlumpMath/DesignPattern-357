package com.thangntt.di.injector;

import com.thangntt.di.consumer.Consumer;
import com.thangntt.di.consumer.MyDIApplication;
import com.thangntt.di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {
		
		return new MyDIApplication(new SMSServiceImpl());
	}
	
}
