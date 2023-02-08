package CRUD_operation.spring_boot_crud_operation_first.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import CRUD_operation.spring_boot_crud_operation_first.dto.Student;
import CRUD_operation.spring_boot_crud_operation_first.repository.StudentRepository;
import jakarta.persistence.EntityTransaction;

@Repository // beacuse this class belongs to database
public class StudentDao {
	@Autowired
	StudentRepository repository;
	
	//insert--------------------------------------------------------------------------
	public void insertStudent(Student student) {
		repository.save(student);
	}

	// get by id-----------------------------------------------------------------------

	public int getById(int id) {
		Optional<Student> optional = repository.findById(id);

		if (optional.isPresent()) {
			return optional.get().getId();
		} else {
			return 0;
		}
	}

	// delete by id----------------------------------------------------------------------

	public void deleteData(int id) {
		Optional<Student> optional = repository.findById(id);

		if (optional.isPresent()) {
			Student student=optional.get();
			
			repository.delete(student);
		}
	}
	
	//update -----------------------------------------------------------------------------
	public void updateStudent(Student student, int id) {
		Optional<Student> optional = repository.findById(id);
		
		Student student2=optional.get();
		if(student.getName()!=null && student.getEmail()!=null) {
		
			student2.setEmail(student.getEmail());
			student2.setName(student.getName());
			
			repository.save(student2);
		}
		else if(student.getName()!=null) {
			student2.setName(student.getName());
			
			repository.save(student2);
		}
		else {
			student2.setEmail(student.getEmail());
			repository.save(student2);
		}
		
	}

}
