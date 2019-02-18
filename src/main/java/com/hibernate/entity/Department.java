package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Department {

	
	@Id
	@GeneratedValue(generator="dept_id_gen")
	@GenericGenerator(name="dept_id_gen",strategy="com.hibernate.entity.identifier.DeptIdGenerator")
	private String id;
	private String departmentName;
	private String departmentHead;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	
	
}
