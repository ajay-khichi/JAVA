package com.ignishers.ajay;

public class Oops {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    void display(int result) {
        System.out.println("Printing result from Parent " + result);
    }
}

class Child extends Oops {
    void display(int result) {
        System.out.println("Printing result from Child " + result);
    }
}
