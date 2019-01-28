package com.learning.spring.spring_profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


public class App 
{

    public static void main( String[] args )
    {
    	
    	
    	/*for(String env:env.getActiveProfiles()){
    		System.out.println("Active Profiles: "+env);
    	}*/
    	
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    	ctx.getEnvironment().setActiveProfiles("production");
    	ctx.register(DevBean.class);
    	ctx.refresh();
    	
    	//MyConfig license = ctx.getBean(MyConfig.class);
    	((ConfigurableApplicationContext) ctx).close(); 
    	
        //;
        //System.out.println("Load file config.properties using environment and SPEL");
        //System.out.println("======================================================");
        //System.out.println("Server: "+license.getServer());
        //System.out.println("Port: "+license.getPort());
        //System.out.println("License File: "+ license.getLicenseKeyFile());
        //System.out.println("ApplicationName: "+ license.getApplicationName());
        //System.out.println("Username: "+ license.getUsername());
        System.out.println("");
    }
}
