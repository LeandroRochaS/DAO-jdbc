package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static DepartmentDao createDepartmentDao(){
		return new DepartmentDaoJDBC(DB.getConnection());
	}

	public static SellerDao createSellerDao() {
		// TODO Auto-generated method stub
		return new SellerDaoJDBC(DB.getConnection());
	}

}
