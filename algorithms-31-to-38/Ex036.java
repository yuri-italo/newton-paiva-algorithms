import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int counter = 1, age, ageGT50 = 0, ageST21 = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("          UNDER 21 AND OVER 50 AMOUNT         ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        while (counter <= 10) {
            System.out.print("Type age number " + counter + ": ");
            age = read.nextInt();

            if (age < 0) {
                System.out.println("Invalid age!");
            } else if (age < 21) {
                ageST21 ++;
            } else if (age <= 50) {
                System.out.println("You won't be counted.");
            } else {
                ageGT50 ++;
            }

            counter ++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        if(ageST21 == 1) {
            System.out.println("There is " + ageST21 + " age under 21.");
        } else {
            System.out.println("There are " + ageST21 + " ages under 21.");
        }
        if (ageGT50 == 1) {
            System.out.println("There is " + ageGT50 + " age above 50.");
        } else {
            System.out.println("There are " + ageGT50 + " ages above 50.");
        }
        System.out.println("----------------------------------------------");
    }
}
