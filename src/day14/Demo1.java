package day14;

public class Demo1 {
   public static void main(String[]args){
	   Week Monday=Week.MONDAY;
	   Week Monday2=Week.MONDAY;
	   System.out.println(Monday);
	   System.out.println(Monday2);
	   System.out.println(Monday.name());
	   System.out.println(Monday2.name());
	   Week[] w = Week.values();
		for(int i = 0;i < w.length;i++){
			System.out.println(w[i]);
			}
		Week2[] w2 = Week2.values();
		for(int j = 0;j < w2.length;j++){
			System.out.println(w[j]);
			}
	
   }
}
enum Week{
	MONDAY,TUESDAY,WEDSDAY,THURSAY,FRIDAY,SATURDAY,SUNDAY;
}
enum Week2{
	MONDAY("一"),
	TUESDAY("二"),
	WEDSDAY("三"),
	THURSAY("四"),
	FRIDAY("五"),
	SATURDAY("六"),
	SUNDAY("七");
 private String name;
 
	

	public String getName() {
	return name;
}



	private Week2(String name) {
		this.name = name;
	}
	
}