import java.util.Scanner;

public class Ex016 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float n1;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\t\t   DIVISIBLE BY 5 ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type a number: ");
		n1 = read.nextFloat();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		if (n1 % 5 == 0) {
			System.out.println("THE NUMBER IS DIVISIBLE BY 5!");
		} else {
			System.out.println("THE NUMBER IS NOT DIVISIBLE BY 5!");
		}
		System.out.println("----------------------------------------------");
	}
}