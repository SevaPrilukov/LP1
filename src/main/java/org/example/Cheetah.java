package org.example;

public class Cheetah extends Feline{
    public static int count;
    public Cheetah(String name, int maxRunDistance, int maxSwimDistance, int maxSpeed) {
        super(name, maxRunDistance, maxSwimDistance, maxSpeed);
        count++;
    }
}
