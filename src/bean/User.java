package bean;


class Super{
	public String nation;
	protected String color;
}
public class User  extends Super {

	private int id;
	protected String name;
	public int age;
	
	public User() {
		super();
	}
	protected int method(int a,String b,char c){
		return 0;
	}
	private void show(Object...objects){
		System.out.println("show");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}