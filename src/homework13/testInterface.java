package homework13;
/**
 * һ������һ���ӿ�����ʵ����������ıȽϡ�
interface CompareObject{
public int compareTo(Object o);   //������ֵ�� 0 , �������; ��Ϊ����������ǰ����󣻸�������ǰ����С 
}
���������Rectangle��ComparableRectangle�࣬��ComparableRectangle���и���compareTo������ʵ�֣��Ƚ��������ε������С��
��

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
		
		
	
