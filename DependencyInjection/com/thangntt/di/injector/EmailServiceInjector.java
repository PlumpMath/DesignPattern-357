package com.thangntt.di.injector;

import com.thangntt.di.consumer.Consumer;
import com.thangntt.di.consumer.MyDIApplication;
import com.thangntt.di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector{

	@Override
	public Consumer getConsumer() {

		return new MyDIApplication(new EmailServiceImpl());
	}

}
