package HomeWork20;
/**
 * 一、开发一个泛型Apple类，要求有一个重量属性weight在测试类中实例化不同的泛型对象，
 * 要求对象a1的这一属性是String类型，对象a2的这一属性是Integer型，a3的这一属性是Double型。分别为a1，a2，a3的重量属性赋值为：
 * ”500克”，500,500.0，在测试类中通过对象调用访问器得到属性值并输出。另外思考，
 * 为什么a2和a3的属性需要是Integer和Double而不是int和double？
 * @author win10
 *
 */
public class homework1 {
	public static void main(String[] args) {
		Apple<String> a1=new Apple<String>("500克");
	    Apple<Integer> a2=new Apple<Integer>(500);
	    Apple<Double> a3=new Apple<Double>(500.0);
	    System.out.println(a1.getWeight());
	    System.out.println(a2.getWeight());
	    System.out.println(a3.getWeight());
	    
	    //为什么a2和a3的属性需要是Integer和Double而不是int和double？
	    //因为必须是引用类型，必须进行合理的封装
	    
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