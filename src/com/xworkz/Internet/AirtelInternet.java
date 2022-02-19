package com.xworkz.Internet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
@PropertySource(value = { "classpath:application.properties" })

public class AirtelInternet implements Internet {

	@Value("${airtel.vendor}")
	private String vendor;
	
	@Value("${airtel.costPerMonth}")
	private int costPerMonth;
	
	@Override
	public void connect() {
		System.out.println("Connecting using Airtel");
	}
	
	@Override
	public void display() {
		System.out.println("Name of Airtel vendor : "+vendor);		
		System.out.println("Name of Airtel vendor : "+costPerMonth);
	}
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
}
