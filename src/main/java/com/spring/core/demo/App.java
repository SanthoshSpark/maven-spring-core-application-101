package com.spring.core.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
		execute();
	}
	
	public static void execute()
    {
    	AnnotationConfigApplicationContext context = null;
        try {
        	context = new AnnotationConfigApplicationContext(AppConfig.class);
        	HelloService helloService = context.getBean(HelloService.class);
            
            System.out.println(helloService.getGreeting());
            
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        finally {
        	if(context != null) {
        		context.close();
        	}
        }
        
        
        
    }

}
