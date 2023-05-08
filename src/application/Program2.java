package application;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TESTE 2: department findAll ===");
		System.out.println(departmentDao.findAll());
		
		System.out.println("=== TESTE 3: department Insert ===");
		departmentDao.insert(dep);
		
		System.out.println("=== TESTE 4: department Update ===");
		departmentDao.update(dep);
		
		System.out.println("=== TESTE 5: department Delete ===");
		departmentDao.deleteById(7);

		
		
	}

}
