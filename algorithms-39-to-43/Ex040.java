import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float posAverage, negAverage, posSum = 0, negSum = 0;
        int num, qttNeg = 0, qttPos = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("         POSITIVE AND NEGATIVE AVERAGE        ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int c = 0; c < 5; c++) {
            System.out.print("--> Number " + (c+1) + ": ");
            num = read.nextInt();

            if (num == 0) {
                System.out.println("0 won't be counted. TRY AGAIN!");
                System.out.println("----------------------------------------------");
                c--;
            } else if (num < 0) {
                qttNeg++;
                negSum += num;
            } else {
                qttPos++;
                posSum += num;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        if(qttNeg == 0) {
            posAverage = posSum/qttPos;
            System.out.printf("Positive's average is %.2f\n", posAverage);
            System.out.println("There is no negative number.");
        } else if (qttPos == 0) {
            negAverage = negSum/qttNeg;
            System.out.println("There is no positive number.");
            System.out.printf("Negative's average is %.2f\n", negAverage);
        } else {
            posAverage = posSum/qttPos;
            negAverage = negSum/qttNeg;
            System.out.printf("Positive's average is %.2f\n", posAverage);
            System.out.printf("Negative's average is %.2f\n", negAverage);
        }
        System.out.println("----------------------------------------------");
    }
}
