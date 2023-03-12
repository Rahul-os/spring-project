package jdbcspring;

import java.util.Date;

public class Employee { 
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int empcode;
	private String empname;
	private double salary;
	private Date doj;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public Employee(int empcode, String empname, double salary, Date doj) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
		this.doj = doj;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	

}
