import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int monthNumber;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("              WHAT MONTH IS IT?               ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Type a month number: ");
        monthNumber = read.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULT                    ");
        System.out.println("----------------------------------------------");
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Type a valid month number!");
        }
        switch (monthNumber) {
            case 1:
                System.out.println("Number " + monthNumber + " refers to January!");
                break;
            case 2:
                System.out.println("Number " + monthNumber + " refers to February!");
                break;
            case 3:
                System.out.println("Number " + monthNumber + " refers to March!");
                break;
            case 4:
                System.out.println("Number " + monthNumber + " refers to April!");
                break;
            case 5:
                System.out.println("Number " + monthNumber + " refers to May!");
                break;
            case 6:
                System.out.println("Number " + monthNumber + " refers to June!");
                break;
            case 7:
                System.out.println("Number " + monthNumber + " refers to July!");
                break;
            case 8:
                System.out.println("Number " + monthNumber + " refers to August!");
                break;
            case 9:
                System.out.println("Number " + monthNumber + " refers to September!");
                break;
            case 10:
                System.out.println("Number " + monthNumber + " refers to October!");
                break;
            case 11:
                System.out.println("Number " + monthNumber + " refers to November!");
                break;
            case 12:
                System.out.println("Number " + monthNumber + " refers to December!");
        }
        System.out.println("----------------------------------------------");
    }
}
