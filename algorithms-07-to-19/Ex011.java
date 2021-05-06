import java.util.Scanner;

public class Ex011 {
	public static void main (String[] args){
		Scanner read = new Scanner(System.in);
		float precoF; // Factory cost
		float precoC; // Costumer's price
		float precoD; // Distributor's taxes
		float precoI; // Taxes

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\t\t  COSTUMER'S COST ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the car's factory cost (R$): ");
		precoF = read.nextFloat();

		precoD = precoF*12/100;
		precoI = precoF*45/100;
		precoC = precoF*12/100 + precoF*45/100 + precoF;

		System.out.println("----------------------------------------------");
		System.out.println("\t\t\t\t  RESULTS");
		System.out.println("----------------------------------------------");
		System.out.printf("The factory cost is R$ %.2f", precoF);
		System.out.printf("\nTHE DISTRIBUTOR'S TAXES IS R$ %.2f \n", precoD);
		System.out.printf("THE TAXES' VALUE IS R$ %.2f \n", precoI);
		System.out.printf("THE COSTUMER'S COST IS R$ %.2f \n", precoC);
		System.out.println("----------------------------------------------");
	}
}