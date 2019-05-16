package homework19;

import java.util.ArrayList;



/**
 * 三、按要求实现下列问题：
1)封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象时只打印标题；）
2)只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：
新闻一：中国多地遭雾霾笼罩空气质量再成热议话题
新闻二：春节临近北京“卖房热”
3)将新闻对象添加到ArrayList集合中，并且进行倒序遍历；
4)在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前14个，然后在后边加“…”
5)在控制台打印遍历出经过处理的新闻标题；

 * @author win10
 *
 */
public class Homework3 {
	public static void main(String[] args) {
		News n1=new News("中国多地遭雾霾笼罩空气质量再成热议话题");
		News n2=new News("春节临近北京“卖房热”");
		ArrayList alist=new ArrayList();
		alist.add(n1);
		alist.add(n2);
	//	System.out.println(alist);
//		Iterator iter=alist.iterator();
//		while(iter.hasNext()){
//			Object o=iter.next();
//			System.out.println();
//		}
		for(int i=alist.size()-1;i>-1;i--){
			Object o=alist.get(i);
			if(o.toString().length()>15){
				
			   String o1=o.toString().substring(0, 14)+"...";
			    System.out.println(o1);
			    }else System.out.println(o);
			
		}
		
		
	}

}
class News{
	private String title;
	private String content;
	
	public News(String title) {
		this.title=title;
	}
	@Override
	public String toString() {
		return "news [title=" + title + "]";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
