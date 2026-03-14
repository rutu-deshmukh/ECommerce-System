package ecommerce;
import java.util.*;
import com.products.*;
import com.cart.*;
import Orders.*;
import customer.*;

	public class EcommerceSystem {

	    public static void main(String[] args){

	        Scanner sc=new Scanner(System.in);

	        List<Product> products = new ArrayList<>();

	        products.add(new ElectronicsProduct("E001","Smartphone",50000,"5G Mobile",50,"Samsung",24));
	        products.add(new ClothingProduct("C001","T-Shirt",1200,"Cotton Shirt",100,"M","Blue","Cotton"));
	        products.add(new BookProduct("B001","Java Programming",800,"Learn Java",70,"John","978316",400));

	        ShoppingCart cart = new ShoppingCart();

	        while(true){

	            System.out.println("\n=== ECOMMERCE SYSTEM ===");
	            System.out.println("1 View Products");
	            System.out.println("2 Add to Cart");
	            System.out.println("3 View Cart");
	            System.out.println("4 Checkout");
	            System.out.println("5 Exit");

	            int choice=sc.nextInt();

	            switch(choice){

	                case 1:

	                    for(Product p:products){
	                        p.displayInfo();
	                    }
	                    break;

	                case 2:

	                    System.out.println("Enter Product ID:");

	                    String id=sc.next();

	                    System.out.println("Enter Quantity:");

	                    int qty=sc.nextInt();

	                    for(Product p:products){

	                        if(p.getId().equals(id)){

	                            cart.addItem(p,qty);

	                            System.out.println("Product added to cart");
	                        }
	                    }

	                    break;

	                case 3:

	                    cart.displayCart();
	                    break;

	                case 4:

	                    Order order=new Order(cart);

	                    order.displayOrder();
	                    break;

	                case 5:

	                    System.exit(0);
	            }
	        }
	    }
	}

