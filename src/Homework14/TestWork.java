package Homework14;
/**
 * ������һ���ӿ���Works��
 * �����и�������ʾ ÿ���·ݵ�������
 * Ҫ������ �ڶ��ⶨ��� �·�ö����ʵ�ָù���
 * @author win10
 *
 */
public class TestWork {
   public static void main(String[]args){
	   Month[]m= Month.values();
	  
	   for(int i=0;i<m.length;i++){
	
		   System.out.println(m[i]);  
	   }
	  
	  
   }
}
interface Works{
	void show();
}
enum Month implements Works{
	JAN{public void show(){System.out.println("31");}},
	FEB{public void show(){System.out.println("28");}},
	MAR{public void show(){System.out.println("31");}},
	APR{public void show(){System.out.println("31");}},
	MAY{public void show(){System.out.println("31");}},
	JUN{public void show(){System.out.println("31");}},
	JUL{public void show(){System.out.println("31");}},
	AUG{public void show(){System.out.println("31");}},
	SEP{public void show(){System.out.println("31");}},
	OCT{public void show(){System.out.println("31");}},
	NOV{public void show(){System.out.println("31");}},
	DEC{public void show(){System.out.println("31");}};
	public String toString(){
		return
	}
	
}