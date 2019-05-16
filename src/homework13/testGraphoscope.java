package homework13;
/**
 * 四、多态参数：有一个显示器接口Graphoscope，
 * 具有display方法，有两个类：
 * 台式显示器和液晶显示器都实现显示器接口，
 * 有Computer类，
 * 有个测试显示器testGraphoscope的方法，
 * 要求传入显示器接口对象，测试显示功能，生产两台电脑，
 * 分别配置台式显示器和液晶显示器。查看是否正常运行
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
	
		System.out.println("显示功能正常，生产一台"+s+"的电脑");
		
		}
}
 class TableDisplay  implements Graphoscope{
	public String display(){
		System.out.println("TD显示");
		return "TD显示器";
	}
	
}
 class LCD implements Graphoscope{
    public String display(){
		System.out.println("LCD显示");
		return "LCD显示器";
   }
}