package application;

import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;
import model.entites.Seller;

public class ProgramSC21_2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n==== TEST 1: department insert");
		Department newDepartment = new Department(null, "Accounting");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());

	}

}
