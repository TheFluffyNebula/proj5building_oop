package edu.guilford;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Driver {
    static Tortoise t1 = new Tortoise("Alice", "green", 20, 40, 10);
    static Tortoise t2 = new Tortoise("Bob", "brown", 25, 35, 15);
    static Tortoise t3 = new Tortoise("Charlie", "blue", 30, 30, 20);

    static Hare h1 = new Hare("Alice", "brown", 20, 40);
    static Hare h2 = new Hare("Bob", "white", 25, 30);
    static Hare h3 = new Hare("Charlie", "black", 30, 35);
    static Hare h4 = new Hare("Diana", "grey", 35, 45);

    static Frog f1 = new Frog("Alice", "green", 20, 40, 10);
    static Frog f2 = new Frog("Bob", "brown", 25, 35, 15);
    static Frog f3 = new Frog("Charlie", "blue", 30, 30, 20);
    public static void main( String[] args ) {
        t1.sleep();
        t1.hibernate();
        t1.makeSound();
        // init array of tortoises
        Tortoise[] tortoises = {t1, t2, t3};
        System.out.println("unsorted tortoises");
        for (Tortoise t : tortoises) {
            System.out.println(t.getName() + t.getAge());
        }
        // sort tortoises
        Arrays.sort(tortoises);
        System.out.println("sorted tortoises");
        for (Tortoise t : tortoises) {
            System.out.println(t.getName() + t.getAge());
        }
        h1.hibernate();
        h1.makeSound();
        // init array of hares
        Hare[] hares = {h1, h2, h3, h4};
        System.out.println("unsorted hares");
        for (Hare h : hares) {
            System.out.println(h.getName() + h.getSpeed());
        }
        // sort hares
        Arrays.sort(hares);
        System.out.println("sorted hares");
        for (Hare h : hares) {
            System.out.println(h.getName() + h.getSpeed());
        }
        f1.sleep();
        f1.hibernate();
        f1.makeSound();
        // init array of frogs
        Frog[] frogs = {f1, f2, f3};
        System.out.println("unsorted frogs");
        for (Frog f : frogs) {
            System.out.println(f.getName() + f.getJumpHeight());
        }
        // sort frogs
        Arrays.sort(frogs);
        System.out.println("sorted frogs");
        for (Frog f : frogs) {
            System.out.println(f.getName() + f.getJumpHeight());
        }
    }
    
}
