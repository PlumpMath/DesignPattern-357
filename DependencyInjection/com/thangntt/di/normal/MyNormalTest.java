package com.thangntt.di.normal;

public class MyNormalTest {

	/**
	 * client code  will use MYAPplication class to send email messages will be below.
	 * AT first look, there seems nothing wrong with above implementation. BU above code logic has certain limitations:
	 * 1. MyApplication class is ressponsible to intiazible the email service and then use it. This leds to hard-coded dependency. 
	 * If wwe want to switch to some other advanced email service in future. It will require code chanes in MyApplication class. 
	 * This make our application hard to extend and if email service is used in multiple classes than that would be even harder
	 * 2. if we want to extend our applicaiton to privide additional messaging feature. such as SMS or Facebook message the we 
	 * would need to wire another application for that. This will invole code changes in application classes and in client classes to.
	 * 3. Testing the application will be very difficult since our application is directly creating the email service instance. 
	 * there is no way we can mock these object in our test class.
	 */
	public static void main(String[] args) {
		
		MyApplication app = new MyApplication();
		app.processMessage("Hi PAnkaj", "pankaj@abc.com");
	}

}
