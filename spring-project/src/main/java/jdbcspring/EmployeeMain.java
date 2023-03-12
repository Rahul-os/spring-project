package jdbcspring;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {  
	
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
//		EmployeeDaoImpl dao = ctx.getBean("dao" , EmployeeDaoImpl.class);
//		
//		//Add employee 
//		Employee emp = new Employee(104 , "Laxm" , 35000 ,new Date());
//		
////		Employee emp = new Employee();  while using setter methods we just create an obj and set values using setter
//		//methods 
//		int r = dao.addEmployee(emp);
//		
//		if(r > 0 )
//			System.out.println(r+" rows inserted");
//		
		//get employees list
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeDaoImpl dao = ctx.getBean("dao" , EmployeeDaoImpl.class);
		List<Employee> emplis = dao.getEmpls(); 
		for(Employee emp : emplis) {
			System.out.println(emp.getEmpcode()+" "+emp.getEmpname()+" "+emp.getSalary()+" "+emp.getDoj());
		}
		*/
		
		
		//Get employee by id
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeDaoImpl dao = ctx.getBean("dao" , EmployeeDaoImpl.class);
		Employee e = dao.getEmpbyId(101);
		System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+e.getSalary()+" "+e.getDoj()); 
		 
		
		//delete employee by id 
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeDaoImpl dao = ctx.getBean("dao" , EmployeeDaoImpl.class);
		Employee e = new Employee();
		int rows = dao.delEmployee(e);
		if(rows > 0)
			System.out.println("row deleted"); 
			*/
		
		//update employee by id 
		/*
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
		EmployeeDaoImpl dao = ctx.getBean("dao" , EmployeeDaoImpl.class);
		Employee e = new Employee(302 ,"ravikanth",55000,new Date());
		int rows = dao.updateEmployee(e);
		if(rows > 0) 
			System.out.println("record updated");
		else 
			System.out.println("record not updated");
			*/
		
}
}
