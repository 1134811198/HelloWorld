package HomeWork20;




import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。

分别创建以下方法：
public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
public T get(String id)：从 map 中获取 id 对应的对象
public void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
public List<T> list()：返回 map 中存放的所有 T 对象
public void delete(String id)：删除指定 id 对象

定义一个 User 类：
该类包含：private成员变量（int类型） id，age；（String 类型）name。
创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
使用 Junit 单元测试类进行测试。
 */
public class homework6Test {
	public static void main(String[] args) {
		User u1=new User(1,18,"小一");
		User u2=new User(2,20,"小二");
		User u3=new User(3,19,"小三");
		Map map=new HashMap<String,Integer>();
		DAO d1=new DAO(map);
		//保存 T 类型的对象到 Map 成员变量中
		d1.save(u1.getId()+"", u1.getAge());
		System.out.println(d1);
		//从 map 中获取 id 对应的对象
		d1.get(u1.getId()+"");
		System.out.println(d1.get(u1.getId()+""));
		//替换 map 中key为id的内容,改为 entity 对象
		d1.update(u1.getId()+"", u1.getAge());;
		//：返回 map 中存放的所有 T 对象
//		d1.list();
//		System.out.println(d1.list());
		//：删除指定 id 对象
	
		String id=u1.getId()+"";
		d1.delete(id);
		System.out.println(map);
		
	}
	
}
class User{
	private int id;
	private int age;
	private String name;
	
	public User(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class DAO<T>{
	
	
	Map map=new HashMap<String,T>();
	
	
	@Override
	public String toString() {
		return "DAO [map=" + map + "]";
	}
@Test
	//：删除指定 id 对象
	public void delete(String id){
		map.remove(id);
	}
@Test	
	//：返回 map 中存放的所有 T 对象
	public List<T> list(){
	List list=new ArrayList<T>();
		Set entrys=map.keySet();
		for (Object entry : entrys) {
			Map.Entry e=(Entry) entry;
			list.add(e.getValue());
		
		}
	
		return list;
	}
@Test
	//：替换 map 中key为id的内容,改为 entity 对象
	public void update(String id,T entity){
	    List list=new ArrayList<T>();
	    list.add(map);
         Collections.swap(list, i, j);

		
}
@Test
	//：从 map 中获取 id 对应的对象
	public T get(String id){
	
		return (T) map.get(id);
	}
	//保存 T 类型的对象到 Map 成员变量中
	public void save(String id,T entity){
        map.put(id, entity);
		
		}
	public DAO(Map map) {
		super();
		this.map = map;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	
}
