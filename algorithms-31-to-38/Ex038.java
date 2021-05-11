import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, counter = 1, negativeSum = 0, positiveSum = 0, positiveQtt = 0, negativeQtt = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("               SUM AND QUANTITY               ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        while (counter <= 15) {
            System.out.print("--> Number " + counter + ": ");
            num = read.nextInt();

            if (num == 0) {
                System.out.println("Zero won't be counted!");
            } else if (num < 0) {
                negativeQtt ++;
                negativeSum += num;
            } else {
                positiveQtt ++;
                positiveSum += num;
            }
            counter ++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        if(negativeQtt == 0) {
            System.out.println("There is no negative number!");
        } else if (negativeQtt == 1) {
            System.out.println("There is " + negativeQtt + " negative number!");
        } else {
            System.out.println("There are " + negativeQtt + " negatives numbers!");
        }

        System.out.println("Negative's sum is " + negativeSum);

        if(positiveQtt == 0) {
            System.out.println("There is no positive number!");
        } else if(positiveQtt == 1) {
            System.out.println("There is " + positiveQtt + " positive number!");
        } else {
            System.out.println("There are " + positiveQtt + " positives numbers!");
        }

        System.out.println("Positive's sum is " + positiveSum);

        System.out.println("----------------------------------------------");
    }
}
