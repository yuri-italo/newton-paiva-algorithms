import java.util.Scanner;

public class Ex052 {
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        int age = 0;
        int c = 0;
        int manQtt = 0;
        int womanQtt = 0;
        float menAge = 0;
        float weight, womenWeight = 0;
        float average;
        String sex;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("            AGE AND WEIGHT AVERAGE            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println("    You can exit by entering \"-1\" on age.   ");
        System.out.println("----------------------------------------------");
        while (age != -1) {
            while (true) {
                System.out.print("Person " + (c+1) + " age: ");
                age = read.nextInt();
                if(age < -1) {
                    System.out.println("[ERROR] Type a valid age!");
                } else {
                    break;
                }
            }

            if (age == -1) {
                System.out.println("Exiting...");
                Thread.sleep(1000);
                break;
            }

            while (true) {
                System.out.print("Person " + (c+1) + " Weight: ");
                weight = read.nextFloat();
                if (weight < 0) {
                    System.out.println("[ERROR] Type a valid weight!");
                } else {
                    break;
                }
            }

            read.nextLine();
            while (true) {
                System.out.print("Person " + (c+1) + " Sex [M/F]: ");
                sex = read.nextLine();
                if (!(sex.toUpperCase().equals("M") || sex.toUpperCase().equals("F"))) {
                    System.out.println("[ERROR] Type a valid option!");
                } else if (sex.toUpperCase().equals("M")) {
                    manQtt++;
                    menAge += age;
                    break;
                } else {
                    womanQtt++;
                    womenWeight += weight;
                    break;
                }
            }
            c++;
            System.out.println("----------------------------------------------");
        }

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.println("Men's quantity: " + manQtt);
        System.out.println("Women's quantity: " + womanQtt);
        if (manQtt == 0) average = 0;
        else average = menAge / manQtt;
        System.out.printf("Men's age average: %.2f\n", average);
        if (womanQtt == 0) average = 0;
        else average = womenWeight / womanQtt;
        System.out.printf("Women's weight average: %.3f\n", average);
        System.out.println("----------------------------------------------");
    }
}
