package CRUD_operation.spring_boot_crud_operation_first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import CRUD_operation.spring_boot_crud_operation_first.dao.StudentDao;
import CRUD_operation.spring_boot_crud_operation_first.dto.Student;

@Service
public class StudentService {
	//it is to create object internally 
	@Autowired 
	StudentDao dao;
	
	public Student insertStudent(Student student) {
		dao.insertStudent(student);
		return student;
	}
	
	
	public int getById(int id) {
		
		return dao.getById(id);
		
	}
	
	public String deleteData(int id) {
		if(dao.getById(id)!=0) {
			dao.deleteData(id);
			return ("data deleted sucessfully");
		}
		else {
			return ("given id is wrong");
		}
	}
	
	public String updateStudent(Student student, int id) {
		if(dao.getById(id)!=0) {
			dao.updateStudent(student, id);
			return ("Data is successfully updated");
		}
		else {
			return("Given id  is not present");
		}
		
	}

}
