package com.rtpl.common;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
    	
        	CustomerService cust = (CustomerService)context.getBean("customerService");
        	
        	System.out.println(cust);
        	
        	context.close();
        }
}
