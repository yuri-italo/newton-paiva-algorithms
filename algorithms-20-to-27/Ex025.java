import java.util.Scanner;

public class Ex025 {
	public static void main(String [] args) {
		int age;
		Scanner read = new Scanner(System.in);

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("                   AGE RANGE                  ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type your age: ");
		age = read.nextInt();

		System.out.println("----------------------------------------------");
		System.out.println("                    RESULT                    ");
		System.out.println("----------------------------------------------");
		if (age < 0 || age > 150) {
			System.out.println("Type a valid age!");
		} else if (age < 18) {
			System.out.println("You are an underage!");
		} else if (age <= 65) {
			System.out.println("You are over eighteen!");
		} else {
			System.out.println("You are an elderly!");
		}
		System.out.println("----------------------------------------------");
	}
}