package HomeWork20;

import java.util.ArrayList;

/**
 * ������װһ��������News���������ű��⣬�������ߣ��������ݣ����������������ԣ��ṩ��Ҫ�ķ��������޸���������
 * ��дtoString������Ҫ���ӡ����ʱ�����ʽΪ�����⣻���ͣ����ߡ���Ҫ��ֻҪ���ű�����ͬ���ж�Ϊͬһ�����š�
 * �ڲ������д���һ��ֻ�����ɸ�������ArrayList���ϣ�����������š��������ϣ���ӡ���ű��⣬�����ű����ȡ�ַ�����10�����ֵĳ��ȡ�
 * @author win10
 *
 */
public class homework2 {
	public static void main(String[] args) {
		ArrayList <News>alist=new ArrayList<News>();
		alist.add(new News("�봨������봨������봨������봨������봨�����","�봨�봨�봨","�"));
		alist.add(new News("ŦԼʱװ��ŦԼʱװ��ŦԼʱװ��ŦԼʱװ��","ŦԼŦԼŦԼ","����"));
		alist.add(new News("���谣�ƶ�","����������","����"));
		for (News news : alist) {
			if(news.getTitle().length()>=10){
			System.out.println(news.getTitle().substring(0, 10));}
			else{
				System.out.println(news.getTitle());}
		}
		
	}
}
class News{
	private String title;
	private String author;
	private String content;
	
	
	
	@Override
	public String toString() {
		return title+";"+content+";"+author;
	}
	public News(String title, String author, String content) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}