package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;


public interface CourseService {
	
	public List<Course> getCourses();  /** 3. this method will be called at run time as runtime polymorphism and 
											will redirect to child class where this method is defined **/
	public Course getCourse(long courseId); //3. id will be passed here to the getCourse() method
	

}
