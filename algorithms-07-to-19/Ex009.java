import java.util.Scanner;

public class Ex009 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double height;
		double base;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\t\t  TRIANGLE'S AREA ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the triangle's height: ");
		height = read.nextDouble();

		System.out.print("Type the triangle's base: ");
		base = read.nextDouble();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		System.out.println("THE TRIANGLE'S AREA IS " + base * height / 2);
		System.out.println("----------------------------------------------");
	}
}