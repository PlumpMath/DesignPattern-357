package com.thangntt.di.normal;

public class EmailService {
	
	/**
	 * we consume EmailService to send emails. Normally we would implement this like below.
	 * @param message
	 * @param receiver
	 */
	public void  sendEmail(String message, String receiver) {
		System.out.println("Email sent to " + receiver + " with message= " + message);
	}
}
