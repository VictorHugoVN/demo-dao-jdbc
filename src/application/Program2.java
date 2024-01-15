package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartementDao();
		
		System.out.println("\n=== TEST 1: Department insert ===");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		System.out.println("=== TEST 2: Department findById ===");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: Departemnt findAll ===");
		
		
		
	}

}
