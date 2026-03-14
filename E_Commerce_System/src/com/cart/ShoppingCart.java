package com.cart;
import java.util.*;
import com.products.Product;

	public class ShoppingCart {

	    private List<CartItem> items = new ArrayList<>();

	    public void addItem(Product product,int quantity){

	        for(CartItem item:items){

	            if(item.getProduct().getId().equals(product.getId())){
	                item.setQuantity(item.getQuantity()+quantity);
	                return;
	            }
	        }

	        items.add(new CartItem(product,quantity));
	    }

	    public void displayCart(){

	        double total=0;

	        System.out.println("\n=== SHOPPING CART ===");

	        for(CartItem item:items){

	            Product p=item.getProduct();

	            System.out.println(p.getName()+" | Qty:"+item.getQuantity()+" | Price:"+p.getFinalPrice());

	            total += item.getItemTotal();
	        }

	        System.out.println("Total Amount: ₹"+total);
	    }

	    public double getTotalAmount(){

	        double total=0;

	        for(CartItem item:items){
	            total += item.getItemTotal();
	        }

	        return total;
	    }
	}

