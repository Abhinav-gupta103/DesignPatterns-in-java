package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

// Step 3:- Context class
public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
