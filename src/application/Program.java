package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactor;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactor.createSellerDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===TEST 1: seller findById===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n===TEST 2: seller findByDepartment===");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n===TEST 3: seller findAll===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		/*System.out.println("\n===TEST 4: seller insert===");
		Seller Newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(Newseller);
		System.out.println("Inserted new id " + Newseller.getId());*/
		
		/*System.out.println("\n===TEST 5: seller update===");
		seller = sellerDao.findById(9);
		seller.setName("Martha Waine");
		seller.setEmail("martha@gmail.com");
		seller.setDepartment(department);
		seller.setBaseSalary(4300.0);
		sellerDao.update(seller);
		System.out.println("Update completed!");*/
		
		System.out.println("\n===TEST 6: seller update===");
		System.out.print("Enter whith id: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
	}

}
