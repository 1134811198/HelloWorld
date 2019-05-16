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
 * ����������� DAO<T>�������ж���һ��Map ��Ա������Map �ļ�Ϊ String ���ͣ�ֵΪ T ���͡�

�ֱ𴴽����·�����
public void save(String id,T entity)�� ���� T ���͵Ķ��� Map ��Ա������
public T get(String id)���� map �л�ȡ id ��Ӧ�Ķ���
public void update(String id,T entity)���滻 map ��keyΪid������,��Ϊ entity ����
public List<T> list()������ map �д�ŵ����� T ����
public void delete(String id)��ɾ��ָ�� id ����

����һ�� User �ࣺ
���������private��Ա������int���ͣ� id��age����String ���ͣ�name��
���� DAO ��Ķ��� �ֱ������ save��get��update��list��delete ���������� User ����
ʹ�� Junit ��Ԫ��������в��ԡ�
 */
public class homework6Test {
	public static void main(String[] args) {
		User u1=new User(1,18,"Сһ");
		User u2=new User(2,20,"С��");
		User u3=new User(3,19,"С��");
		Map map=new HashMap<String,Integer>();
		DAO d1=new DAO(map);
		//���� T ���͵Ķ��� Map ��Ա������
		d1.save(u1.getId()+"", u1.getAge());
		System.out.println(d1);
		//�� map �л�ȡ id ��Ӧ�Ķ���
		d1.get(u1.getId()+"");
		System.out.println(d1.get(u1.getId()+""));
		//�滻 map ��keyΪid������,��Ϊ entity ����
		d1.update(u1.getId()+"", u1.getAge());;
		//������ map �д�ŵ����� T ����
//		d1.list();
//		System.out.println(d1.list());
		//��ɾ��ָ�� id ����
	
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
	//��ɾ��ָ�� id ����
	public void delete(String id){
		map.remove(id);
	}
@Test	
	//������ map �д�ŵ����� T ����
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
	//���滻 map ��keyΪid������,��Ϊ entity ����
	public void update(String id,T entity){
	    List list=new ArrayList<T>();
	    list.add(map);
         Collections.swap(list, i, j);

		
}
@Test
	//���� map �л�ȡ id ��Ӧ�Ķ���
	public T get(String id){
	
		return (T) map.get(id);
	}
	//���� T ���͵Ķ��� Map ��Ա������
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
