/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/3/20
 * Purpose: Handle fraction operations by splitting them into numerators and denominators
 */

package Unit0_Review;

import java.util.Scanner;
import java.util.Random;

public class fractions {
    public static void main(String[] args){
        int[] frac1 = {1,2};
        int[] frac2 = new int[2];
        frac2[0] = 3;
        frac2[1] = 4;
        /*
        print_fraction(frac1);
        print_fraction(frac2);
        user_frac();
         */
        random_frac();
    }

    public static void print_fraction(int[] frac) {
        int numerator = frac[0];
        int denominator = frac[1];

        if (numerator == denominator) {
            System.out.println(1);
        } else if(denominator == 0) {
            System.out.println("ERROR: Cannot devide by zero (denominator is zero)");
        } else if(numerator == 0) {
            System.out.println(0);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }
    public static int get_int(){
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }
    public static int[] user_frac() {
        int[] frac = new int[2];
        System.out.println("What numerator would you like?");
        frac[0] = get_int();

        // frac[1] = 0;  // Turns out we don't actually need to define this as zero because it's initialized as zero
        while(frac[1] == 0) {
            System.out.println("What denominator would you like? (Any number except 0)");
            frac[1] = get_int();
        }
        print_fraction(frac);  // optional
        return frac;
    }
    public static int[] random_frac() {
        Random rand = new Random();
        int[] frac = new int[2];

        frac[0] = rand.nextInt(10); // Obtain a number between [0 - 10].
        frac[1] = rand.nextInt(10); // Obtain a number between [0 - 10].
        print_fraction(frac);  // optional
        return frac;
    }
}
