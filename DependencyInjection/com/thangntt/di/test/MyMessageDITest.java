package com.thangntt.di.test;

import com.thangntt.di.consumer.Consumer;
import com.thangntt.di.injector.EmailServiceInjector;
import com.thangntt.di.injector.MessageServiceInjector;
import com.thangntt.di.injector.SMSServiceInjector;

public class MyMessageDITest {
	
	public static void main(String[] args) {
		
		String msg = "HI PAnkaj";
		String email = "pankaj@abc.com";
		String  phone = "0121346";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//send email
		injector = new EmailServiceInjector();
		app =  injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}
