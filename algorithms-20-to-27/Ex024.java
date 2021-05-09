import java.util.Scanner;

public class Ex024 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		int valueA, valueB;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("                DESCENDING ORDER              ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.print("Type a number: ");
		valueA = read.nextInt();
		System.out.print("Type another number: ");
		valueB = read.nextInt();

		System.out.println("----------------------------------------------");
		System.out.println("                    RESULT                    ");
		System.out.println("----------------------------------------------");
		if (valueA == valueB) {
			System.out.println("It's not possible to order equals numbers!");
		} else if (valueA > valueB) {
			System.out.println("The descending order is: " + valueA + " - " + valueB);
		} else {
			System.out.println("The descending order is: " + valueB + " - " + valueA);
		}
		System.out.println("----------------------------------------------");
	}
}