package CRUD_operation.spring_boot_crud_operation_first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import CRUD_operation.spring_boot_crud_operation_first.dto.Student;
import CRUD_operation.spring_boot_crud_operation_first.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	//insertmethodforstudent
	@PostMapping("/saveStudent")
	public Student insertStudent(@RequestBody Student student) {
		return studentService.insertStudent(student);
	}
	
	
	@GetMapping("/getId/{id}")
	public int getById(@PathVariable int id) {
		return studentService.getById(id);	
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return studentService.deleteData(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateStudent(@RequestBody Student student,@PathVariable int id) {
		return studentService.updateStudent(student, id);
	}

}
