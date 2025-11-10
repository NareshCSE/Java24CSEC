package ecommerce;
import java.util.HashSet;

public class Seller {
//	 Seller: Add  Products (id,name and price) bean  into HashSet.
     HashSet<Product> productList = new HashSet<>();
     
     public void addProduct(Product p) {
    	 productList.add(p);
     }
     
     public HashSet<Product> getProduct(){
    	 return productList;
     }
     
}
