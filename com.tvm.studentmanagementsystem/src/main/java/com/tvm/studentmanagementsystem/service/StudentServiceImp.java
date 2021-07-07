package com.tvm.studentmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.tvm.studentmanagementsystem.model.Student;
import com.tvm.studentmanagementsystem.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student studentSave(Student student) {
		// TODO Auto-generated method stub
		Student stu= studentRepository.save(student);
		return stu;
	}
	@Override
	public List<Student> getallStudents() {
		// TODO Auto-generated method stub
		List<Student>stu =studentRepository.findAll();
		return stu;
		
	}
	@Override
	public void stuiddel(long studid) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studid);
		
	}
	@Override
	public Student stuFind(long id) {
		// TODO Auto-generated method stub
		Optional<Student>stuFind= studentRepository.findById(id);
	    Student stu=null;
		if(stuFind.isPresent()) {
			stu=stuFind.get();
		}
		return stu;
		
	}
	}
