package Homework14;
/**
 * ����һ��Colorö���࣬
1)�� RED,BLUE,BLACK,YELLOW,GREEN������ö��ֵ��
2)Color����������redValue��greenValue��blueValue��
3)�������췽���������������������ԣ�
4)ÿ��ö��ֵ��Ҫ�����������Ը�ֵ���������Զ�Ӧ��ֵ�ֱ���red��255,0,0  blue:0,0,255  black:0,0,0  yellow:255,255,0  green:0,255,0
5������ӿڣ������з���show��Ҫ��Colorʵ�ָýӿ�
Show��������ʾ�����Ե�ֵ
 * @author win10
 *
 */
public class TestColor {
 public static void main(String[]args){
	 Color c1=Color.GREEN;
	 c1.show();
	 
 }
}
interface Show{
	 void show();
}
enum Color implements Show{
	RED(255,0,0),
	BLUE(0,0,255),
	BLACK(0,0,0),
	YELLOW(255,255,0),
	GREEN(0,255,0);
	private int redValue;
	private int greenValue;
	private int blueValue;
	private Color(int redValue, int greenValue, int blueValue) {
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	public void show(){
		System.out.println(redValue+"\t"+greenValue+"\t"+blueValue);
	}
	
}