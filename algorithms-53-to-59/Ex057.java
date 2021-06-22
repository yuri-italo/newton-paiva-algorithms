import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int[] z = new int[x.length + y.length];

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("               MERGING 2 ARRAYS               ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Fill up the first array.");
        System.out.println("----------------------------------------------");

        for (int i=0; i<x.length; i++) {
            System.out.print("Index[" + i + "] -> Number: ");
            x[i] = read.nextInt();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Fill up the second array.");
        System.out.println("----------------------------------------------");

        for (int i=0; i<y.length; i++) {
            System.out.print("Index[" + i + "] -> Number: ");
            y[i] = read.nextInt();
        }
        System.out.println("----------------------------------------------");

        for (int i=0; i<x.length; i++) {
            z[i] = x[i];
            z[i+x.length] = y[i];
        }
        System.out.println("Printing...");
        Thread.sleep(1000);


        for (int print : z) {
            System.out.print("[" + print + "] ");
            Thread.sleep(300);
        }
        System.out.println("\n----------------------------------------------");
    }
}
