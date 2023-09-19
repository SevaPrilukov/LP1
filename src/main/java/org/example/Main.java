package org.example;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик", 200),
                new Dog("Бобик"),
                new Tiger("Ваня", 150,0),
                new Tiger("Ваня 2", 100,50),
                new Lynx("Рысь", 300,30, 80),
                new Cougar("Пума", 310,35,75),
                new Cheetah("Гепард", 600,60,110)
        };
        for (Animal a : animals){
            a.run(150);
            a.swim(5);
        }
        int a,b;
        a = Lynx.count + Cougar.count + Cheetah.count;
        b = a + Cat.count + Dog.count + Tiger.count;
        System.out.println("Колличетво котов: " + Cat.count);
        System.out.println("Колличество собак: " + Dog.count);
        System.out.println("Колличество тигров: " + Tiger.count);
        System.out.println("Колличество кошачьих: " + a);
        System.out.println("Колличестьво всех животных: " + b);
        ((Feline) animals[4]).speed();
        ((Feline) animals[5]).speed();
        ((Feline) animals[6]).speed();
    }
}