package Unit0_Review;

public class mathreview {
    public static void main(String[] args) {
        String str = "The time is 1:55 PM";
        int num = -3;
        double decimal = 8.8;
        char letter = str.charAt(0);  // T

        String part = str.substring(12, 16);  // 1:55
        int num_chars = str.length();

        String string_hour = str.substring(12, 13);

        int hour = Integer.parseInt(string_hour);

        double positivie = Math.abs(num);
        double root = Math.sqrt(positivie);
        double square = Math.pow(positivie, 2);
        if (1 == 1) {
            System.out.println(letter);
        }

    }
}
