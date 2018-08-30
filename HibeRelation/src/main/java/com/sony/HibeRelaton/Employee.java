package com.sony.HibeRelaton;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private String dept;
	@ManyToMany(mappedBy="employee")
	private List<EmpLaptop> laptop=new ArrayList<EmpLaptop>();
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public List<EmpLaptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<EmpLaptop> laptop) {
		this.laptop = laptop;
	}
	
	
}
