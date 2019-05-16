package HomeWork20;

import java.util.ArrayList;

/**
 * 二、封装一个新闻类News，包含新闻标题，新闻作者，新闻内容，新闻类型三个属性，提供必要的访问器和修改器方法，
 * 重写toString方法，要求打印对象时输出格式为“标题；类型；作者”，要求只要新闻标题相同就判断为同一条新闻。
 * 在测试类中创建一个只能容纳该类对象的ArrayList集合，添加三条新闻。遍历集合，打印新闻标题，将新闻标题截取字符串到10个汉字的长度。
 * @author win10
 *
 */
public class homework2 {
	public static void main(String[] args) {
		ArrayList <News>alist=new ArrayList<News>();
		alist.add(new News("汶川大地震汶川大地震汶川大地震汶川大地震汶川大地震","汶川汶川汶川","李芳"));
		alist.add(new News("纽约时装周纽约时装周纽约时装周纽约时装周","纽约纽约纽约","张三"));
		alist.add(new News("巴黎埃菲尔","巴黎巴黎巴黎","赵四"));
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