import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        String[] names = new String[8];
        String[] inverted = new String[8];

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("          PRINTING AN INVERTED ARRAY          ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int i=0; i < names.length; i++) {
            System.out.print("Index[" + i + "] -> Name: ");
            names[i] = read.nextLine();
        }
        System.out.println("----------------------------------------------");

        for (int i=names.length-1, j=0; i>=0; i--, j++) {
            inverted[j] = names[i];
        }
        System.out.println("Printing...");
        Thread.sleep(1000);

        for (String print : inverted) {
            System.out.print("[" + print + "]  ");
            Thread.sleep(300);
        }
        System.out.println("\n----------------------------------------------");
    }
}
