package day15;

public class TestCharacter {
  public static void main(String[]args){
	  char i= 'c';
	  Character i1=new Character(i);//�������ֶ�װ��
	  Character i2=Character.valueOf(i);//�����ֶ�װ��
	  Character j=new Character('c');
	  Character j1=j.charValue();//�����ֶ�����
	  
	  char m='d';
	  Character m1=m;//�Զ�װ��
	  
	  Character n=new Character('e');
	  char n1=n;//�Զ�����
	  
  }
}
