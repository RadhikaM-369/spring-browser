package com.xworkz.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Internet.Internet;
@Component
public class ChromeBrowser implements Browser{
	@Autowired
	private String name;
	private String version;
	Internet internet;
	
	@Override
	public void surf() {
	this.internet.connect();	
		
	}

}
