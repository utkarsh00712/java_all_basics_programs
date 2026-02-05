package ComparableInterface;



public class Product implements Comparable<Product> {
private String name;
private double price;
public Product(String name, double price) {
	super();
	this.name = name;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public int compareTo(Product o) {
	if(this.price>o.price) {
		return 1;
	} else if(this.price<o.price) {
		return -1;
	} else {
	return 0;
	}
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product{name='" +  name +"'" + ", price=" + price +"}";
	}

} 
