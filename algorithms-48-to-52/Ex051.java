import java.util.Scanner;

public class Ex051 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = "";
        float grade;
        float totalGrade = 0, classAverage = 0;
        float sum = 0;
        int c = 0, i;
        int approved = 0, failed = 0;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("               APPROVED AND FAILED            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println(" You can exit by entering \"FIM\" on student. ");
        System.out.println("----------------------------------------------");

        while (!(name.toUpperCase().equals("FIM"))) {
            while (true) {
                System.out.print("Student " + (c+1) + " name: ");
                name = read.nextLine();
                if (name.matches(".*\\d.*")) {
                    System.out.println("----------------------------------------------");
                    System.out.println("          [ERROR] Type a valid name!          ");
                    System.out.println("----------------------------------------------");
                } else {
                    if (!(name.toUpperCase().equals("FIM"))) c++;
                    break;
                }
            }

            if (!(name.toUpperCase().equals("FIM"))) {
                i = 1;
                while (i < 4) {
                    while (true) {
                        System.out.print(name + "'s grade " + i + ": ");
                        grade = read.nextFloat();
                        if (grade < 0) {
                            System.out.println("----------------------------------------------");
                            System.out.println("         [ERROR] Type a valid grade!          ");
                            System.out.println("----------------------------------------------");
                        } else if (sum + grade > 100) {
                            System.out.println("----------------------------------------------");
                            System.out.println("     [ERROR] You cannot score above 100!      ");
                            System.out.println("----------------------------------------------");
                        } else {
                            break;
                        }
                    }
                    read.nextLine();
                    sum += grade;
                    i++;
                }
                if (sum >= 60) {
                    System.out.println(name + " is approved!");
                    approved++;
                } else {
                    System.out.println(name + " failed!");
                    failed++;
                }
                System.out.println("----------------------------------------------");
                totalGrade += sum;
                sum = 0;
            }
        }

        if (c == 0)
            classAverage = totalGrade / (c+1);
        else
            classAverage = totalGrade / c;

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Approved Students: " + approved);
        System.out.println("Failed Students: " + failed);
        System.out.printf("Class' average: %.2f\n", classAverage);
        System.out.println("----------------------------------------------");
    }
}
