import java.util.Scanner;

public class Ex015 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String team1;
		int goalsT1;
		String team2;
		int goalsT2;

		System.out.println("----------------------------------------------------------------");
		System.out.println("                           MATCH RESULT                         ");
		System.out.println("----------------------------------------------------------------");

		System.out.print("Type the name of team 1: ");
		team1 = read.nextLine();

		System.out.print("How many goals team 1 scored: ");
		goalsT1 = read.nextInt();
		read.nextLine();
		System.out.println("----------------------------------------------------------------");

		System.out.print("Type the name of team 2: ");
		team2 = read.nextLine();

		System.out.print("How many goals team 2 scored: ");
		goalsT2 = read.nextInt();
		read.nextLine();
		System.out.println("----------------------------------------------------------------\n");

		if (goalsT1 > goalsT2) {
			System.out.println(team1 + " WINS! " + goalsT1 + " x " + goalsT2);
		} else if (goalsT1 == goalsT2) {
			System.out.println("THE MATCH WAS DRAWN! " + goalsT1 + " x " + goalsT2);
		} else {
			System.out.println(team2 + " WINS! " + goalsT2 + " x " + goalsT1);
		}
	}
}