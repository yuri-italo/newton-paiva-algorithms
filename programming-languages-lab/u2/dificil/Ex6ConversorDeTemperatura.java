package edu.newton.ldp.u2.dificil;

import javax.swing.*;

/**
 * Problema
 *
 * Implementar um conversor de temperaturas
 * (celcius, fahrenheit e kelvin)
 *
 * @author yuri-italo
 */

public class Ex6ConversorDeTemperatura {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite uma temperatura em Celsius:");
        float temperatura = Float.parseFloat(entrada);
        float fahrenheit = temperatura * 1.8f + 32;
        float kelvin = temperatura + 273.15f;

        JOptionPane.showMessageDialog(null,temperatura + "° C equivale a :\n"
                + "Fahrenheit: " + String.format("%.1f",fahrenheit) + " °F\n"
                + "Kelvin: " + String.format("%.1f",kelvin) + " K");
    }
}
