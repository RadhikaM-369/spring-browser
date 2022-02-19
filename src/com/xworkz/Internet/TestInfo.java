package com.xworkz.Internet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInfo {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		AirtelInternet airtel = container.getBean(AirtelInternet.class);

		airtel.display();

	}

}
