package com.tvm.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvm.studentmanagementsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>  
{

	

}
