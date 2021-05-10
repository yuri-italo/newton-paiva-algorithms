import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int monthNumber;
        String month = "", days = "";

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                HOW MANY DAYS?                ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Type a month number: ");
        monthNumber = read.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULT                    ");
        System.out.println("----------------------------------------------");
        switch (monthNumber) {
            case 1:
                month = "January";
                days = "31";
                break;
            case 2:
                month = "February";
                days = "28 / 29";
                break;
            case 3:
                month = "March";
                days = "31";
                break;
            case 4:
                month = "April";
                days = "30";
                break;
            case 5:
                month = "May";
                days = "31";
                break;
            case 6:
                month = "June";
                days = "30";
                break;
            case 7:
                month = "July";
                days = "31";
                break;
            case 8:
                month = "August";
                days = "31";
                break;
            case 9:
                month = "September";
                days = "30";
                break;
            case 10:
                month = "October";
                days = "31";
                break;
            case 11:
                month = "November";
                days = "30";
                break;
            case 12:
                month = "December";
                days = "31";
                break;
            default:
                System.out.println("Type a valid month number!");
        }
        if(monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Number " + monthNumber + " refers to " + month + "! \nAnd it has " + days + " days.");
        }
        System.out.println("----------------------------------------------");
    }
}
