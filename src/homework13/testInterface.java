package homework13;
/**
 * 一、定义一个接口用来实现两个对象的比较。
interface CompareObject{
public int compareTo(Object o);   //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小 
}
定义矩形类Rectangle和ComparableRectangle类，在ComparableRectangle类中给出compareTo方法的实现，比较两个矩形的面积大小。
义

 * @author win10
 *
 */
public class testInterface {
	public static void main(String[]args){
	ComparebleRectangle c1=new ComparebleRectangle(4,5);
	ComparebleRectangle c2=new ComparebleRectangle(3,4);
	System.out.println(c1.compareTo(c2));
    }
}
interface CompareObject{
	public int compareTo(Object o);
}
class Rectangle{
	private int w;
	private int h;
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	public int getArea(){
		return w*h;
		
	}
	
}
class ComparebleRectangle extends Rectangle implements CompareObject{
	public ComparebleRectangle(int w,int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Object o){
		if(!(o instanceof ComparebleRectangle) )
		return -1;
		ComparebleRectangle cc=(ComparebleRectangle) o;
		if(this.getArea()>cc.getArea())
			return 1;
		else if(this.getArea()<cc.getArea())
			return -1;
		return 0;}
	}
		
		
	
