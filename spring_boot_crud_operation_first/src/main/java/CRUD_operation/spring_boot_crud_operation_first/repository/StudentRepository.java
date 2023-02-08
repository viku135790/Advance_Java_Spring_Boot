package CRUD_operation.spring_boot_crud_operation_first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CRUD_operation.spring_boot_crud_operation_first.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
