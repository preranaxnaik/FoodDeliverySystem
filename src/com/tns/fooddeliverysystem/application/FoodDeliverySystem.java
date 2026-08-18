package com.tns.fooddeliverysystem.application;

import java.util.Map;
import java.util.Scanner;

import com.tns.fooddeliverysystem.entities.Cart;
import com.tns.fooddeliverysystem.entities.Customer;
import com.tns.fooddeliverysystem.entities.DeliveryPerson;
import com.tns.fooddeliverysystem.entities.FoodItem;
import com.tns.fooddeliverysystem.entities.Order;
import com.tns.fooddeliverysystem.entities.Restaurant;

import com.tns.fooddeliverysystem.services.CustomerService;
import com.tns.fooddeliverysystem.services.FoodService;
import com.tns.fooddeliverysystem.services.OrderService;

public class FoodDeliverySystem {

    static Scanner scanner = new Scanner(System.in);

    static CustomerService customerService =
            new CustomerService();

    static FoodService foodService =
            new FoodService();

    static OrderService orderService =
            new OrderService();

    static int orderCounter = 1;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==============================");
            System.out.println("     FOOD DELIVERY SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    adminMenu();
                    break;

                case 2:
                    customerMenu();
                    break;

                case 3:
                    System.out.println(
                            "Thank you for using Food Delivery System!"
                    );

                    scanner.close();
                    return;

                default:
                    System.out.println(
                            "Invalid option."
                    );
            }
        }
    }

    // ==========================================
    // ADMIN MENU
    // ==========================================

    public static void adminMenu() {

        while (true) {

            System.out.println("\n==============================");
            System.out.println("          ADMIN MENU");
            System.out.println("==============================");

            System.out.println("1. Add Restaurant");
            System.out.println(
                    "2. Add Food Item to Restaurant"
            );
            System.out.println(
                    "3. Remove Food Item from Restaurant"
            );
            System.out.println(
                    "4. View Restaurants and Menus"
            );
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println(
                    "7. Assign Delivery Person to Order"
            );
            System.out.println("8. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addRestaurant();
                    break;

                case 2:
                    addFoodItem();
                    break;

                case 3:
                    removeFoodItem();
                    break;

                case 4:
                    viewRestaurantsAndMenus();
                    break;

                case 5:
                    viewOrders();
                    break;

                case 6:
                    addDeliveryPerson();
                    break;

                case 7:
                    assignDeliveryPerson();
                    break;

                case 8:
                    System.out.println(
                            "Exiting Admin Module"
                    );
                    return;

                default:
                    System.out.println(
                            "Invalid option."
                    );
            }
        }
    }

    // ==========================================
    // ADD RESTAURANT
    // ==========================================

    public static void addRestaurant() {

        System.out.print("Enter Restaurant ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Restaurant Name: ");
        String name = scanner.nextLine();

        Restaurant restaurant =
                new Restaurant(id, name);

        foodService.addRestaurant(restaurant);

        System.out.println(
                name + " Restaurant added successfully!"
        );
    }

    // ==========================================
    // ADD FOOD ITEM
    // ==========================================

    public static void addFoodItem() {

        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Food Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Food Item Price: ");
        double price = scanner.nextDouble();

        FoodItem foodItem =
                new FoodItem(
                        foodItemId,
                        name,
                        price
                );

        foodService.addFoodItemToRestaurant(
                restaurantId,
                foodItem
        );
    }

    // ==========================================
    // REMOVE FOOD ITEM
    // ==========================================

    public static void removeFoodItem() {

        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();

        foodService.removeFoodItemFromRestaurant(
                restaurantId,
                foodItemId
        );

        System.out.println(
                "Food item removed successfully!"
        );
    }

    // ==========================================
    // VIEW RESTAURANTS AND MENUS
    // ==========================================

    public static void viewRestaurantsAndMenus() {

        System.out.println(
                "\nRestaurants and Menus:"
        );

        for (Restaurant restaurant :
                foodService.getRestaurants()) {

            System.out.println(
                    "Restaurant ID: "
                            + restaurant.getId()
                            + ", Name: "
                            + restaurant.getName()
            );

            if (restaurant.getMenu().isEmpty()) {

                System.out.println(
                        "  No food items available."
                );

            } else {

                for (FoodItem foodItem :
                        restaurant.getMenu()) {

                    System.out.println(
                            "  Food Item ID: "
                                    + foodItem.getId()
                                    + ", Name: "
                                    + foodItem.getName()
                                    + ", Price: Rs. "
                                    + foodItem.getPrice()
                    );
                }
            }
        }
    }

    // ==========================================
    // VIEW ORDERS
    // ==========================================

    public static void viewOrders() {

        System.out.println("\nOrders:");

        if (orderService.getOrders().isEmpty()) {

            System.out.println(
                    "No orders available."
            );

            return;
        }

        for (Order order :
                orderService.getOrders()) {

            System.out.println(order);
        }
    }

    // ==========================================
    // ADD DELIVERY PERSON
    // ==========================================

    public static void addDeliveryPerson() {

        System.out.print(
                "Enter Delivery Person ID: "
        );

        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print(
                "Enter Delivery Person Name: "
        );

        String name = scanner.nextLine();

        System.out.print(
                "Enter Contact No.: "
        );

        long contactNo = scanner.nextLong();

        DeliveryPerson deliveryPerson =
                new DeliveryPerson(
                        id,
                        name,
                        contactNo
                );

        orderService.addDeliveryPerson(
                deliveryPerson
        );
    }

    // ==========================================
    // ASSIGN DELIVERY PERSON
    // ==========================================

    public static void assignDeliveryPerson() {

        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();

        System.out.print(
                "Enter Delivery Person ID: "
        );

        int deliveryPersonId =
                scanner.nextInt();

        orderService.assignDeliveryPersonToOrder(
                orderId,
                deliveryPersonId
        );
    }

    // ==========================================
    // CUSTOMER MENU
    // ==========================================

    public static void customerMenu() {

        while (true) {

            System.out.println("\n==============================");
            System.out.println("        CUSTOMER MENU");
            System.out.println("==============================");

            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addCustomer();
                    break;

                case 2:
                    viewFoodItems();
                    break;

                case 3:
                    addFoodToCart();
                    break;

                case 4:
                    viewCart();
                    break;

                case 5:
                    placeOrder();
                    break;

                case 6:
                    viewOrders();
                    break;

                case 7:
                    System.out.println(
                            "Exiting Customer Module"
                    );
                    return;

                default:
                    System.out.println(
                            "Invalid option."
                    );
            }
        }
    }

    // ==========================================
    // ADD CUSTOMER
    // ==========================================

    public static void addCustomer() {

        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Contact No.: ");
        long contactNo = scanner.nextLong();

        Customer customer =
                new Customer(
                        userId,
                        username,
                        contactNo
                );

        customerService.addCustomer(customer);

        System.out.println(
                "Customer created successfully!"
        );
    }

    // ==========================================
    // VIEW FOOD ITEMS
    // ==========================================

    public static void viewFoodItems() {

        System.out.println(
                "\nRestaurants and Menus:"
        );

        for (Restaurant restaurant :
                foodService.getRestaurants()) {

            System.out.println(
                    "Restaurant ID: "
                            + restaurant.getId()
                            + ", Name: "
                            + restaurant.getName()
            );

            for (FoodItem foodItem :
                    restaurant.getMenu()) {

                System.out.println(
                        "  Food Item ID: "
                                + foodItem.getId()
                                + ", Name: "
                                + foodItem.getName()
                                + ", Price: Rs. "
                                + foodItem.getPrice()
                );
            }
        }
    }

    // ==========================================
    // ADD FOOD TO CART
    // ==========================================

    public static void addFoodToCart() {

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        Customer customer =
                customerService.getCustomer(customerId);

        if (customer == null) {

            System.out.println(
                    "Customer not found."
            );

            return;
        }

        System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();

        System.out.print("Enter Food Item ID: ");
        int foodItemId = scanner.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        FoodItem foodItem =
                foodService.getFoodItem(
                        restaurantId,
                        foodItemId
                );

        if (foodItem == null) {

            System.out.println(
                    "Food item not found."
            );

            return;
        }

        customer.getCart().addItem(
                foodItem,
                quantity
        );

        System.out.println(
                "Food item added to cart!"
        );
    }

    // ==========================================
    // VIEW CART
    // ==========================================

    public static void viewCart() {

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        Customer customer =
                customerService.getCustomer(customerId);

        if (customer == null) {

            System.out.println(
                    "Customer not found."
            );

            return;
        }

        Cart cart = customer.getCart();

        System.out.println("\nCart:");

        if (cart.getItems().isEmpty()) {

            System.out.println(
                    "Cart is empty."
            );

            return;
        }

        double total = 0;

        for (Map.Entry<FoodItem, Integer> entry :
                cart.getItems().entrySet()) {

            FoodItem foodItem = entry.getKey();

            int quantity = entry.getValue();

            double cost =
                    foodItem.getPrice() * quantity;

            total += cost;

            System.out.println(
                    "Food Item: "
                            + foodItem.getName()
                            + ", Quantity: "
                            + quantity
                            + ", Cost: Rs. "
                            + cost
            );
        }

        System.out.println(
                "Total Cost: Rs. " + total
        );
    }

    // ==========================================
    // PLACE ORDER
    // ==========================================

    public static void placeOrder() {

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        Customer customer =
                customerService.getCustomer(customerId);

        if (customer == null) {

            System.out.println(
                    "Customer not found."
            );

            return;
        }

        Cart cart = customer.getCart();

        if (cart.getItems().isEmpty()) {

            System.out.println(
                    "Cannot place order. Cart is empty."
            );

            return;
        }

        Order order =
                new Order(
                        orderCounter++,
                        customer
                );

        for (Map.Entry<FoodItem, Integer> entry :
                cart.getItems().entrySet()) {

            order.addItem(
                    entry.getKey(),
                    entry.getValue()
            );
        }

        orderService.placeOrder(order);
    }
}