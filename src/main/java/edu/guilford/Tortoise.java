package edu.guilford;

public class Tortoise extends Animal implements Comparable<Tortoise>{
    //attributes
    private String name;
    private String color;
    private double weight;
    private int age;
    private int shellSize;

    //constructor
    public Tortoise(String name, String color, double weight, int age, int shellSize) {
        super(name, color, weight, age);
        this.shellSize = shellSize;
    }

    //getters and setters
    public int getShellSize() {
        return shellSize;
    }

    public void setShellSize(int shellSize) {
        this.shellSize = shellSize;
    }

    //methods

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void hibernate() {
        System.out.println("I am hibernating");
    }

    public void makeSound() {
        System.out.println("I do not make much sound");
    }

    public int compareTo(Tortoise other) {
        int result =  Integer.compare(this.getAge(),other.getAge());
        return result;
    }

}
