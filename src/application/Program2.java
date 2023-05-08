package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TESTE 2: department findAll ===");
		System.out.println(departmentDao.findAll());
		
		System.out.println("=== TESTE 3: department Insert ===");
		//departmentDao.insert(dep);
		
		System.out.println("=== TESTE 4: department Update ===");
		//departmentDao.update(dep);

		
		
	}

}
