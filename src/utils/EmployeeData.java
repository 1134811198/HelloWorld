package utils;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeeData {
	
	public static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("����ӱ", 100000, 23, 'Ů'));

		list.add(new Employee("�����", 980000, 26, 'Ů'));
		
		list.add(new Employee("�ָ���", 8000, 32, '��'));
		list.add(new Employee("½��", 790000, 39, '��'));
		list.add(new Employee("����ǧ��", 9000, 18, '��'));
		list.add(new Employee("˹�ٸ���", 1000000, 65, 'Ů'));
		
		return list;
	}

}