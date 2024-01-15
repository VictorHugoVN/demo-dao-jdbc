package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department department;
	
	public Seller() {
		
	}
	
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setBirthDate(birthDate);
		this.setBaseSalary(baseSalary);
		this.setDepartment(department);
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate() {
		return this.birthDate;
	}
	
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Double getBaseSalary() {
		return this.baseSalary;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Department getDepartment() {
		return this.department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return "Id -> " + this.getId() +
				"\nName -> " + this.getName() + 
				"\nE-mail -> " + this.getEmail() + 
				"\nBirth Date -> " + this.getBirthDate() + 
				"\nBase Salary -> $" + this.getBaseSalary() + 
				"\nDepartment -> " + this.getDepartment();
	}
	

}
