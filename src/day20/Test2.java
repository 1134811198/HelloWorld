package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**����   
 * List:������ظ�     ʵ������ArrayList��LinkedList��Vector 
 * Set:���򲻿��ظ�    ʵ������HashSet��TreeSet
 *
 *                 
 *
 */
public class Test2 {
public static void main(String[] args) {
	//��ʽһ��
	      Map map=new HashMap();
          Set keys= map.keySet();
          Iterator iter=keys.iterator();
          while(iter.hasNext()){
        	  Object key=iter.next();
        	  Object value=map.get(key);
        	  System.out.println(key+"-"+value);
    //��ʽ����
        	Set entrys=map.entrySet(); 
        	for(Object entry:entrys){
        		Map.Entry e=(Entry) entry;
        		Object key2=e.getKey();
        		Object value2=e.getValue();
        		System.out.println(key+"-"+value);
        	}
        	  
          }
}
}
     
