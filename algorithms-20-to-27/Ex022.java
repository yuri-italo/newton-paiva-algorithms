import java.util.Scanner;

public class Ex022{
	public static void main(String [] args){
		int valueA, valueB, valueC;
		Scanner read = new Scanner(System.in);

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("         Equal = +, Different = *             ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the first number: ");
		valueA = read.nextInt();
		System.out.print("Type the second number: ");
		valueB = read.nextInt();

		System.out.println("----------------------------------------------");
		System.out.println("                    RESULT                    ");
		System.out.println("----------------------------------------------");
		if (valueA == valueB) {
			valueC = valueA + valueB;
			System.out.println(valueA + " added to " + valueB + " is: " + valueC);
		} else {
			valueC = valueA * valueB;
			System.out.println(valueA + " multiplied by " + valueB + " is: " + valueC);
		}
		System.out.println("----------------------------------------------");
	}
}