package Inventory_mangement;

import java.util.HashMap;

public class Inventory {
    HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    

    public void add(Product product) {
        if (products.containsKey(product.productName))
            System.out.println("Item already added, try updating it");
        else
            products.put(product.productName, product);

    }

    @Override
    public String toString() {
        return "Inventory [ " + products +" ]";


}
}
