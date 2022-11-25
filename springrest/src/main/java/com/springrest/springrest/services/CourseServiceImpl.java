package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;




@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() // 4. this method will return the data to controller
	{
		list=new ArrayList<>();
		list.add(new Course(143, "Java core Course", "This course contains basics of java"));
		list.add(new Course(3838, "Spring Boot Cources", "Creating Rest API using spring boot"));
				
	}
		
	@Override
	public List<Course> getCourses() {

		return list;  ///return data
	}

	@Override
	public Course getCourse(long courseId)  // 4. this method will return the course whose id was asked in url
	{
		
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		
		return c;
	}
	


	
}
