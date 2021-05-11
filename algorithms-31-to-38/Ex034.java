import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float num, positiveNumber = 0, negativeNumber = 0;
        int counter = 1;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("          POSITIVE AND NEGATIVE SUM           ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while(counter <= 10) {
            System.out.print("--> Number " + counter + ": ");
            num = read.nextFloat();

            if (num < 0) {
                negativeNumber += num;
            } else {
                positiveNumber += num;
            }

            counter ++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("POSITIVES' SUM: " + positiveNumber);
        System.out.println("NEGATIVES' SUM: " + negativeNumber);
        System.out.println("----------------------------------------------");
    }
}
