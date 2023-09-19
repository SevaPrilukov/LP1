package org.example;

public class Cat extends Animal{
    public static int count;
    public static int maxSwimDistance = 0;
    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
