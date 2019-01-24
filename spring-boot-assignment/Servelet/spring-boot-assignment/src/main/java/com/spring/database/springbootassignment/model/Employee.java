package com.spring.database.springbootassignment.model;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	
	
	@Id //ID is the primary key of table
	@Column(name="id") // name of table column is id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="a_id")
	private Address address ;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="Department_id")
//	private Department dept;
	public Employee() {	
	}
	
	
	public Employee(String name) {
		this.name= name;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	public Department getDept() {
//		return dept;
//	}
//	public void setDept(Department dept) {
//		this.dept = dept;
//	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	


}
