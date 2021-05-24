import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int counter = 1;
        double number,sum = 0, average, x2Double;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("            SUM, AVERAGE AND DOUBLE           ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while (counter <= 5) {
            System.out.print("--> Number " + counter +": " );
            number = read.nextDouble();
            sum += number;
            counter ++;
        }

        x2Double = sum * 2;
        average = sum / (counter - 1);

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.printf("The numbers' SUM is %.2f\n", sum);
        System.out.printf("The numbers' AVERAGE is %.2f\n",average);
        System.out.printf("The numbers' DOUBLE is %.2f\n", x2Double);
        System.out.println("----------------------------------------------");
    }
}
