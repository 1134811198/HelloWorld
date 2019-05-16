package homework19;

import java.util.Map;
import java.util.TreeMap;

/**
 * 五、请把学生名与考试分数录入到map中，并按分数显示前三名成绩学员的名字.怎么用map实现?
 * @author win10
 *
 */
public class Homework5 {
   public static void main(String[] args) {
	Map map=new TreeMap();
	map.put("刘诗诗", 100.0);
	map.put("刘亦菲", 99.0);
	map.put("刘晓庆", 90.0);
	map.put("范冰冰", 90.5);
	map.put("范玮琪", 99.0);
	map.put("范玮琪", 99.0);
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
