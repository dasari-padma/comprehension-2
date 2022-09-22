package com.example.Doctor.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_TBL")
public class Doctor {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int salary;
	private String specilaist;
	
	
	public Doctor() {
		super();
	}


	public Doctor(int id, String name, int salary, String specilaist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.specilaist = specilaist;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getSpecilaist() {
		return specilaist;
	}


	public void setSpecilaist(String specilaist) {
		this.specilaist = specilaist;
	}
	

}
