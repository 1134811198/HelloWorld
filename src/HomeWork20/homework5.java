package HomeWork20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * �塢1 ����װһ�������࣬����String  name��int  speed���ԣ�
 * �ڲ�������ʵ������������c1��c2��c3���ֱ�����nameΪ�������ء����������������ۡ����ٶȷֱ�����Ϊ��100,200,300
2 ��ʹ��Map���϶���m1����������������󱣴��key��Ȼ��int�͵�������Ǯ��Ϊֵ������m1��value�У�
�������������ֱ��Ӧ�ļ�Ǯ��10000,500000,2000000
3 ������m1�ļ�����ӡname����
4 ��ͨ�����ʵķ��������m1�С������ļ۸񣬲���ӡ�����
5 �������۾ɣ��������������۵�ԭ����80%�����ӡ���ۺ󡰱����ļ۸�

 * @author win10
 *
 */
public class homework5 {
     public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put(new Car("����",100).getName(), 10000);
		m1.put(new Car("����",200).getName(), 500000);
		m1.put(new Car("����",100).getName(), 2000000);
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
			if(key=="����")
				System.out.println(m1.get(key));
		}
		for (Object entry : entrys) {
			Map.Entry e=(Entry) entry;
			Object key=e.getKey();
			int  price=(int) e.getValue();
			price=(int) (price*0.8);
			
		if(key=="����")
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