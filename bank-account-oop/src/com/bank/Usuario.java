package com.bank;
import java.util.Scanner;

public class Usuario implements Operacoes{
    private String nome;
    private int opcao;
    Scanner leia = new Scanner(System.in);

    @Override
    public void mostrarMenuPrincipal() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                QUAL OPERAÇÃO DESEJA REALIZAR?                ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("    1 \t\t------------>\t\t Creditar");
        System.out.println("    2 \t\t------------>\t\t Debitar");
        System.out.println("    3 \t\t------------>\t\t Transferir");
        System.out.println("    4 \t\t------------>\t\t Saldo");
        System.out.println("    5 \t\t------------>\t\t Sair");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("Escolha uma opção: ");
    }

    @Override
    public void escolherConta(Corrente CC, Poupanca CP) {
        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("                      ESCOLHA UMA OPÇÃO                       ");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            if (opcao < 1 || opcao > 2)
                System.out.println("Informe uma opção válida");
            else
                break;
        }
    }

    @Override
    public void escolherTransferencia(Corrente CC, Poupanca CP) {
        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("                      ESCOLHA UMA OPÇÃO                       ");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - Conta Corrente para Conta Poupança");
            System.out.println("2 - Conta Poupança para Conta Corrente");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            if (opcao < 1 || opcao > 2)
                System.out.println("Informe uma opção válida");
            else
                break;
        }
    }

    @Override
    public void fazerCadastro(Corrente CC, Poupanca CP) {
        System.out.print("Entre com o nome do cliente: ");
        this.nome = leia.nextLine();

        System.out.print("Entre com o número da Conta Corrente: ");
        CC.setNumeroConta(leia.nextInt());
        while (true) {
            System.out.print("Entre com o saldo inicial da Conta Corrente [" + CC.getNumeroConta() + "] : ");
            CC.setSaldoInicial(leia.nextFloat());
            if (CC.getSaldoInicial() < 0) {
                System.out.println("O saldo inicial não pode ser negativo");
            } else {
                break;
            }
        }

        System.out.print("Entre com o número da Conta Poupança: ");
        CP.setNumeroConta(leia.nextInt());
        while (true) {
            System.out.print("Entre com seu saldo inicial da Conta Poupança [" + CP.getNumeroConta() + "] : ");
            CP.setSaldoInicial(leia.nextFloat());
            if (CP.getSaldoInicial() < 0) {
                System.out.println("O saldo inicial não pode ser negativo");
            } else {
                break;
            }
        }

    }

    @Override
    public void creditar(Corrente CC, Poupanca CP) {
        escolherConta(CC,CP);
        if (opcao == 1) {
            while (true) {
                System.out.print("Qual valor a creditar na conta corrente [" + CC.getNumeroConta() + "] -> ");
                CC.setMovimentacao(leia.nextFloat());
                if (CC.getMovimentacao() < 0)
                    System.out.println("O valor não pode ser negativo");
                else
                    break;
            }
            CC.setSaldoInicial(CC.getMovimentacao() + CC.getSaldoInicial());
            System.out.println("Saldo atual na Conta Corrente [" + CC.getNumeroConta() + "] -> " + CC.getSaldoInicial());
        } else {
            while (true) {
                System.out.print("Qual valor a creditar na conta poupança [" + CP.getNumeroConta() + "] -> ");
                CP.setMovimentacao(leia.nextFloat());
                if (CP.getMovimentacao() < 0)
                    System.out.println("O valor não pode ser negativo");
                else
                    break;
            }
            CP.setSaldoInicial(CP.getMovimentacao() + CP.getSaldoInicial());
            System.out.println("Saldo atual na Conta Poupança [" + CP.getNumeroConta() + "] -> " + CP.getSaldoInicial());
        }
    }

    @Override
    public void debitar(Corrente CC, Poupanca CP) {
        escolherConta(CC,CP);
        if (opcao == 1) {
            while (true) {
                System.out.print("Qual valor a debitar na conta corrente [" + CC.getNumeroConta() + "] -> ");
                CC.setMovimentacao(leia.nextFloat());
                if (CC.getMovimentacao() < 0)
                    System.out.println("O valor não pode ser negativo");
                else
                    break;
            }
            CC.setSaldoInicial(CC.getSaldoInicial() - CC.getMovimentacao());
            System.out.println("Saldo atual na Conta Corrente [" + CC.getNumeroConta() + "] -> " + CC.getSaldoInicial());
        } else {
            while (true) {
                System.out.print("Qual valor a debitar na conta poupança [" + CP.getNumeroConta() + "] -> ");
                CP.setMovimentacao(leia.nextFloat());
                if (CP.getMovimentacao() < 0)
                    System.out.println("O valor não pode ser negativo");
                else if (CP.getMovimentacao() > CP.getSaldoInicial())
                    System.out.println("Saldo insuficiente");
                else
                    break;
            }
            CP.setSaldoInicial(CP.getSaldoInicial() - CP.getMovimentacao());
            System.out.println("Saldo atual na Conta Poupança [" + CP.getNumeroConta() + "] -> " + CP.getSaldoInicial());
        }
    }

    @Override
    public void transferir(Corrente CC, Poupanca CP) {
        escolherTransferencia(CC, CP);
        while (true) {
            if (opcao == 1) {
                System.out.print("Qual o valor da transferência -> ");
                CC.setMovimentacao(leia.nextFloat());
                if (CC.getMovimentacao() < 0)
                    System.out.println("O valor não pode ser negativo");
                else {
                    CC.setSaldoInicial(CC.getSaldoInicial() - CC.getMovimentacao());
                    CP.setSaldoInicial(CC.getMovimentacao() + CP.getSaldoInicial());
                    System.out.println("Saldo atual na Conta Corrente [" + CC.getNumeroConta() + "] -> " + CC.getSaldoInicial());
                    System.out.println("Saldo atual na Conta Poupança [" + CP.getNumeroConta() + "] -> " + CP.getSaldoInicial());
                    break;
                }
            } else {
                System.out.print("Qual o valor da transferência -> ");
                CP.setMovimentacao(leia.nextFloat());
                if (CP.getMovimentacao() < 0)
                    System.out.println("O valor não pode ser negativo");
                else if (CP.getMovimentacao() > CP.getSaldoInicial())
                    System.out.println("Saldo insuficiente");
                else {
                    CP.setSaldoInicial(CP.getSaldoInicial() - CP.getMovimentacao());
                    CC.setSaldoInicial(CP.getMovimentacao() + CC.getSaldoInicial());
                    System.out.println("Saldo atual na Conta Corrente [" + CC.getNumeroConta() + "] -> " + CC.getSaldoInicial());
                    System.out.println("Saldo atual na Conta Poupança [" + CP.getNumeroConta() + "] -> " + CP.getSaldoInicial());
                    break;
                }
            }
        }
    }

    @Override
    public void verExtrato(Corrente CC, Poupanca CP) {
        System.out.println("\nSr(a). " + this.nome + " os saldos das suas contas são:");
        System.out.println("--------------------------------------------------------------");
        System.out.println("             SALDO CONTA CORRENTE E CONTA POUPANÇA            ");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Saldo atual na Conta Corrente [%d]: R$ %.2f", CC.getNumeroConta(), CC.getSaldoInicial());
        System.out.printf("\nSaldo atual na Conta Poupança [%d]: R$ %.2f", CP.getNumeroConta(), CP.getSaldoInicial());
        System.out.println("\n--------------------------------------------------------------");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
