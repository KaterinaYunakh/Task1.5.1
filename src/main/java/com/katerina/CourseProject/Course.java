package com.katerina.CourseProject;

import java.util.ArrayList;


public class Course{
	String courseName;
	private Teacher courseTeacher;
	ArrayList<Student> students = new ArrayList<Student>(); 
	
		
	public Course(String name, Teacher teacher){
		this.courseName = name;
		this.courseTeacher = teacher;
	}
	
	public void joinCourse(Student student){
		students.add(student);
	}
	
}