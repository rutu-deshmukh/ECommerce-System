# E-Commerce System with Product Hierarchy (Java)

## 1. Project Overview

The **E-Commerce System** is a console-based Java application that simulates the basic functionality of an online shopping platform. The system allows customers to view different types of products, add them to a shopping cart, and place orders.

This project demonstrates important **Object-Oriented Programming (OOP) concepts** such as:

* Inheritance
* Polymorphism
* Abstraction
* Encapsulation
* Package structure in Java

The system also implements **cart management, order processing, product hierarchy, and discount calculation**.

---

# 2. Objectives of the Project

The main objectives of this project are:

* To design a structured **product hierarchy**
* To demonstrate **inheritance and polymorphism**
* To implement a **shopping cart system**
* To manage **customer orders**
* To apply **package organization in Java**
* To simulate real-world **E-commerce functionality**

---

# 3. Technologies Used

| Technology       | Purpose              |
| ---------------- | -------------------- |
| Java             | Programming Language |
| OOP Concepts     | System Design        |
| Java Collections | Data Storage         |
| Scanner          | User Input           |
| Packages         | Code Organization    |

---

# 4. Key Features

## Product Management

* Supports multiple product types:

  * Electronics
  * Clothing
  * Books
* Each product contains:

  * Product ID
  * Name
  * Price
  * Description
  * Stock Quantity

## Product Hierarchy

The project uses **Inheritance** to create different product types.

Product (Abstract Class)

* ElectronicsProduct
* ClothingProduct
* BookProduct

Each product type implements its own **discount calculation method** using **Polymorphism**.

---

## Discount System

Different product categories provide different discounts.

| Product Type | Discount |
| ------------ | -------- |
| Electronics  | 10%      |
| Clothing     | 15%      |
| Books        | 10%      |

The final price is calculated as:

Final Price = Price − Discount

---

## Shopping Cart System

The Shopping Cart allows customers to:

* Add products to cart
* Update product quantity
* Remove products
* View cart items
* Calculate total price

Each item in the cart contains:

* Product object
* Quantity
* Total item cost

---

## Order Management

The Order module handles:

* Order creation
* Order ID generation
* Order date
* Total bill calculation
* GST addition

GST applied in the system: **18%**

Final Amount Calculation:

Final Amount = Cart Total + GST

---

## Customer Management

Customer information stored includes:

* Customer ID
* Customer Name
* Email

This module represents a simple **customer record system**.

---

# 5. Project Architecture

The project uses **Java Package Structure** to organize code.

```
ecommerce
│
├── products
│   ├── Product.java
│   ├── ElectronicsProduct.java
│   ├── ClothingProduct.java
│   └── BookProduct.java
│
├── cart
│   ├── CartItem.java
│   └── ShoppingCart.java
│
├── orders
│   └── Order.java
│
├── customer
│   └── Customer.java
│
└── ECommerceSystem.java
```

---

# 6. Class Descriptions

## Product (Abstract Class)

This class acts as the base class for all product types.

Attributes:

* id
* name
* price
* description
* stockQuantity

Methods:

* calculateDiscount()
* getFinalPrice()
* displayInfo()

The method **calculateDiscount()** is abstract and implemented by subclasses.

---

## ElectronicsProduct

Represents electronic items.

Additional Attributes:

* brand
* warrantyMonths

Discount: **10%**

---

## ClothingProduct

Represents clothing items.

Additional Attributes:

* size
* color
* material

Discount: **15%**

---

## BookProduct

Represents books.

Additional Attributes:

* author
* isbn
* pages

Discount: **10%**

---

## CartItem

Represents a single product item in the shopping cart.

Attributes:

* Product object
* Quantity

Methods:

* getItemTotal()

---

## ShoppingCart

Manages all cart operations.

Functions:

* Add product to cart
* Remove product
* Update quantity
* Display cart items
* Calculate total amount

---

## Order

Handles order creation.

Attributes:

* orderId
* orderDate
* finalAmount

Features:

* Automatic order ID generation
* GST calculation
* Order summary display

---

## Customer

Stores customer details.

Attributes:

* customerId
* name
* email

---

# 7. System Workflow

Step 1
User runs the program.

Step 2
System displays menu:

1. View Products
2. Add to Cart
3. View Cart
4. Checkout
5. Exit

Step 3
User selects products and adds them to the cart.

Step 4
Shopping cart calculates the total price.

Step 5
When checkout is selected:

* Order is created
* GST is applied
* Final bill is generated

---

# 8. Sample Output

```
=== ECOMMERCE SYSTEM ===

1 View Products
2 Add to Cart
3 View Cart
4 Checkout
5 Exit
```

Example product display:

```
ID: E001
Name: Smartphone
Price: ₹50000
Discount: ₹5000
Final Price: ₹45000
Type: Electronics
Brand: Samsung
Warranty: 24 months
```

Cart Example:

```
=== SHOPPING CART ===

Smartphone | Qty:1 | Price:45000
T-Shirt | Qty:2 | Price:1020

Total Amount: ₹47040
```

Order Example:

```
=== ORDER DETAILS ===

Order ID: ORD1000
Subtotal: ₹47040
GST: ₹8467.20
Final Amount: ₹55507.20

Order Confirmed
```

---

# 9. OOP Concepts Implemented

## Abstraction

Implemented using the **abstract Product class**.

## Inheritance

Subclasses extend the Product class.

Examples:

* ElectronicsProduct
* ClothingProduct
* BookProduct

## Polymorphism

Different products implement the **calculateDiscount() method differently**.

## Encapsulation

Class attributes are protected and accessed using methods.

---

# 10. Advantages of the System

* Demonstrates real-world e-commerce logic
* Organized code using packages
* Uses Java OOP principles
* Easy to extend with new product types
* Simple and clear console interface

---

# 11. Future Enhancements

Possible improvements include:

* Database integration (MySQL)
* User login system
* Admin panel for product management
* Payment gateway integration
* Graphical User Interface (JavaFX / Swing)
* Order history tracking
* File-based product storage

---

# 12. Conclusion

The **E-Commerce System** project successfully demonstrates how Java Object-Oriented Programming concepts can be applied to build a real-world application. The project uses inheritance, polymorphism, abstraction, and collections to simulate the working of an online shopping system.

This project provides a strong foundation for developing larger and more advanced **e-commerce platforms**.

---
