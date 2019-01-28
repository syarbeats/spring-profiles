package com.learning.spring.spring_profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {
	
	@Autowired
	ILicenseConfig licenseConfig;
	
	private String server;
	private String applicationName; 
	private String port;
	private String licenseKeyFile;
	private String username;

	
	public MyConfig(String server, String port, String applicationName, String licenseKeyFile, String username) {
		this.server = server;
		this.port = port;
		this.applicationName = applicationName;
		this.licenseKeyFile = licenseKeyFile;
		this.username = username;
		
		System.out.println("Server: "+this.server);
		System.out.println("Port: "+this.port);
		System.out.println("Application Name: "+this.applicationName);
		System.out.println("License Key File: "+this.licenseKeyFile);
		System.out.println("Username: "+this.username);
	}
	
	
	public String getServer() {
		return licenseConfig.getServer();
	}

	public void setServer(String server) {
		this.server = server;
	}


	public String getApplicationName() {
		return applicationName;
	}


	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	public String getLicenseKeyFile() {
		return licenseKeyFile;
	}


	public void setLicenseKeyFile(String licenseKeyFile) {
		this.licenseKeyFile = licenseKeyFile;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	

}
