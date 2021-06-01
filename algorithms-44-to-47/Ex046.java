import java.util.Scanner;

public class Ex046 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name;
        float price;
        float totalPrice = 0;
        int qtt;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   SHOPPING CART              ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   IMPORTANT                  ");
        System.out.println("   Stop buying by typing \"FIM\" on product.  ");
        System.out.println("----------------------------------------------");

        do {
            System.out.print("Product: ");
            name = read.nextLine();
            if (name.toUpperCase().equals("FIM")) {
                break;
            }
            System.out.print("Price: $ ");
            price = read.nextFloat();
            System.out.print("Quantity: ");
            qtt = read.nextInt();
            read.nextLine();
            price *= qtt;
            totalPrice += price;
            System.out.println("----------------------------------------------");
        } while (true);

        System.out.println("----------------------------------------------");
        System.out.println("                    RESULT                    ");
        System.out.println("----------------------------------------------");
        System.out.printf("TOTAL PRICE: $ %.2f\n", totalPrice);
        System.out.println("----------------------------------------------");

    }
}
