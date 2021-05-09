import java.util.Scanner;

public class Ex027 {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		String name;
		int age;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("              MEDICAL SPECIALITY              ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Inform the name: ");
		name = read.nextLine();
		System.out.print("Inform the age: ");
		age = read.nextInt();

		System.out.println("----------------------------------------------");
		System.out.println("                   RESULTS                    ");
		System.out.println("----------------------------------------------");
		if (age < 0 || age > 150) {
			System.out.println("INVALID AGE!");
		} else if (age <= 12) {
			System.out.println(name + " is " + age + " years old \nand will be referred to PEDIATRICS!");
		} else if (age <=59) {
			System.out.println(name + " is " + age + " years old \nand will be referred to NORMAL CARE!");
		} else {
			System.out.println(name + " is " + age + " years old \nand will be referred to GERIATRICS!");
		}
		System.out.println("----------------------------------------------");
	}
}