import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        int num = 1;
        int c = 0;
        int positiveSum = 0;
        int negativeQtt = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("    POSITIVE'S SUM AND NEGATIVE'S QUANTITY    ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println("    You can cancel anytime by entering \"0\". ");
        System.out.println("----------------------------------------------");

        while (num != 0) {
            System.out.print("--> Number " + (c+1) +": " );
            num = read.nextInt();
            if (num == 0) {
                System.out.println("----------------------------------------------");
                System.out.println("Exiting...");
                Thread.sleep(1000);
            } else if (num > 0) {
                positiveSum += num;
            } else {
                negativeQtt++;
            }
            c++;
            System.out.println("----------------------------------------------");
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Positive's sum: " + positiveSum);
        System.out.println("Negative's quantity: " + negativeQtt);
        System.out.println("----------------------------------------------");
    }
}
