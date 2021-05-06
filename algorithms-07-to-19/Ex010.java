import java.util.Scanner;

public class Ex010 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float distance;
		float fuel;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\t\t  FUEL CONSUMPTION ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.println("What is the traveled distance? (Km)");
		distance = read.nextFloat();

		System.out.println("How much fuel was consumed? (Liters)");
		fuel = read.nextFloat();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		System.out.printf("THE AVERAGE CONSUMPTION WAS %.2f Km/l\n", distance/fuel);
		System.out.println("----------------------------------------------");
	}
}
