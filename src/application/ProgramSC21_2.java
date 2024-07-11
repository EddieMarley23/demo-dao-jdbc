package application;

import java.util.List;


import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;


public class ProgramSC21_2 {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n==== TEST 1: department insert");
		Department newDepartment = new Department(null, "Accounting");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
		
		
		System.out.println("\n==== TEST 2: department findById");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		
		
		System.out.println("\n==== TEST 3: department update");
		department = departmentDao.findById(1);
		department.setName("TestChange");
		departmentDao.update(department);
		
		
		
		System.out.println("\n==== TEST 4: department delete");
		int id = 21;
		department.setId(id);
		departmentDao.deleteById(id);
		
		System.out.println("\n==== TEST 5: department findAll");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj: list) {
			System.out.println(obj);
			
		}

	}

}
