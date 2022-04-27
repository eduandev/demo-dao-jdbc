package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactor;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactor.createDepartmentDao();
		
		System.out.println("===TEST 1 find by id");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("===TEST 2 find all");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		/*System.out.println("===TEST 3 insert department");
		Department newDepartment = new Department(null, "Music"); 
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());*/
		
		/*System.out.println("===TEST 4 update department");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Manager");
		departmentDao.update(dep2);
		System.out.println("Update completed!");*/
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
