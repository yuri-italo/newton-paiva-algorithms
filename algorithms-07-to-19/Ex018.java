import java.util.Scanner;

public class Ex018 {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		float income;
		float readjust;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("                 NEW SALARY                   ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.print("Inform your income (R$): ");
		income = read.nextFloat();

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULT");
		System.out.println("----------------------------------------------");
		System.out.printf("Your salary of R$ %.2f ", income);
		if (income < 500) {
			readjust = income*15/100;
			System.out.printf("\nwas readjusted by 15 per cent,\nthe new income is R$ %.2f\n", income + readjust);
		} else if (income >= 500 && income <= 1000) {
			readjust = income*10/100;
			System.out.printf("\nwas readjusted by 10 per cent,\nthe new income is R$ %.2f\n", income + readjust);
		} else {
			readjust = income*5/100;
			System.out.printf("\nwas readjusted by 5 per cent,\nthe new income is R$ %.2f\n", income + readjust);
		}
		System.out.println("----------------------------------------------");
	}
}