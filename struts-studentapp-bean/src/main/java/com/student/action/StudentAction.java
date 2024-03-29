package com.student.action;

import com.student.model.Student;

public class StudentAction {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String execute() {
		if(student.getStudentName().equals("Basava"))
			return "success";
		else
			return "error";
	}
}
