package com.struts.actions;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;


public class StudentAction extends ActionSupport {

	// Create a object of student to populate values
	private Student student;
	// create a list to prepopulate the values of the hobby array
	private List<String> hobbies;

	public StudentAction() {
		hobbies = Arrays.asList("Sports", "Music", "Dance");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String showStudForm() {
		return NONE;
	}
	
	
	
	@Override
	public String execute() throws Exception {

		// TODO Auto-generated method stub
		if(student.getName().equals("Basava")) 
			return "success";
			
		return INPUT;
	}
	

	
}
