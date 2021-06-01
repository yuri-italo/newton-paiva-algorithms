import java.util.Scanner;

public class Ex047 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int posQtt = 0;
        int negQtt = 0;
        int posSum = 0;
        int negSum = 0;
        int c = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("        POSITIVE AND NEGATIVE ANALYZER        ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        do {
            System.out.print("--> Number " + (c+1) +": " );
            number = read.nextInt();
            if (number == 0) {
                System.out.println("Zero is a neutral number. TRY AGAIN!");
            } else if (number > 0) {
                posSum += number;
                posQtt++;
                c++;
            } else {
                negSum += number;
                negQtt++;
                c++;
            }
            System.out.println("----------------------------------------------");
        } while (c < 15);

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Positive's Quantity: " + posQtt);
        System.out.println("Negative's Quantity: " + negQtt);
        System.out.println("Positive's Sum: " + posSum);
        System.out.println("Negative's Sum: " + negSum);
        System.out.println("----------------------------------------------");
    }
}
