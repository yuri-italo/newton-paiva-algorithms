import java.util.Scanner;

public class Ex050 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String product = "";
        float price = 0;
        float finalPrice = 0;
        int quantity = 0;
        int c = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                 SHOPPING CART                ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println("  Stop buying by entering \"FIM\" on product. ");
        System.out.println("----------------------------------------------");

        while (!(product.toUpperCase().equals("FIM"))) {
            System.out.print("Product " + (c+1) + " description: ");
            product = read.nextLine();

            if (!(product.toUpperCase().equals("FIM"))) {
                while (true) {
                    System.out.print("Price R$ ");
                    price = read.nextFloat();
                    if (price < 0) {
                        System.out.println("[ERROR] Type a valid price!");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.print("Quantity: ");
                    quantity = read.nextInt();
                    read.nextLine();
                    if (quantity < 0) {
                        System.out.println("[ERROR] Type a valid quantity!");
                    } else {
                        finalPrice += (price * quantity);
                        break;
                    }
                }
                System.out.println("----------------------------------------------");
            }
            c++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("                    RESULTS                   ");
        System.out.println("----------------------------------------------");
        System.out.printf("Total cost: R$ %.2f\n", finalPrice              );
        System.out.println("----------------------------------------------");
    }
}
