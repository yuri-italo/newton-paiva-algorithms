import java.util.Scanner;
public class Ex054 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                SUMMING 2 ARRAYS              ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i=0; i < vet1.length; i++) {
            System.out.print("Array [1] -> Index [" + (i) + "]: ");
            vet1[i] = read.nextInt();
        }
        System.out.println("----------------------------------------------");
        for (int i=0; i < vet2.length; i++) {
            System.out.print("Array [2] -> Index [" + (i) + "]: ");
            vet2[i] = read.nextInt();
        }
        System.out.println("----------------------------------------------");
        for (int i=0; i < vet3.length; i++) {
            vet3[i] = vet1[i] + vet2[i];
        }

        System.out.println("Summing...");
        Thread.sleep(2000);
        for (int j : vet3) {
            System.out.print("[" + j + "]" +  "  ");
            Thread.sleep(300);
        }
        System.out.println("----------------------------------------------");
    }
}
