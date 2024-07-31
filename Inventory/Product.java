package Inventory;
/*
 * o	Create a new project for the inventory management system.
3.	Implementation:
o	Define a class Product with attributes like productId, productName, quantity, and price.
o	Choose an appropriate data structure to store the products (e.g., ArrayList, HashMap).
o	Implement methods to add, update, and delete products from the inventory.
4.	Analysis:
o	Analyze the time complexity of each operation (add, update, delete) in your chosen data structure.
o	Discuss how you can optimize these operations.

 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Product 
{   
    HashMap<String,Integer> quanMap = new HashMap<>();
    int productId;String productName;int quantity;double price;

product(int productId,String productName,int quantity,double price)
{
    this.productId = productId;
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
}



}

