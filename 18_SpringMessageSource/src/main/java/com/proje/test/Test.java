package com.proje.test;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Locale locale=new Locale("tr", "TR");
		System.out.println(applicationContext.getMessage("login.failure.messages",null, locale));
		System.out.println(applicationContext.getMessage("login.failure.messages",null, Locale.ITALY));
		System.out.println(applicationContext.getMessage("login.failure.messages",null, Locale.US));
		System.out.println(applicationContext.getMessage("login.failure.messages",null, Locale.UK));
		
		
		applicationContext.close();
	}

}
