package com.katerina.CourseProject;

import java.util.ArrayList;


public class Teacher{
	private String teacherName;
	private ArrayList<Course> courses = new ArrayList<Course>(); 
	
	public Teacher(String name){
		this.teacherName = name;
	}
	
	public Course openCourse(String newCourse){
		Course course = new Course(newCourse, this);
		courses.add(course);
		return course;
	}
	
	public ArchiveItem giveScore(String courseName, String studentName, int score){
		Course courseFound = null;
		Student studentFound = null;
		for (Course course:courses){
			if (course.courseName == courseName){
				courseFound = course;
				for (Student student:course.students){
					if (student.studentName == studentName){
						studentFound = student;
						break;
					}
				} 
				if(studentFound != null) break;
			}
		}
		if (studentFound != null && courseFound != null){
			courseFound.students.remove(studentFound);
			return new ArchiveItem(studentFound, score, courseFound);
		} 
		return null;
	}
	
	
}