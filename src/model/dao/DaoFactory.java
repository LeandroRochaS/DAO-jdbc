package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		// TODO Auto-generated method stub
		return new SellerDaoJDBC();
	}

}
