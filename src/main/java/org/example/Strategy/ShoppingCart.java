package org.example.Strategy;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        return items.stream().map(Item::getPrice).reduce(0, Integer::sum);
    }

    void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }
}
