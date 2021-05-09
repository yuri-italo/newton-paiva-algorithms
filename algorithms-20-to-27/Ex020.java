import java.util.Scanner;

public class Ex020 {
	public static void main (String [] args) {
		Scanner read = new Scanner(System.in);
		float sideA, sideB, sideC;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("          What is the triangle type?          ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the first triangle's side: ");
		sideA = read.nextFloat();
		System.out.print("Type the second triangle's side: ");
		sideB = read.nextFloat();
		System.out.print("Type the third triangle's side: ");
		sideC = read.nextFloat();

		System.out.println("----------------------------------------------");
		System.out.println("                    RESULT                    ");
		System.out.println("----------------------------------------------");
		if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) {
			if (sideA == sideB && sideB == sideC) {
				System.out.println("This is an EQUILATERAL triangle!");
			} else if (sideA == sideB || sideB == sideC || sideA == sideC) {
				System.out.println("This is an ISOSCELES triangle!");
			} else {
				System.out.println("This is a SCALENE triangle!");
			}
		} else {
			System.out.println("These measures DOES NOT form a triangle!");
		}
		System.out.println("----------------------------------------------");
	}
}

