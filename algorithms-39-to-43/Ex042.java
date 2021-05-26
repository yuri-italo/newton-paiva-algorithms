import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int gradeGT70 = 0, ageGT20 = 0, age, c;
        float average, grade, classGrade = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("             AGE AND GRADE'S AVERAGE          ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (c = 0; c < 30; c++) {
            while (true) {
                System.out.print("Type the Student " + (c + 1) + " grade: ");
                grade = read.nextFloat();
                if (grade < 0 || grade > 100) {
                    System.out.println("----------------------------------------------");
                    System.out.println("         [ERROR] Type a valid grade!          ");
                    System.out.println("----------------------------------------------");
                } else if (grade > 70) {
                    gradeGT70++;
                    classGrade += grade;
                    break;
                } else {
                    classGrade += grade;
                    break;
                }
            }

            while (true) {
                System.out.print("Type the Student " + (c + 1) + " age: ");
                age = read.nextInt();
                if (age < 0) {
                    System.out.println("----------------------------------------------");
                    System.out.println("          [ERROR] Type a valid age!           ");
                    System.out.println("----------------------------------------------");
                } else if (age > 20) {
                    ageGT20++;
                    break;
                } else {
                    break;
                }
            }
            System.out.println("----------------------------------------------");
        }

        average = classGrade / c;

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Students scoring higher than 70: " + gradeGT70);
        System.out.println("Students over 20 years old: " + ageGT20);
        System.out.println("Class' average: " + average);
        System.out.println("----------------------------------------------");
    }
}
