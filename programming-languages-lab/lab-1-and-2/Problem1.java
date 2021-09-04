package lab;

import javax.swing.*;

public class Problem1 {
    /**
     * Problem 1:
     *
     * You must enter an integer number greater than 1
     * to know if it is prime or not
     *
     * @author yuri-italo
     */

    public static void main(String[] args) {
        // Input
        int value = readNumber();

        // Output
        if (value == 0)
            JOptionPane.showMessageDialog(null,"Thanks for passing by.");
        else {
            if (isPrime(value))
                JOptionPane.showMessageDialog(null,"Number " + value + " is prime!");
            else
                JOptionPane.showMessageDialog(null,"Number " + value + " is not prime!");
        }
    }

    public static int readNumber() {
        int value;
        String input;
        try {
            while (true) {
                while (true) {
                    input = JOptionPane.showInputDialog("Enter an INTEGER value:");
                    if (input.contains(".") || input.contains(",") || input.matches("[a-zA-Z.? ]*"))
                        JOptionPane.showMessageDialog(null,"Enter an INTEGER number!");
                    else
                        break;
                }

                value = Integer.parseInt(input);

                if (value > 1)
                    break;
                else
                    JOptionPane.showMessageDialog(null,"Number must be GREATER THAN 1!");
            }
            return value;
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public static boolean isPrime(Integer number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}