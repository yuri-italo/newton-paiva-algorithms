import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float salary, newSalary = 0;
        int choice;
        String profession = "", percentage = "";

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\t1 \t--> \tManager");
        System.out.println("\t2 \t--> \tSalesman");
        System.out.println("\t3 \t--> \tProgrammer");
        System.out.println("\t4 \t--> \tDriver");
        System.out.println("\t5 \t--> \tCity Councilor");
        System.out.println("\t6 \t--> \tCongressperson");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Choose your profession: ");
        choice = read.nextInt();

        if (choice < 1 || choice > 6) {
            System.out.println("----------------------------------------------");
            System.out.println("                    RESULT                    ");
            System.out.println("----------------------------------------------");
            System.out.print("Type a valid option!");
        } else {
            System.out.print("Inform your monthly income: ");
            salary = read.nextFloat();

            System.out.println("----------------------------------------------");
            System.out.println("                    RESULT                    ");
            System.out.println("----------------------------------------------");
            switch (choice) {
                case 1:
                    profession = "Manager";
                    percentage = "30%";
                    newSalary = salary * 0.3f + salary;
                    break;
                case 2:
                    profession = "Salesman";
                    percentage = "40%";
                    newSalary = salary * 0.4f + salary;
                    break;
                case 3:
                    profession = "Programmer";
                    percentage = "50%";
                    newSalary = salary * 0.5f + salary;
                    break;
                case 4:
                    profession = "Driver";
                    percentage = "60%";
                    newSalary = salary * 0.6f + salary;
                    break;
                case 5:
                    profession = "City Councilor";
                    percentage = "0%";
                    newSalary = salary;
                    break;
                case 6:
                    profession = "Congressperson";
                    percentage = "0%";
                    newSalary = salary;
                    break;
            }
            System.out.printf("Being a %s, your increase is %s, \nyour new income will be $%.2f.",profession,percentage,newSalary);
        }
        System.out.println("\n----------------------------------------------");
    }
}
