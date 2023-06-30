package entities;

public class Product{

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//It's gonna work with the Product we give to him as an argument 'Product p'
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100;
	}
	
	//non-Static methods are working with the object that we are right now, so we don't need to pass arguments
	public boolean nonStaticProductPredicate() {
		return price >= 100;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}