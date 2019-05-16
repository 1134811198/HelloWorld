package HomeWork20;

import java.util.HashSet;

/**
 * 
 * @author win10
 *
 */
public class homework4 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Phone("三星",4000,"Gt-n5100"));
		hs.add(new Phone("苹果",7000,"8plus"));
		hs.add(new Phone("vivo",2900,"X20"));
		//遍历
		for (Object object : hs) {
			System.out.println(object);
			double p=((Phone) object).getPrice();
			//判断价格是否小于3000
			if(p<3000){
				p=p+500;
			System.out.println(p);}
			else{
				System.out.println(p);}
		}
	}
	
}
class Phone{
	private String brand;
	private double price;
	private String model;
	
	
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", price=" + price + ", model=" + model + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	public Phone(String brand, double price, String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
