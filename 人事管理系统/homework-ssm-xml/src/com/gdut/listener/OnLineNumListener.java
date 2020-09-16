package com.gdut.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class OnLineNumListener implements HttpSessionListener{
	private static int  userNumber = 0;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		userNumber++;
		arg0.getSession().setAttribute("userNumber", userNumber);
		System.out.println("上线"+userNumber);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		  userNumber--;
	      arg0.getSession().setAttribute("userNumber", userNumber);
	      System.out.println("上线"+userNumber);
			
		
	}
	
}
