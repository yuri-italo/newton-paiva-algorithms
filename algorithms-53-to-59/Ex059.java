import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[5];
        int smallest = 0;
        int equalsQtt = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("           FINDING THE SMALLEST ONE           ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int i=0; i<numbers.length; i++) {
            System.out.print("-> Number " + (i+1) + ": ");
            numbers[i] = read.nextInt();
        }

        for (int i=0; i<numbers.length; i++) {
            if (i == 0) smallest = numbers[i];
            if (numbers[i] < smallest) smallest = numbers[i];
        }
        System.out.println("----------------------------------------------");

        for (int number : numbers) {
            if (number == smallest) {
                equalsQtt++;
            }
        }
        System.out.println("Finding the smallest element...");
        Thread.sleep(2000);

        if (equalsQtt == numbers.length) {
            System.out.print("All elements are equals! There is no smallest.");
        } else {
            System.out.println("The smallest element is: " + smallest);
            Thread.sleep(1500);
            System.out.print("It can be found at index: ");
            for (int i=0; i< numbers.length;i++) {
                if (numbers[i] == smallest) {
                    System.out.print("[" + i + "]");
                }
            }
        }
        System.out.print("\n----------------------------------------------");
    }
}
