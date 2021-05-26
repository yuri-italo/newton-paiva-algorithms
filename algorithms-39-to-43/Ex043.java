import java.util.Scanner;

public class Ex043 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name;
        float grade, average, sum = 0, totalSum = 0;
        int approvedQtt = 0, disapprovedQtt = 0, c;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("               APPROVED AND FAILED            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (c = 0; c < 4; c++) {
            while (true) {
                System.out.print("Student's name " + (c+1) + ": ");
                name = read.nextLine();
                if(name.matches(".*\\d.*")) {
                    System.out.println("----------------------------------------------");
                    System.out.println("          [ERROR] Type a valid name!          ");
                    System.out.println("----------------------------------------------");
                } else {
                    break;
                }
            }

            for (int n = 0; n < 3; n++) {
                while(true) {
                    System.out.print(name + "'s grade " + (n+1) + ": ");
                    grade = read.nextFloat();
                    read.nextLine();
                    if (grade < 0 || grade > 100) {
                        System.out.println("----------------------------------------------");
                        System.out.println("         [ERROR] Type a valid grade!          ");
                        System.out.println("----------------------------------------------");
                    } else {
                        sum += grade;
                        break;
                    }
                }
            }

            totalSum += sum;

            if (sum/3 >= 60) {
                approvedQtt++;
                System.out.println("----------------------------------------------");
                System.out.println(name + " is APPROVED!");
            } else {
                disapprovedQtt++;
                System.out.println("----------------------------------------------");
                System.out.println(name + " FAILED!");
            }
            sum = 0;
            System.out.println("----------------------------------------------");
        }
        average = totalSum / c;

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Approved Students: " + approvedQtt);
        System.out.println("Failed Students: " + disapprovedQtt);
        System.out.println("Class' average: " + average);
        System.out.println("----------------------------------------------");
    }
}
