import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        double[] prices = new double[10];
        final double INCREASE = 0.1;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("       INCREASING AN ARRAY VALUE BY 10%       ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i=0; i<prices.length; i++) {
            System.out.print("Index[" + i + "] -> Price: R$");
            prices[i] = read.nextFloat();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Printing the prices...");
        Thread.sleep(1000);

        for (double print : prices) {
            System.out.printf("R$%.2f  ",print);
            Thread.sleep(300);
        }
        System.out.println("\n----------------------------------------------");

        for (int i=0; i<prices.length; i++) {
            prices[i] += prices[i] * INCREASE;
        }
        System.out.println("Increasing prices by 10%...");
        Thread.sleep(2000);

        for (double print : prices) {
            System.out.printf("R$%.2f  ",print);
            Thread.sleep(300);
        }
        System.out.println("\n----------------------------------------------");
    }
}
