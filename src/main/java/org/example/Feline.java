package org.example;

public abstract class Feline extends Animal{
    private int maxSpeed;
    public Feline(String name, int maxRunDistance, int maxSwimDistance, int maxSpeed) {
        super(name, maxRunDistance, maxSwimDistance);
        this.maxSpeed = maxSpeed;
    }

    public void speed() {
        System.out.println("Максимальная скорость: " + this.name + " " + maxSpeed);
    }
}
