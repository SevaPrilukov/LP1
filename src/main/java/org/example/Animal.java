package org.example;

public class Animal {
    protected String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }
    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println(this.name + " пробежал " + distance + " м");
        }else {
            System.out.println(this.name + " не может пробежать " + distance + " м");
        }
    }
    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(this.name + " не умеет плавать ");
        }else if (distance <= maxSwimDistance){
            System.out.println(name + " проплыл " + distance + " м");
        }else{
            System.out.println(this.name + " не модет проплыть " + distance + " м");
        }
    }
}
