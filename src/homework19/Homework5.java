package homework19;

import java.util.Map;
import java.util.TreeMap;

/**
 * �塢���ѧ�����뿼�Է���¼�뵽map�У�����������ʾǰ�����ɼ�ѧԱ������.��ô��mapʵ��?
 * @author win10
 *
 */
public class Homework5 {
   public static void main(String[] args) {
	Map map=new TreeMap();
	map.put("��ʫʫ", 100.0);
	map.put("�����", 99.0);
	map.put("������", 90.0);
	map.put("������", 90.5);
	map.put("������", 99.0);
	map.put("������", 99.0);
	System.out.println(map);
   }
}
class Studentt{
	private String name;
	private double score;
	
	public Studentt(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
