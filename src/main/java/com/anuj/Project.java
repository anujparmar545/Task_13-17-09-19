package com.anuj;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project1")
public class Project {
	
	@Id
	private String pcode;
	private String pname;
	private int duration;
	

	
	@ManyToMany(mappedBy="projects")
	private List<Employee> employees=new ArrayList<Employee>();
	
	
	
	
	public Project() {
		super();
	}
	public Project(String pcode) {
		super();
		this.pcode = pcode;
	}
	
	public Project(String pcode, String pname, int duration) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.duration = duration;
	}
	
	public Project(String pcode, String pname, int duration, List<Employee> employees) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.duration = duration;
		this.employees = employees;
	}
	
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", pname=" + pname + ", duration=" + duration + ", employees=" + employees
				+ "]";
	}
	
	

	
	
}
