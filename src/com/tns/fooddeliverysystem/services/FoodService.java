// package com.tns.fooddeliverysystem.services;

// import java.util.ArrayList;
// import java.util.List;

// import com.tns.fooddeliverysystem.entities.FoodItem;
// import com.tns.fooddeliverysystem.entities.Restaurant;

// public class FoodService {

//     private List<Restaurant> restaurants;

//     public FoodService() {
//         restaurants = new ArrayList<>();
//     }

//     public void addRestaurant(Restaurant restaurant) {

//         if (restaurant != null) {
//             restaurants.add(restaurant);
//         }
//     }

//     public List<Restaurant> getRestaurants() {
//         return restaurants;
//     }

//     public List<FoodItem> getAllFoodItems() {

//         List<FoodItem> allFoodItems = new ArrayList<>();

//         for (Restaurant restaurant : restaurants) {
//             allFoodItems.addAll(restaurant.getMenu());
//         }

//         return allFoodItems;
//     }

//     public Restaurant getRestaurant(int restaurantId) {

//         for (Restaurant restaurant : restaurants) {

//             if (restaurant.getId() == restaurantId) {
//                 return restaurant;
//             }
//         }

//         return null;
//     }

//     public FoodItem getFoodItem(int restaurantId, int foodItemId) {

//         Restaurant restaurant = getRestaurant(restaurantId);

//         if (restaurant != null) {

//             for (FoodItem foodItem : restaurant.getMenu()) {

//                 if (foodItem.getId() == foodItemId) {
//                     return foodItem;
//                 }
//             }
//         }

//         return null;
//     }

//     public void addFoodItemToRestaurant(
//             int restaurantId,
//             FoodItem foodItem) {

//         Restaurant restaurant = getRestaurant(restaurantId);

//         if (restaurant != null) {

//             restaurant.addFoodItem(foodItem);

//             System.out.println(
//                     "Food item added successfully!");

//         } else {

//             System.out.println(
//                     "Restaurant not found.");
//         }
//     }

//     public void removeFoodItemFromRestaurant(
//             int restaurantId,
//             int foodItemId) {

//         Restaurant restaurant = getRestaurant(restaurantId);

//         if (restaurant != null) {

//             restaurant.removeFoodItem(foodItemId);

//         } else {

//             System.out.println(
//                     "Restaurant not found.");
//         }
//     }
// }