package za.ac.pgdswd.models;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class Student {

	private String studentName;
	
	@Size(min=2, max=30)
	private String studentHobby;
	private long studentCell;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address address;
	
	public Address getAddress(){
		return address;
	} 
	public long getStudentCell() {
		return studentCell;
	}
	public void setStudentCell(long studentCell) {
		this.studentCell = studentCell;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
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
