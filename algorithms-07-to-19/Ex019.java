import java.util.Scanner;

public class Ex019{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int age;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("             DO I HAVE TO VOTE?               ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.print("Type your age: ");
		age = read.nextInt();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		if (age < 0) {
			System.out.println("INVALID AGE! Type an age above 0.");
		} else if (age < 16 & age < 17){
			System.out.println("-->There is no need to vote!");
		} else if (age < 18 | age >65) {
			System.out.println("-->It is optional to vote!");
		} else {
			System.out.println("--> You must vote!");
		}
		System.out.println("----------------------------------------------");
	}
}