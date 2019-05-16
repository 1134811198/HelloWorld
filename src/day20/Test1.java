package day20;

import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Music("ÏË·òµÄ°®"));
		hs.add(new Music("°®Çô"));
		for (Object o : hs) {
			Music music=(Music)o;
			if(music.getName().length()>3){
				
			}
			
		}
	}

}
class Music{
	private String name;
	

	public Music(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}