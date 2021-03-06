package com.learning.spring.spring_profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Profile("production")
@PropertySource({
	"classpath:config.properties"
})
public class LicenseConfigProdImpl implements ILicenseConfig{
	
	@Autowired
	Environment environment;
	
	//@Value("#{environment['prod.server']}")
	@Value("${prod.server}")
	private String server;
	
	@Value("#{environment['dev.applicationName']}")
	private String applicationName; 
	
	@Value("#{environment['prod.port']}")
	private String port;
	
	@Value("#{environment['prod.licenseKeyFile']}")
	private String licenseKeyFile;
	
	@Value("${dev.username}")
	private String username;
	
	
	@Bean
	public MyConfig myConfig() {
		return new MyConfig(this.server, this.port, this.applicationName, this.licenseKeyFile, this.username);
	}
	
	public LicenseConfigProdImpl() {
		System.out.println("Production Bean...Server: ");
	}
	
	@Override
	public boolean verified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getLicenseKey() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServer() {
		return server;
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
