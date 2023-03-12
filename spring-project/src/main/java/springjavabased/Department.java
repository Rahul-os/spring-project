package springjavabased;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
	private int dno;
	private String dname;
	@Autowired
	private Teacher teacher;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
