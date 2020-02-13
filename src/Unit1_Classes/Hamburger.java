/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/13/20
 * Purpose: hamburger
 */

package Unit1_Classes;

import java.util.Arrays;

public class Hamburger {
    /** Hamburger
     * This class manages the hamburger object
     * A hamburger can be constructed with calories, cost, and composition, e.g.:
     * Hamburger x = new Hamburger([calories], [cost], [composition])
     */

    // declare instance variables
    private int calories;
    private double cost;
    private String[] composition;

    // defaults
    private final int DEFAULT_CALORIES = 500;
    private final double DEFAULT_COST = 5.99;
    private final String[] DEFAULT_COMPOSITION = {"Bun", "Patty", "Bun"};

    //make constructor
    public Hamburger() {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = DEFAULT_COST;
        composition = DEFAULT_COMPOSITION;
    }
    public Hamburger(int i) {
        // initialize values for instance variables
        calories = i;
        cost = DEFAULT_COST;
        composition = DEFAULT_COMPOSITION;
    }
    public Hamburger(double d) {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = d;
        composition = DEFAULT_COMPOSITION;
    }
    public Hamburger(String[] str) {
        // initialize values for instance variables
        calories = DEFAULT_CALORIES;
        cost = DEFAULT_COST;
        composition = str;
    }

    // mutator method -- allow others to write instance variable values
    public void write(int i) {
        calories = i;
    }
    public void write(double d) {
        cost = d;
    }
    public void write(String[] str) {
        composition = str;
    }

    // accessor method -- allow others to read instance variable values
    public String read(String arg) {
        switch (arg) {
            case "calories":
                return Integer.toString(calories);
            case "cost":
                return Double.toString(cost);
            case "composition":
                return String.join(", ", composition);
        }
        return "Invalid Arg";
    }

    // regular method
    public String toString() {
        return "Calories: " + calories +
                "\nCost: $" + cost +
                "\nComposition "+ String.join(", ", composition);
    }

}
