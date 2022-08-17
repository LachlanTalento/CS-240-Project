package com.example.restaurantpager;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

//https://www.geeksforgeeks.org/how-to-generate-and-read-qr-code-with-java-using-zxing-library/

class User extends MyQr{
    //parent class for guest and restaurant
    //defines some specific variables

    private String userID;
    private String name;


    public User(String name){
        String id = idGen();
        this.setUserID(id);
        this.setName(name);
    }

    public User(){
        String id = idGen();
        this.setUserID(id);
        this.setName(id);
    }

    private String idGen(){
        byte[] idBytes = new byte[6];
        Random r= new Random();
        r.nextBytes(idBytes);
        Base64.Encoder encoder = Base64.getUrlEncoder();
        return encoder.encodeToString(idBytes);
    }

    public void setUserID(String id){
        this.userID = id;
    }

    public String getUserID(){
        return userID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



}