import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float num, sum = 0;
        int counter = 1;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("              SMALLER THAN 40 SUM             ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while (counter <= 10) {
            System.out.print("--> Number " + counter +": " );
            num = read.nextFloat();

            if(num < 40) sum += num;

            counter ++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULT                    ");
        System.out.println("----------------------------------------------");
        System.out.println("SMALLER THAN 40 SUM IS: " + sum);
        System.out.println("----------------------------------------------");
    }
}
