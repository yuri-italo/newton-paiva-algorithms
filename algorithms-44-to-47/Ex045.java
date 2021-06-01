import java.util.Scanner;

public class Ex045 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float number;
        float sum = 0;
        int c = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                GREATER THAN 5 SUM            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                  IMPORTANT                   ");
        System.out.println("     You can cancel anytime by entering 0     ");
        System.out.println("----------------------------------------------");

        do {
            System.out.print("--> Number " + (c+1) +": " );
            number = read.nextFloat();
            if (number > 5) {
                sum += number;
            } else {
                System.out.println("Number " + (c+1) + " will not be summed!");
            }
            System.out.println("----------------------------------------------");
            c++;
        } while (number != 0);

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULT                    ");
        System.out.println("----------------------------------------------");
        if (c == 0) {
            System.out.println("There is no number to be summed.");
        } else {
            System.out.println("Greater than 5 SUM: " + sum);
        }
        System.out.println("----------------------------------------------");
    }
}
