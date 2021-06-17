import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 1;
        int c = 0;
        int evenQtt = 0;
        int oddSum = 0;
        String answer;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("           EVEN QUANTITY AND ODD SUM          ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println("   You can cancel anytime by entering \"-1\". ");
        System.out.println("----------------------------------------------");
        while (num != -1) {
            while (true) {
                System.out.print("--> Number " + (c+1) +": " );
                num = read.nextInt();
                if (num == -1) {
                    read.nextLine();
                    while (true) {
                        System.out.print("Would you like to sum -1? [S/N] ");
                        answer = read.nextLine();

                        if (answer.toUpperCase().equals("N")) break;
                        if (answer.toUpperCase().equals("S")) {
                            oddSum += num;
                            break;
                        }
                    }
                    break;
                } else if (num == 0) {
                    System.out.println("[ERROR] 0 is a neutral number. TRY AGAIN!");
                    System.out.println("----------------------------------------------");
                } else {
                    if (num % 2 == 0) {
                        evenQtt++;
                    } else {
                        oddSum += num;
                    }
                    break;
                }
            }
            c++;
        }

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Even's quantity: " + evenQtt);
        System.out.println("Odd's sum: " + oddSum);
        System.out.println("----------------------------------------------");
    }
}
