package core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml"); //to check the object starting and stoping.
		Employee emp1 = ctx.getBean("employee",Employee.class);
		Employee emp2 = ctx.getBean("employee",Employee.class);
		emp1.setEmpcode(405);
		/*List<String> skillz = new ArrayList<String>();
		skillz.add("Lying");
		skillz.add("Cheating");
		skillz.add("Arguing");   
		emp2.setSkills(skillz);	
		*/
		System.out.println(emp1.getEmpcode()+" "+emp1.getEmpname()+" "+emp1.getSkills());
		System.out.println(emp2.getEmpcode()+" "+emp2.getEmpname()+" "+emp2.getSkills());
		//System.out.println(emp2.getEmpcode()+" "+emp2.getEmpname());
		ctx.close();
	}
}
