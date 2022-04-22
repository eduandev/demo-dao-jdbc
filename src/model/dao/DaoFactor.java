package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactor {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
