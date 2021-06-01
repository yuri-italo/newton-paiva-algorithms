import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int c = 0;
        float number;
        float sum = 0;
        float average;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                AVERAGE CALCULATOR            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println("     You can cancel anytime by entering 0     ");
        System.out.println("----------------------------------------------");

        do {
            System.out.print("--> Number " + (c+1) +": " );
            number = read.nextFloat();
            if (number < 0 || number > 0) {
                sum += number;
                c++;
            } else {
                System.out.println("Number " + (c+1) + " will not be considered.");
            }
            System.out.println("----------------------------------------------");
        } while (number != 0);

        average = sum / c;
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULT                    ");
        System.out.println("----------------------------------------------");
        if (c == 0) {
            System.out.println("There is no number to calculate!");
        } else if (c == 1) {
            System.out.printf("The number's average is: %.2f\n", average);
        } else {
            System.out.printf("The numbers' average is: %.2f\n", average);
        }
        System.out.println("----------------------------------------------");
    }
}
