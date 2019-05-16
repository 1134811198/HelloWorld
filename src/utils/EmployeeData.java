package utils;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeeData {
	
	public static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("赵丽颖", 100000, 23, '女'));

		list.add(new Employee("刘亦菲", 980000, 26, '女'));
		
		list.add(new Employee("林更新", 8000, 32, '男'));
		list.add(new Employee("陆毅", 790000, 39, '男'));
		list.add(new Employee("易烊千玺", 9000, 18, '男'));
		list.add(new Employee("斯琴高娃", 1000000, 65, '女'));
		
		return list;
	}

}