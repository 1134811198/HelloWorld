package HomeWork20;
/**
 * һ������һ������Apple�࣬Ҫ����һ����������weight�ڲ�������ʵ������ͬ�ķ��Ͷ���
 * Ҫ�����a1����һ������String���ͣ�����a2����һ������Integer�ͣ�a3����һ������Double�͡��ֱ�Ϊa1��a2��a3���������Ը�ֵΪ��
 * ��500�ˡ���500,500.0���ڲ�������ͨ��������÷������õ�����ֵ�����������˼����
 * Ϊʲôa2��a3��������Ҫ��Integer��Double������int��double��
 * @author win10
 *
 */
public class homework1 {
	public static void main(String[] args) {
		Apple<String> a1=new Apple<String>("500��");
	    Apple<Integer> a2=new Apple<Integer>(500);
	    Apple<Double> a3=new Apple<Double>(500.0);
	    System.out.println(a1.getWeight());
	    System.out.println(a2.getWeight());
	    System.out.println(a3.getWeight());
	    
	    //Ϊʲôa2��a3��������Ҫ��Integer��Double������int��double��
	    //��Ϊ�������������ͣ�������к���ķ�װ
	    
	}
    
    
}
class Apple<A>{
	private A weight;
	

	public Apple(A weight) {
		super();
		this.weight = weight;
	}

	public A getWeight() {
		return weight;
	}

	public void setWeight(A weight) {
		this.weight = weight;
	}
	

	
}