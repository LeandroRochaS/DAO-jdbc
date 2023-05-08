package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("=== TESTE 2: seller findByDepartment ===");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 3: seller findAll ===");

		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 4: seller Insert ===");

		Seller seller4 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(seller4);
		System.out.println("Inserted, new id = " + seller4.getId());
		
		System.out.println("=== TESTE 5: seller Update ===");

		seller = sellerDao.findById(1);
		seller.setName("Leandro");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("=== TESTE 6: seller Delete ===");

		System.out.println("Enter id for delete test: ");
		int idDelete = sc.nextInt();
		sellerDao.deleteById(idDelete);
		
		
		
	}
}
