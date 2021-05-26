import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int evenQtt = 0, oddQtt = 0, oddSum = 0, evenSum = 0,num;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("               EVEN, ODD AND SUM              ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for(int c = 0; c < 10; c = evenQtt + oddQtt) {
            System.out.print("--> Number " + (c+1) + ": ");
            num = read.nextInt();

            if(num == 0) {
                System.out.println("0 won't be counted. TRY AGAIN!");
                System.out.println("----------------------------------------------");
            } else if (num % 2 == 0) {
                evenQtt++;
                evenSum += num;
            } else {
                oddQtt++;
                oddSum += num;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        if(evenQtt == 0) {
            System.out.println("There is no even number.");
        } else if (evenQtt == 1) {
            System.out.println("There is " + evenQtt + " even number.");
        } else {
            System.out.println("There are " + evenQtt + " even numbers.");
        }

        if(oddQtt == 0) {
            System.out.println("There is no odd number.");
        } else if (oddQtt == 1) {
            System.out.println("There is " + oddQtt + " odd number.");
        } else {
            System.out.println("There are " + oddQtt + " odd numbers.");
        }

        System.out.println("Even's SUM: " + evenSum);
        System.out.println("Odd's SUM: " + oddSum);
        System.out.println("----------------------------------------------");
    }
}
