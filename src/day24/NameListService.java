package day24;


import com.atguigu.domain.*;
import com.atguigu.utils.Data;

/**
 * 此类用于演示业务类： 用于管理公司所有员工
 * 
 * @author liyuting
 *
 */
public class NameListService {
	
	
	public static void main(String[] args) {
		NameListService service = new NameListService();
		
		for (int i = 0; i < service.emps.length; i++) {
			System.out.println(service.emps[i]);
		}
		TeamService ts = new TeamService();
		
		try {
			ts.addMember(service.emps[1]);
		} catch (Exception e) {
			System.out.println("添加失败！原因是："+e.getMessage());
		}
		
		
	}

	// 属性
	Employee[] emps;// 声明数组

	// 构造器
	public NameListService() {
		// 为数组开辟长度
		emps = new Employee[Data.EMPLOYEES.length];

		// 为数组元素赋值

		for (int i = 0; i < emps.length; i++) {
			String key = Data.EMPLOYEES[i][0];
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			Equipment equipment = getEquipment(i);
			switch (key) {
			case "10":// 员工

				emps[i] = new Employee(id, name, age, salary);

				break;
			case "11":// 程序员

				emps[i] = new Programmer(id, name, age, salary, equipment);

				break;
			case "12":// 设计师
				double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				emps[i] = new Designer(id, name, age, salary, equipment, bonus);

				break;
			case "13":// 架构师
				double bonus2 = Double.parseDouble(Data.EMPLOYEES[i][5]);
				double stock = Double.parseDouble(Data.EMPLOYEES[i][6]);
				emps[i] = new Architect(id, name, age, salary, equipment, bonus2, stock);

				break;

			}
		}

	}

	public Equipment getEquipment(int index) {

		if (Data.EQIPMENTS[index].length == 0) {
			return null;
		}

		String key = Data.EQIPMENTS[index][0];
		Equipment equip = null;
		String model = Data.EQIPMENTS[index][1];
		String display = Data.EQIPMENTS[index][2];
		switch (key) {
		case "21":// pc
			equip = new PC(model, display);

			break;
		case "22":
			equip = new NoteBook(model, Double.parseDouble(display));

			break;
		case "23":
			equip = new Printer(model, display);

			break;

		}
		
		return equip;
	}

	
	/**
	 * 功能：获取所有的员工
	 * @return Employee[]
	 */
	public Employee[]  getAllEmployees(){
		return emps;
	}
	/**
	 * 功能：查找员工对象是否存在
	 * @param id 带查找的id
	 * @return 员工对象，如果找不到，返回异常
	 */
	public Employee  getEmployeeById(int id){
		for (int i = 0; i < emps.length; i++) {
			if(emps[i].getId()==id){
				return emps[i];
			}
		}
		throw new TeamException("该员工不存在");
		
	}
	
	
}

