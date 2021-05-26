import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, qttEven = 0, qttOdd = 0;
        float evenSum = 0, oddSum = 0, evenAverage, oddAverage;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("              EVEN AND ODD AVERAGE            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int c = 0; c < 5; c = qttEven + qttOdd) {
            System.out.print("--> Number " + (c+1) + ": ");
            num = read.nextInt();

            if (num == 0) {
                System.out.println("0 won't be counted. TRY AGAIN!");
                System.out.println("----------------------------------------------");
            } else if (num % 2 == 0) {
                qttEven++;
                evenSum += num;
            } else {
                qttOdd++;
                oddSum += num;
            }
        }
        if(qttOdd == 0) {
            evenAverage = evenSum / qttEven;
            System.out.println("----------------------------------------------");
            System.out.println("                    RESULTS                   ");
            System.out.println("----------------------------------------------");
            System.out.printf("Even's average is %.2f\n", evenAverage);
            System.out.println("There is no odd number.");
            System.out.println("----------------------------------------------");
        } else if (qttEven == 0) {
            oddAverage = oddSum / qttOdd;
            System.out.println("----------------------------------------------");
            System.out.println("                    RESULTS                   ");
            System.out.println("----------------------------------------------");
            System.out.println("There is no even number.");
            System.out.printf("Odd's average is %.2f\n", oddAverage);
            System.out.println("----------------------------------------------");
        } else {
            evenAverage = evenSum / qttEven;
            oddAverage = oddSum / qttOdd;
            System.out.println("----------------------------------------------");
            System.out.println("                    RESULTS                   ");
            System.out.println("----------------------------------------------");
            System.out.printf("Even's average is %.2f\n", evenAverage);
            System.out.printf("Odd's average is %.2f\n", oddAverage);
            System.out.println("----------------------------------------------");
        }
    }
}
