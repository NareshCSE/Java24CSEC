package ecommerce;

public class Client {
	
//	 (e-commerce application)  Seller: Add  Products (id,name and price) bean  into HashSet. 
//	 Customer: If any products ordered by customer, 
//	 compare with the data stored and display the total price along with the details of product.
//	 (Use bean and client classes)


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Seller s = new Seller();
        
        s.addProduct(new Product(1,"Laptop",60000));
        s.addProduct(new Product(2,"Ipad",50000));
        s.addProduct(new Product(3,"Computer",40000));
        s.addProduct(new Product(4,"Phone",20000));
        s.addProduct(new Product(5,"Grinder",8000));
        
        Customer c = new Customer();
        int[] orderIds = {1, 3};  // ✅ ordering Laptop + Headphones

        c.orderProducts(orderIds, s);
	}

}
