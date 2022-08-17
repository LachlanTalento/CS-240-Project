package com.example.restaurantpager;

import com.example.restaurantpager.User;

public class Tester {
    public static void main(String[] args){
        Guest guest = new Guest("Eugene Krabs");
        Restaurant restaurant = new Restaurant("The Krusty Krab");
        System.out.println(guest.getUserID());
        System.out.println(guest.getName());
        System.out.println("You are eating at:\t" + restaurant.getName());
        System.out.println(restaurant.getUserID());
    }
}
