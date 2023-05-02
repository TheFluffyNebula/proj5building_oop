package edu.guilford;

public class Frog extends Animal implements Comparable<Frog>{
    //attributes
    private String name;
    private String color;
    private double weight;
    private int age;
    private int jumpHeight;

    //constructor
    public Frog(String name, String color, double weight, int age, int jumpHeight) {
        super(name, color, weight, age);
        this.jumpHeight = jumpHeight;
    }

    //getters and setters
    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        if (jumpHeight < 0) {
            System.out.println("Jump height cannot be negative");
        } else {
            this.jumpHeight = jumpHeight;
        }
    }

    //methods
    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void hibernate() {
        System.out.println("I am hibernating");
    }

    public void makeSound() {
        System.out.println("Ribbit");
    }

    public int compareTo(Frog other) {
        int result =  Integer.compare(this.getJumpHeight(),other.getJumpHeight());
        return result;
    }



}
