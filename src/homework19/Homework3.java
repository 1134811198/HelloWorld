package homework19;

import java.util.ArrayList;



/**
 * ������Ҫ��ʵ���������⣺
1)��װһ�������࣬����������������ԣ��ṩget��set��������дtoString��������ӡ����ʱֻ��ӡ���⣻��
2)ֻ�ṩһ���������Ĺ�������ʵ��������ʱ��ֻ��ʼ�����⣻����ʵ������������
����һ���й�������������ֿ��������ٳ����黰��
���Ŷ��������ٽ������������ȡ�
3)�����Ŷ�����ӵ�ArrayList�����У����ҽ��е��������
4)�ڱ������Ϲ����У������ű�����д�������15�ֵ�ֻ����ǰ14����Ȼ���ں�߼ӡ�����
5)�ڿ���̨��ӡ������������������ű��⣻

 * @author win10
 *
 */
public class Homework3 {
	public static void main(String[] args) {
		News n1=new News("�й�������������ֿ��������ٳ����黰��");
		News n2=new News("�����ٽ������������ȡ�");
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
