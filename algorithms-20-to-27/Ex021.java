import java.util.Scanner;

public class Ex021 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		int valueA, valueB, sum;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("                ABOVE 10 SUM                  ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type a number: ");
		valueA = read.nextInt();
		System.out.print("Type another number: ");
		valueB = read.nextInt();

		sum = valueA + valueB;

		System.out.println("----------------------------------------------");
		System.out.println("                    RESULT                    ");
		System.out.println("----------------------------------------------");
		if (sum > 10) {
			System.out.println(valueA + " + " + valueB + " = " + sum);
		} else {
			System.out.println("SORRY! I'm allowed to show above 10 sums only.");
		}
		System.out.println("----------------------------------------------");
	}
}