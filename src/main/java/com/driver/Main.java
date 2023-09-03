package com.driver;

public class Main {

    public static void main(String args[])
    {
        Product p=new Product();
        System.out.println(p.product(1,3));

        System.out.println(p.product(1,2,3));

        System.out.println(p.product(1.2,2.2));
    }

}