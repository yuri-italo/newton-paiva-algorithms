import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int age;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("               WHICH CATEGORY?                ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the swimmer's age: ");
		age = read.nextInt();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		if (age <= 4) {
			System.out.println("AGE NOT PERMITTED! Type an age above 4.");
		} else if (age <= 12) {
			System.out.println("Children category");
		} else if (age <= 17){
			System.out.println("Youth category");
		} else if (age <= 25) {
			System.out.println("Professional category");
		} else {
			System.out.print("Out of age");
		}
		System.out.println("----------------------------------------------");
	}

}