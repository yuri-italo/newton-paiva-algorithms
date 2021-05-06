import java.util.Scanner;

public class Ex013 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		float n1;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\tPOSITIVE, NEGATIVE OR NEUTRAL ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type a number: ");
		n1 = read.nextFloat();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		if (n1 > 0) {
			System.out.println("THE NUMBER IS POSITIVE.");
		} else if (n1 < 0) {
			System.out.println("THE NUMBER IS NEGATIVE.");
		} else {
			System.out.println("THE NUMBER IS NEUTRAL.");
		}
		System.out.println("----------------------------------------------");
	}
}