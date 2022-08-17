package com.example.restaurantpager;

import java.util.*;

public class Guest extends User{
    private String phoneNumber;
    private LinkedList order;

    public Guest(String name){
        super(name);
    }
    public Guest(){
        super();
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
