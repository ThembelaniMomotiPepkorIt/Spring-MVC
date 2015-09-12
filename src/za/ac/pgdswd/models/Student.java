package za.ac.pgdswd.models;

import java.util.ArrayList;
import java.util.Date;

public class Student {

	private String studentName;
	private String studentHobby;
	private long studentCell;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address address;
	
	public Address getAddress(){
		return address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
		
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby= studentHobby;
	}
	
	
}
