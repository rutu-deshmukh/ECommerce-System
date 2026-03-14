package Orders;
import java.util.*;
import com.cart.ShoppingCart;

	public class Order {

	    private static int orderCounter=1000;

	    private String orderId;
	    private Date orderDate;
	    private double finalAmount;

	    public Order(ShoppingCart cart){

	        orderId="ORD"+orderCounter++;
	        orderDate=new Date();

	        double total=cart.getTotalAmount();

	        finalAmount = total * 1.18;
	    }

	    public void displayOrder(){

	        System.out.println("\n=== ORDER DETAILS ===");

	        System.out.println("Order ID: "+orderId);
	        System.out.println("Order Date: "+orderDate);
	        System.out.println("Final Amount with GST: ₹"+finalAmount);

	        System.out.println("Order Confirmed!");
	    }
	}

