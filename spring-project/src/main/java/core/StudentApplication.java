package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Student std1 = (Student)ctx.getBean("std");
		//std1.setRno(11);   
		//std1.setName("Bhavi");		//these values will override  with the values passed from xml file.
		System.out.println(std1.getName()+" "+std1.getRno());
		//System.out.println(std1.getAddress().getCity()); NullPointerException canot invoke city values.
		System.out.println(std1.getAddress().getCity());
		
		
		
	}
	
}
	


