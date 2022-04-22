package application;

import java.util.Date;

import model.dao.DaoFactor;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		new DaoFactor();
		SellerDao sellerDao = DaoFactor.createSellerDao();
				
		System.out.println(seller);
	}

}
