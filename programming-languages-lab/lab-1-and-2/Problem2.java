package lab;

import javax.swing.*;

public class Problem2 {
    /**
     *
     * First enter your weight (KG)
     * then enter your high (m)
     * to know your BMI
     *
     * @author yuri-italo
     */
    public static void main(String[] args) {
        // Input
        double BMI = readData();

        // Output
        if (BMI == 0)
            JOptionPane.showMessageDialog(null,"Thanks for passing by!");
        else {
            if (BMI < 18.5)
                JOptionPane.showMessageDialog(null,"Your BMI is " + String.format("%.2f",BMI) + " and you are Underweight");
            else if (BMI < 25)
                JOptionPane.showMessageDialog(null,"Your BMI is " + String.format("%.2f",BMI) + " and you are Normal");
            else if (BMI < 30)
                JOptionPane.showMessageDialog(null,"Your BMI is " + String.format("%.2f",BMI) + " and you are Overweight");
            else if (BMI < 40)
                JOptionPane.showMessageDialog(null,"Your BMI is " + String.format("%.2f",BMI) + " and you are Obese");
            else
                JOptionPane.showMessageDialog(null,"Your BMI is " + String.format("%.2f",BMI) + " and you are Morbidly Obese");
        }
    }

    public static Double readData() {
        String input;
        double weight;
        double high;

        try {
            while (true) {
                while (true) {
                    input = JOptionPane.showInputDialog("Enter your weight (KG):");
                    if (input.matches("[a-zA-Z.? ]*") || input.contains(","))
                        JOptionPane.showMessageDialog(null,"Enter a DOUBLE value!");
                    else
                        break;
                }

                weight = Double.parseDouble(input);

                if (weight > 0)
                    break;
                else
                    JOptionPane.showMessageDialog(null,"Your weight has to be above 0 KG.");
            }

            while (true) {
                while (true) {
                    input = JOptionPane.showInputDialog("Enter your high (m):");
                    if (input.matches("[a-zA-Z.? ]*"))
                        JOptionPane.showMessageDialog(null,"Enter a DOUBLE value!");
                    else
                        break;
                }

                high = Double.parseDouble(input);

                if (high > 0)
                    break;
                else
                    JOptionPane.showMessageDialog(null,"Your high has to be above 0 m.");
            }

            return calculateBMI(weight,high);

        } catch (NullPointerException e) {
            return 0.0;
        }
    }

    public static Double calculateBMI(double weight, double high) {
        return weight / (high * high);
    }
}
