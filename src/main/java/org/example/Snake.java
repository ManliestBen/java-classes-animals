package org.example;

public class Snake extends Reptile {
    boolean isVenomous;
    public Snake(String name, int topSpeed, boolean isEndangered, int numLegs, boolean isVenomous) {
        super(name, topSpeed, isEndangered, numLegs);
        this.isVenomous = isVenomous;
    }
    @Override
    public void printInfo() {
        if (isEndangered) {
            System.out.println("The " + name + " has " + numLegs + " legs, a top speed of " + topSpeed + " and is endangered.");
        } else {
            System.out.println("The " + name + " has " + numLegs + " legs, a top speed of " + topSpeed + " and is not endangered.");
        }
        if (isVenomous) {
            System.out.println("Watch out, it is venomous!");
        } else {
            System.out.println("No need to worry, it is non-venomous.");
        }
    }
}
