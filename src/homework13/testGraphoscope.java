package homework13;
/**
 * �ġ���̬��������һ����ʾ���ӿ�Graphoscope��
 * ����display�������������ࣺ
 * ̨ʽ��ʾ����Һ����ʾ����ʵ����ʾ���ӿڣ�
 * ��Computer�࣬
 * �и�������ʾ��testGraphoscope�ķ�����
 * Ҫ������ʾ���ӿڶ��󣬲�����ʾ���ܣ�������̨���ԣ�
 * �ֱ�����̨ʽ��ʾ����Һ����ʾ�����鿴�Ƿ���������
 * @author win10
 *
 */
public class testGraphoscope {
	public static void main(String[]args){
		Computer c1=new Computer();
		TableDisplay t=new TableDisplay();
		c1.testGrapho(t);
		LCD l=new LCD();
		c1.testGrapho(l);
		
	}
}
interface Graphoscope{
	String display();
}
class Computer{
 
	public void testGrapho(Graphoscope g){
		String s = g.display();
	
		System.out.println("��ʾ��������������һ̨"+s+"�ĵ���");
		
		}
}
 class TableDisplay  implements Graphoscope{
	public String display(){
		System.out.println("TD��ʾ");
		return "TD��ʾ��";
	}
	
}
 class LCD implements Graphoscope{
    public String display(){
		System.out.println("LCD��ʾ");
		return "LCD��ʾ��";
   }
}