package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj =new RWOnly();
        //error: name has private access in RWOnly
        obj.setName("Nikhil");
        System.out.println(obj.getName());
    }
}