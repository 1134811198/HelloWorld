package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**区别：   
 * List:有序可重复     实现类是ArrayList，LinkedList，Vector 
 * Set:无序不可重复    实现类是HashSet，TreeSet
 *
 *                 
 *
 */
public class Test2 {
public static void main(String[] args) {
	//方式一：
	      Map map=new HashMap();
          Set keys= map.keySet();
          Iterator iter=keys.iterator();
          while(iter.hasNext()){
        	  Object key=iter.next();
        	  Object value=map.get(key);
        	  System.out.println(key+"-"+value);
    //方式二：
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
     
