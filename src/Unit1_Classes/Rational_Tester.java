/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/24/20
 * Purpose: tester for Rational.java
 */

package Unit1_Classes;

public class Rational_Tester {
    public static void main(String[] args) {
        Rational frac1 = new Rational(1,2);
        System.out.println(frac1.toString());

        frac1.add(3);
        System.out.println(frac1.toString());

        frac1.subtract(1);
        System.out.println(frac1.toString());

        frac1.multi(2);
        System.out.println(frac1.toString());

        frac1.divide(5);
        System.out.println(frac1.toString());

        frac1.reduce();
        System.out.println(frac1.toString());

    }
}
