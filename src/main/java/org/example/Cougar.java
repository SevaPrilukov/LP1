package org.example;

public class Cougar extends Feline{
    public static int count;
    public Cougar(String name, int maxRunDistance, int maxSwimDistance, int maxSpeed) {
        super(name, maxRunDistance, maxSwimDistance, maxSpeed);
        count++;
    }
}
