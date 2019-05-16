package day15;

public class TestCharacter {
  public static void main(String[]args){
	  char i= 'c';
	  Character i1=new Character(i);//构造器手动装箱
	  Character i2=Character.valueOf(i);//方法手动装箱
	  Character j=new Character('c');
	  Character j1=j.charValue();//方法手动拆箱
	  
	  char m='d';
	  Character m1=m;//自动装箱
	  
	  Character n=new Character('e');
	  char n1=n;//自动拆箱
	  
  }
}
