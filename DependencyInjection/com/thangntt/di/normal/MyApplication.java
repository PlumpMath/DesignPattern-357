package com.thangntt.di.normal;

public class MyApplication {
	private EmailService email = new EmailService();
	
	/**
	 * EmailService class holds the logic to send email message to the recipient email address. Our application code will be like below
	 * @param msg
	 * @param rec
	 */
	public void processMessage(String msg, String rec) {
		//do some msg validation, mainplation logic etc
		this.email.sendEmail(msg, rec);
	}
}
