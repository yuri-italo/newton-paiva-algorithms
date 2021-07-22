package com.bank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        Usuario user = new Usuario();
        Corrente CC = new Corrente();
        Poupanca CP = new Poupanca();

        user.fazerCadastro(CC,CP);
        do {
            user.mostrarMenuPrincipal();
            opcao = leia.nextInt();
            if (opcao < 1 || opcao > 5)
                System.out.println("Informe uma opção válida");
            else
                if (opcao == 1)
                    user.creditar(CC,CP);
                else if (opcao == 2)
                    user.debitar(CC,CP);
                else if (opcao == 3)
                    user.transferir(CC,CP);
                else if (opcao == 4)
                    user.verExtrato(CC,CP);
                else
                    break;
        } while(true);
        System.out.println("\nObrigado por trabalhar com o nosso banco!!!");
    }
}
