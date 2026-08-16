package com.tns.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<FoodItem, Integer> items;

    public Cart() {
        items = new HashMap<>();
    }

    public void addItem(FoodItem foodItem, int quantity) {

        if (foodItem == null || quantity <= 0) {
            System.out.println("Invalid food item or quantity.");
            return;
        }

        items.put(
                foodItem,
                items.getOrDefault(foodItem, 0) + quantity
        );
    }

    public void removeItem(FoodItem foodItem) {

        if (foodItem != null && items.containsKey(foodItem)) {
            items.remove(foodItem);
            System.out.println("Food item removed from cart.");
        } else {
            System.out.println("Food item not found in cart.");
        }
    }

    public Map<FoodItem, Integer> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}