package lab;

import javax.swing.*;

public class Problem3 {
    /**
     *
     * Enter your gross salary
     * to know your income tax
     *
     *
     * @author yuri-italo
     */
    public static void main(String[] args) {
        // Input
        double salary = readSalary();

        // Output
        if (salary == -1.0)
            JOptionPane.showMessageDialog(null,"Thanks for passing by!");
        else {
            calculateIncomeTax(salary,calculateTax(salary));
        }
    }

    public static double readSalary() {
        double salary;
        String input;
        try {
            while (true) {
                while (true) {
                    input = JOptionPane.showInputDialog("Enter your gross salary $:");
                    if (input.matches("[a-zA-Z.? ]*") || input.contains(","))
                        JOptionPane.showMessageDialog(null,"Enter a DOUBLE number!");
                    else
                        break;
                }

                salary = Double.parseDouble(input);

                if (salary >= 0)
                    break;
                else
                    JOptionPane.showMessageDialog(null,"Gross salary has to be equal $ 0.00 or above!");
            }
            return salary;
        } catch (NullPointerException e) {
            return -1.0;
        }

    }

    public static double calculateTax(double salary) {
        double tax;

        if (salary < 1903.99)
            tax = 0.0;
        else if (salary < 2826.66)
            tax = 7.5;
        else if (salary < 3751.06)
            tax = 15.0;
        else if (salary < 4664.69)
            tax = 22.5;
        else
            tax = 27.5;

        return tax;
    }

    public static void calculateIncomeTax(double salary, double tax) {
        double incomeTax = salary / 100 * tax;
        if (tax == 0)
            JOptionPane.showMessageDialog(null,"You're free of taxes!");
        else
            JOptionPane.showMessageDialog(null,"Your income tax is " + tax + "%." +
                    "\n Value to be paid: $ " + String.format("%.2f",incomeTax));
    }
}
