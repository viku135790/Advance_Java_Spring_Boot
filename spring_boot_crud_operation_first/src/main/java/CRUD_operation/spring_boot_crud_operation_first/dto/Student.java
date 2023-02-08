package CRUD_operation.spring_boot_crud_operation_first.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//use to create table
@Entity 
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
