package com.tvm.studentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tvm.studentmanagementsystem.model.Student;
import com.tvm.studentmanagementsystem.service.StudentService;

@RestController
public class StudentController
{
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/studentsave")
	public Student stuSave(@RequestBody Student stu) {
		Student student=studentservice.studentSave(stu);
		return student;
	}
	@GetMapping("/stuGet")
	public List<Student> stuGet()
	{
		List <Student>stu=studentservice.getallStudents();
		return stu;
	}
	@DeleteMapping("/stuDelete/{id}")
    public long studel(@PathVariable(value="id") long a)
	{
		studentservice.stuiddel(a);
		return a;
	}
    
	@PutMapping("/stuPut")
	public Student empput(@RequestBody Student stuput){
		studentservice.studentSave(stuput);
		return stuput;
}
	@GetMapping("/stuByID/{id}")
	public Student stubyid(@PathVariable long id)
	{
		Student stu=studentservice.stuFind(id);
		return stu;
}
	
}

	


