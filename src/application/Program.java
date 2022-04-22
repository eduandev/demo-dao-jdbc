package application;

import model.dao.DaoFactor;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactor.createSellerDao();
		Seller seller = sellerDao.findById(5);
				
		System.out.println(seller);
	}

}
