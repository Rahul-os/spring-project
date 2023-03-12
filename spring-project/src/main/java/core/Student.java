package core;

public class Student {
	private int rno;
	private String name;
	private Address address;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int rno, String name, Address address) {
		super();
		this.rno = rno;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
	}
	
	
	

}
