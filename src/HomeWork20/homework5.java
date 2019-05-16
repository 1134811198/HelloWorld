package HomeWork20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 五、1 ）封装一个汽车类，包含String  name、int  speed属性，
 * 在测试类中实例化三个对象：c1，c2，c3，分别设置name为：“奥拓”，“宝马”，“奔驰”，速度分别设置为：100,200,300
2 ）使用Map集合对象m1将这三个汽车类对象保存成key，然后将int型的汽车价钱作为值保存在m1的value中，
上述三款汽车分别对应的价钱是10000,500000,2000000
3 ）遍历m1的键，打印name属性
4 ）通过合适的方法，求出m1中“宝马”的价格，并打印结果；
5 ）经过折旧，所有汽车都降价到原来的80%，请打印降价后“宝马”的价格

 * @author win10
 *
 */
public class homework5 {
     public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(new Car("奥拓",100).getName(), 10000);
		m1.put(new Car("宝马",200).getName(), 500000);
		m1.put(new Car("奔驰",100).getName(), 2000000);
		Set entrys=m1.entrySet();
		for (Object entry : entrys) {
			Map.Entry e=(Entry) entry;
			e.getKey();
			e.getValue();
		System.out.println(e.getKey()+","+e.getValue());	
		}
		Set keys=m1.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()){
			Object key=iter.next();
			Object value=m1.get(key);
			//System.out.println(key+","+value);
			if(key=="宝马")
				System.out.println(m1.get(key));
		}
		for (Object entry : entrys) {
			Map.Entry e=(Entry) entry;
			Object key=e.getKey();
			int  price=(int) e.getValue();
			price=(int) (price*0.8);
			
		if(key=="宝马")
			System.out.println(price);
		}
	}
	

}
class Car{
	private String name;
	private int speed;
	
	public Car(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}