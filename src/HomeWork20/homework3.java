package HomeWork20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ������Ҫ�������������
1��ʹ��HashMap��ʵ����һ��Map���͵Ķ���m1��
����String���ͣ���ֵ��int�ͣ��ֱ����ڴ洢Ա���������͹��ʣ�
�����������£�	��������800Ԫ�����ġ���1500Ԫ�����塪��3000Ԫ��
2��	�������Ĺ��ʸ���Ϊ2600Ԫ
3��	Ϊ����Ա�����ʼ�н100Ԫ��
4��	�������������е�Ա��
5��	�������������еĹ���

 * @author win10
 *
 */
public class homework3 {
	public static void main(String[] args) {
		Map <String,Integer>hm=new HashMap<String,Integer>();
		hm.put("����", 800);
		hm.put("����", 1500);
		hm.put("����", 3000);
		hm.remove("����", 800);
		hm.put("����", 2600);
		
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

