import java.util.Scanner;

public class Ex008 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		float grade1, grade2, grade3, average;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\t\t\t AVERAGE GRADE");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the first grade: ");
		grade1 = read.nextFloat();

		System.out.print("Type the second grade: ");
		grade2 = read.nextFloat();

		System.out.print("Type the third grade: ");
		grade3 = read.nextFloat();

		average = (grade1+grade2+grade3)/3;

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		System.out.printf("The student's average grade is %.1f \n", average);
		System.out.println("----------------------------------------------");
	}
}