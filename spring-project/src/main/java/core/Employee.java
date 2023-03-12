package core;

import java.util.List;

public class Employee {
	private int empcode;
	private String empname;
	List<String> skills;
	
	
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
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public void start()
	{
		System.out.println("**  init methtod executed   **");
	}
	
	public void stop()
	{
		System.out.println("**  stop method executed   **");
	}

}
