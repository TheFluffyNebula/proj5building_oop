package edu.guilford;

public class Hare extends Animal implements Comparable<Hare>{
    //attributes
    private String name;
    private String color;
    private double weight;
    private int age;
    private int speed;

    //constructor
    public Hare(String name, String color, double weight, int speed) {
        super(name, color, weight, 0);
        this.speed = speed;
    }

    //getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed cannot be negative");
        } else {
            this.speed = speed;
        }
    }

    //methods
    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void hibernate() {
        System.out.println("I don't hibernate");
    }

    public void makeSound() {
        System.out.println("Hop! Hop! Hop!");
    }

    public int compareTo(Hare other) {
        int result =  Integer.compare(this.getSpeed(),other.getSpeed());
        return result;
    }

}
