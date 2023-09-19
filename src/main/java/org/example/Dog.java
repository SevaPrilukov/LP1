package org.example;

public class Dog extends Animal{
    public static int count;
    public static int maxRunDistance = 500;
    public static int maxSwimDistance = 10;
    public Dog(String name) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
