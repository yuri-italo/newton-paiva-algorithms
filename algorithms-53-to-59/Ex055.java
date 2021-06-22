import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        String[] names = new String[8];

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("               INVERTING AN ARRAY             ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int i=0; i < names.length; i++) {
            System.out.print("Index[" + i + "] -> Name: ");
            names[i] = read.nextLine();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Printing...");
        Thread.sleep(1000);

        for (int i=0; i < names.length; i++) {
            System.out.print("[" + names[i] +"]  ");
            Thread.sleep(300);
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("Inverting...");
        Thread.sleep(2000);

        for (int i = names.length -1; i >= 0; i--) {
            System.out.print("[" + names[i] +"]  ");
            Thread.sleep(300);
        }
        System.out.println("\n----------------------------------------------");
    }
}
