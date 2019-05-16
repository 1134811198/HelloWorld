package HomeWork20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 三、按要求完成下列任务
1）使用HashMap类实例化一个Map类型的对象m1，
键（String类型）和值（int型）分别用于存储员工的姓名和工资，
存入数据如下：	张三——800元；李四——1500元；王五——3000元；
2）	将张三的工资更改为2600元
3）	为所有员工工资加薪100元；
4）	遍历集合中所有的员工
5）	遍历集合中所有的工资

 * @author win10
 *
 */
public class homework3 {
	public static void main(String[] args) {
		Map <String,Integer>hm=new HashMap<String,Integer>();
		hm.put("张三", 800);
		hm.put("李四", 1500);
		hm.put("王五", 3000);
		hm.remove("张三", 800);
		hm.put("张三", 2600);
		
		Set keys=hm.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()){
			 Object key=iter.next();
			 Object value=hm.get(key)+100;
			System.out.println(key+","+value);
			 System.out.println(value);
		
		} 
	}
}

