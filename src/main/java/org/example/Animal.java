package org.example;

public class Animal {
    public int topSpeed;
    public boolean isEndangered;
    public String name;
    public Animal(String name, int topSpeed, boolean isEndangered) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
    }
    public void printInfo() {
        if (isEndangered) {
            System.out.println("The " + name + " has a top speed of " + topSpeed + " and is endangered.");
        } else {
            System.out.println("The " + name + " has a top speed of " + topSpeed + " and is not endangered.");
        }
    }
}
