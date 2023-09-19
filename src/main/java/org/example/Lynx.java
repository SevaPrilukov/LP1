package org.example;

public class Lynx extends Feline{
    public static int count;
    public Lynx(String name, int maxRunDistance, int maxSwimDistance, int maxSpeed) {
        super(name, maxRunDistance, maxSwimDistance, maxSpeed);
        count++;
    }
}
