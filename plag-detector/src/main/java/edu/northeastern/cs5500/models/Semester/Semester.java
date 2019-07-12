package edu.northeastern.cs5500.models.Semester;

import java.util.List;

import edu.northeastern.cs5500.models.Course.Course;

public class Semester {
	
	private int id;
	private String name;
	private List<Course> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Semester(int id, String name, List<Course> courses) {
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
	
	public Semester(int id, String name) {
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
	
	

}
