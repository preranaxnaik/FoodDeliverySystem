package com.tns.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Order;

public class OrderService {

    private List<Order> orders;
    private List<DeliveryPerson> deliveryPersons;

    public OrderService() {

        orders = new ArrayList<>();
        deliveryPersons = new ArrayList<>();
    }

    public void placeOrder(Order order) {

        if (order != null) {

            orders.add(order);

            System.out.println(
                    "Order placed successfully! Your order ID is: "
                            + order.getOrderId()
            );
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrder(int orderId) {

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {
                return order;
            }
        }

        return null;
    }

    public void addDeliveryPerson(
            DeliveryPerson deliveryPerson) {

        if (deliveryPerson != null) {

            deliveryPersons.add(deliveryPerson);

            System.out.println(
                    "Delivery person added successfully!"
            );
        }
    }

    public List<DeliveryPerson> getDeliveryPersons() {
        return deliveryPersons;
    }

    public DeliveryPerson getDeliveryPerson(
            int deliveryPersonId) {

        for (DeliveryPerson person : deliveryPersons) {

            if (person.getDeliveryPersonId()
                    == deliveryPersonId) {

                return person;
            }
        }

        return null;
    }

    public void assignDeliveryPersonToOrder(
            int orderId,
            int deliveryPersonId) {

        Order order = getOrder(orderId);

        DeliveryPerson deliveryPerson =
                getDeliveryPerson(deliveryPersonId);

        if (order == null) {

            System.out.println(
                    "Order not found."
            );

            return;
        }

        if (deliveryPerson == null) {

            System.out.println(
                    "Delivery person not found."
            );

            return;
        }

        order.setDeliveryPerson(deliveryPerson);

        System.out.println(
                "Delivery person assigned to order successfully!"
        );
    }
}