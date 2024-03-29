package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Department() {
		
	}
	
	public Department(Integer id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
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
		Department other = (Department) obj;
		return id == other.id;
	}
	
	@Override
	public String toString() {
		return "Department [id = " + this.getId()  + ", name = " + this.getName() + "]";
	}
	
	
	
	
	

}
