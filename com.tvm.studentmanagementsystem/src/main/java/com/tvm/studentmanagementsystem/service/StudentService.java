package com.tvm.studentmanagementsystem.service;

import java.util.List;


import com.tvm.studentmanagementsystem.model.Student;

public interface StudentService {
	Student studentSave(Student student );
	List<Student> getallStudents();
    void stuiddel(long studid);
    Student stuFind(long id);
	
	


}
