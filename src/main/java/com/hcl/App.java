package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.config.Application;
import com.hcl.model.Customer;
import com.hcl.model.User;

 


//

public class App 
{
    public static void main( String[] args )
    {
    	
    	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Application a1=(Application)ctx.getBean("test");
    	System.out.println(a1);
    	User u=(User)ctx.getBean("user");
    	System.out.println(u);
    	
    	Customer c=(Customer)ctx.getBean("cus");
    	System.out.println(c);
    	
         
        
        
        
        
        
    }
}
