package com.example.actions;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.example.model.Student;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/WEB-INF/content")
@Action(value = "/studregister", 
results = { 
		@Result(name = "success", location = "studsuccess.jsp")

})
public class StudentAction extends ActionSupport {
	private Student student;
	private List<String> hobbies;

	public StudentAction() {
		hobbies = Arrays.asList("Sports", "Music", "Dancing", "Cooking");
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

	@Action(value = "/studregister", 
			results = { 
					@Result(name = "success", location = "studsuccess.jsp") ,
					@Result(name = "input" , location = "studform.jsp"),
					@Result(name = "error" , location = "studform.jsp")

			})
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Action(value = "studform", results = { @Result(name = "none", location = "/WEB-INF/content/studform.jsp") })
	public String studFrom() {
		return NONE;
	}

	@Override
	public void validate() {
		if (student != null) {
			if (student.getName().length() <= 0)
				addFieldError("student.name", "Name is required");
			if (student.getCity().length() <= 0)
				addFieldError("student.city", "City is required");
			if (student.getAge() <= 20)
				addFieldError("student.age", "Age should be between 21 and 70");
			if (student.getAllowance() <= 0)
				addFieldError("student.salary", "Allowance should be greater than 0");

			if (student.getEmail().length() <= 0)
				addFieldError("employee.email", "Email is required");
			if (!student.getEmail().contains("@"))
				addFieldError("employee.name", "Email is not valid");
		}
	}

}
