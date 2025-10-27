package java_practice;

import java.util.HashSet;
import java.util.Set;

class Product {
	private int id;
	private String name;
	private double price;
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	}

interface Ecommerce {
    void addProduct(Product product);
    Set<Product> getAllProducts();
    //Order placeOrder(Set<product>);
    double generateBill(int orderId);
}
public class seller implements Ecommerce{
	private Set<Product> productSet;
	public seller() {
		this.productSet=new HashSet<>();
	}
	public void addProduct(Product product) {
		if(productSet.add(product))
			System.out.println("product added"+product.getName());
		else
			System.out.println("poduct with id: "+product.getId()+" is already in the set");
	}
	public Set<Product> getAllProducts(){
		return this.productSet;
	}
}
public class exp_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seller1 ee=new seller1();
		ee.addProduct(new Product(1,"mobile",20000.00));
		ee.addProduct(new Product(2,"car",15000.00));
		ee.addProduct(new Product(3,"ipad",45000.00));
		ee.addProduct(new Product(4,"watch",5678.00));
		//try adding duplicates
		ee.addProduct(new Product(1,"mobile new",45670.00));
		System.out.println("all products: ");
		ee.getAllProducts().forEach(System.out::println);
	}

}
