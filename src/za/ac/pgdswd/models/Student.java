package za.ac.pgdswd.models;

import java.util.ArrayList;
import java.util.Date;

public class Student {

	private String studentName;
	private String studentHobby;
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
	private long studentCell;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	
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
