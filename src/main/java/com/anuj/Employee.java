package com.anuj;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp1")
public class Employee {

	@Id
	private String eid;
	private String ename;
	private int salary;
	
	
	@OneToOne
	private Laptop lap;
	
	@OneToMany(mappedBy="emp")
	private List<Vehicle> vehicles=new ArrayList<Vehicle>();
	
	@ManyToMany
	private List<Project> projects=new ArrayList<Project>();
	
	public Employee() {
		super();
	}

	public Employee(String eid) {
		super();
		this.eid = eid;
	}
	
	

	public Employee(String eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", lap=" + lap + ", vehicles="
				+ vehicles + ", projects=" + projects + "]";
	}

	
	
	
	
}
