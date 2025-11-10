package javaExp;

import java.util.*;

class Product{
private int id;
private String name;
private double price;
public Product(int id,String name,double price){
this.id=id;
this.name=name;
this.price=price;
}
public int getId(){return id;}
public String getName(){return name;}
public double getPrice(){return price;}
public int hashCode(){return id;}
public boolean equals(Object o){
if(this==o)
	return true;
if(o==null||getClass()!=o.getClass())
	return false;
Product p=(Product)o;
return id==p.id;
}
}
class Seller{
HashSet<Product> products=new HashSet<>();
public void addProduct(Product p){
	products.add(p);
	}
public HashSet<Product> getProducts(){
	return products;
	}
}
class Customer{
public void orderProduct(HashSet<Product> products,List<Integer> orderIds){
double total=0;
System.out.println("Ordered Products:");
for(Product p:products){
if(orderIds.contains(p.getId())){
System.out.println("ID:"+p.getId()+" Name:"+p.getName()+" Price:"+p.getPrice());
total+=p.getPrice();
}
}
System.out.println("Total Price:"+total);
}
}
class Q18eCommerce{
public static void main(String[] args){
Seller s=new Seller();
s.addProduct(new Product(1,"Laptop",50000));
s.addProduct(new Product(2,"Mouse",500));
s.addProduct(new Product(3,"Keyboard",800));
Customer c=new Customer();
List<Integer> orderIds=new ArrayList<>();
orderIds.add(1);
orderIds.add(3);
c.orderProduct(s.getProducts(),orderIds);
}
}

