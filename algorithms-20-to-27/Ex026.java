import java.util.Scanner;

public class Ex026 {
	public static void main(String [] args){
		Scanner read = new Scanner(System.in);
		String name;
		float valorC, profit = 0, valorF;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("           FACTORY AND SELLING COST           ");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		System.out.print("Type the product's name: ");
		name = read.nextLine();
		System.out.print("What is the product's factory cost? R$ ");
		valorC = read.nextFloat();

		System.out.println("----------------------------------------------");
		System.out.println("                   RESULTS                    ");
		System.out.println("----------------------------------------------");
		if(valorC < 0) {
			System.out.println("Invalid factory cost!");
		} else if (valorC < 100.00) {
			profit = (valorC * 70) / 100;
			valorF = valorC + profit;
			System.out.printf("The factory cost of the %s was R$ %.2f \nand the selling price will be R$ %.2f\n",name, valorC, valorF);
		} else if (valorC <= 200.00) {
			profit = (valorC * 50) / 100;
			valorF = valorC + profit;
			System.out.printf("The factory cost of the %s was R$ %.2f \nand the selling price will be R$ %.2f\n",name, valorC, valorF);
		} else {
			profit = (valorC * 30) / 100;
			valorF = valorC + profit;
			System.out.printf("The factory cost of the %s was R$ %.2f \nand the selling price will be R$ %.2f\n",name, valorC, valorF);
		}
		System.out.println("----------------------------------------------");
	}
}