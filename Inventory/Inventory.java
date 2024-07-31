package Inventory;

import java.util.HashMap;

public class Inventory {
    HashMap<String, Product> products = new HashMap<>();

    public void add(String productName, int quantity) {
        if (quanMap.containsKey(productName))
            quanMap.put(productName, quanMap.get(productName) + quantity);
        else
            quanMap.put(productName, quantity);

    }

    public void remove(String productName, int quantity) {
        if (quanMap.containsKey(productName))
            quanMap.put(productName, quanMap.get(productName) + quantity);
        else

            quanMap.put(productName, quantity);

    }

    public void update(String productName, int quantity) {
        if (quanMap.containsKey(productName))
            quanMap.put(productName, quanMap.get(productName) + quantity);
        else
            quanMap.put(productName, quantity);

    }
}
