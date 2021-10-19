package edu.newton.ldp.u2.dificil;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Enter a phrase to know the number of occurrences
 * of each character and which ones occurred the most
 *
 * @author yuri-italo
 */

public class Ex7NumeroDeOcorrencias {
    public static void main(String[] args) {
        try {
            String phrase = JOptionPane.showInputDialog("Enter a phrase:");

            if (phrase.trim().equals(""))
                JOptionPane.showMessageDialog(null,"There is no input!", "ERROR",JOptionPane.ERROR_MESSAGE);
            else {
                JOptionPane.showMessageDialog(null, numberOfOccurrences(phrase));
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,"Thanks for passing by!");
        }
    }

    public static String numberOfOccurrences(String phrase) {
        phrase = phrase.replaceAll(" ", "⎵");

        // moving the distinct ones to an Array
        List<Character> list = new ArrayList<>();
        int qtt = 0;

        for (int i = 0; i < phrase.length(); i++) {
            list.add(phrase.charAt(i));
        }

        List<Character> aux = list.stream()
                .distinct()
                .collect(Collectors.toList());

        Character[] distinct = new Character[aux.toArray().length];
        aux.toArray(distinct);

        // counting the number of occurrences
        int[] numberOfOccurrences = new int[aux.toArray().length];
        for (int i = 0; i < distinct.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {
                if (distinct[i] == phrase.charAt(j))
                    qtt++;
            }
            numberOfOccurrences[i] = qtt;
            qtt = 0;
        }

        // saving the number of occurrences in an StringBuilder
        StringBuilder numberOfCharacters = new StringBuilder();
        int highest = 0;

        for (int i = 0; i < distinct.length; i++) {
            numberOfCharacters.append(distinct[i]).append(" = ").append(numberOfOccurrences[i]).append("\n");
            if (i == 0)
                highest = numberOfOccurrences[i];
            else {
                if (numberOfOccurrences[i] >= highest)
                    highest = numberOfOccurrences[i];
            }
        }

        // checking for repetition
        StringBuilder highestApparition = new StringBuilder();

        for (int i = 0; i < distinct.length; i++) {
            if (numberOfOccurrences[i] == highest)
                highestApparition.append(distinct[i]).append(" = ").append(numberOfOccurrences[i]).append("\n");
        }

        // concatenating result
        StringBuilder result = new StringBuilder();
        result.append("Characters' occurrences:\n")
                .append(numberOfCharacters)
                .append("\nHighest number of occurrences:\n")
                .append(highestApparition);

        return result.toString();
    }
}
