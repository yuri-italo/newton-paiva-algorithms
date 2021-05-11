import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, counter = 1, evenNumbers = 0, oddNumbers = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("            HOW MANY ODDS AND EVENS?          ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while(counter <= 10) {
            System.out.print("--> Number " + counter + ": ");
            num = read.nextInt();

            if(num == 0) {
                System.out.println("Zero won't be counted!");
            } else if (num % 2 == 0) {
                evenNumbers ++;
            } else {
                oddNumbers ++;
            }
            counter ++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        if(evenNumbers == 0) {
            System.out.println("There is no even number!");
        } else if (evenNumbers == 1) {
            System.out.println("There is " + evenNumbers + " even number!");
        } else {
            System.out.println("There are " + evenNumbers + " even numbers!");
        }

        if (oddNumbers == 0) {
            System.out.println("There is no odd number!");
        } else if (oddNumbers == 1) {
            System.out.println("There is " + oddNumbers + " odd number!");
        } else {
            System.out.println("There are " + oddNumbers + " odd numbers!");
        }
        System.out.println("----------------------------------------------");
    }
}
