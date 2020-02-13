/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

package Unit1_Classes;

public class hamburgerTest {
    public static void main(String[] args) {
        Hamburger ham1 = new Hamburger(700);
        Hamburger ham2 = new Hamburger(4.99);
        String[] comp = {"Bun", "Onion", "Pickle", "Cheese", "Patty", "Bun"};
        Hamburger ham3 = new Hamburger(comp);

        ham1.write(3.75);
        System.out.println("First hamburger: " + ham1.toString() + "\n");
        System.out.println("Second hamburger: " + ham2.toString() + "\n");
        System.out.println("Third hamburger: " + ham3.toString() + "\n");
    }
}
