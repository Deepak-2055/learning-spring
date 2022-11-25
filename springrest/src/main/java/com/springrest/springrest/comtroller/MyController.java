package com.springrest.springrest.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;


@RestController
public class MyController {
	
	@Autowired   //you are using spring frameworks feature to create object automatically and inject here
	private CourseService courseService;
	
	
	@GetMapping("/home")
	public String home()
	{
		
		return "this is my home";
	}
	
	//get the courses
	@GetMapping("/courses")   //1 fire getcourses request then automatically 
	public List<Course> getCources()  // this getCources() will be called and
	{
		
		return this.courseService.getCourses();  //then it will getCources() method
	}
	
	@GetMapping("/courses/{courseId}") //1. enter course with course id
	public Course getCourse(@PathVariable String courseId)  //courseId will be passed as argument in get course method
	{
		return this.courseService.getCourse(Long.parseLong(courseId));  //it will call courseServices getCourse method and which will take as long
		
	}
	
	

}



