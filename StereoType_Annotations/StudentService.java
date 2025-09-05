package com.example.SpringApp3;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/students")
public class StudentService {
	private List<Student> studentList = new ArrayList<>();
	
	@GetMapping("/all")
	public List<Student>getAllStudents(){
		return studentList;
	}
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student stu) {
		studentList.add(stu);
		return "Student is added";
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
        for (Student s : studentList) {
            if (s.getId() == id) return s;
        }
        return null;
    }
	@PutMapping("/update")
	public String putStudentbyId(@PathVariable int id,@RequestParam String name) {
		for(Student list:studentList) {
			if(list.getId() == id) {
				list.setName(name);
				return "Student Updated";
			}
		}
		return "Student Not Found";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
	    Iterator<Student> iterator = studentList.iterator();
	    while (iterator.hasNext()) {
	        Student s = iterator.next();
	        if (s.getId() == id) {
	            iterator.remove(); 
	            return "Deleted Successfully";
	        }
	    }
	    return "Not Deleted";
	}

}
