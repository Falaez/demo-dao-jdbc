package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findById(3);
		List<Department> list = departmentDao.findAll();
		
		System.out.println("\n=== Test 1 findById ===");
		System.out.println(dep);
		
		System.out.println("\n=== Test 2 findAll ===");
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test 3 insert ===");
		Department newDepartment = new Department(null, "Video Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id " + newDepartment.getId());

	
	
		System.out.println("\n=== Test 4 update===");
		dep = departmentDao.findById(6);
		dep.setName("School");
		departmentDao.update(dep);
		System.out.println(dep);
		
		System.out.println("\n=== Test 4 delete===");
		departmentDao.deleteById(12);
		System.out.println("Delete complete");
		
}}
