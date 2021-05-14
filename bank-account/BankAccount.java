import java.util.Scanner;
public class BankAccount {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome, teclado;
        int contaCorrente, contaPoupanca, opcao;
        float saldoCC, saldoCP, deposito, debito, transferencia;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                      BEM-VINDO AO BANCO                      ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        while(true) {
            System.out.print("Entre com o nome do cliente: ");
            nome = leia.nextLine();

            if (nome.matches(".*\\d.*") || !(nome.matches("[a-zA-Z.? ]*"))) {
                System.out.println("[ERRO] O nome deve conter apenas letras!");
                System.out.println("--------------------------------------------------------------");
            } else if (nome.length() < 3) {
                System.out.println("[ERRO] O nome deve conter pelo menos 3 letras!");
                System.out.println("--------------------------------------------------------------");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Entre com o n�mero da Conta Corrente: ");
            teclado = leia.nextLine();

            if (teclado.matches(".*\\d.*") && teclado.length() == 5) {
                contaCorrente = Integer.parseInt(teclado);
                break;
            } else {
                System.out.println("[ERRO] O n�mero deve conter 5 d�gitos num�ricos");
                System.out.println("--------------------------------------------------------------");
            }
        }

        while (true) {
            System.out.print("Entre com o saldo inicial da Conta Corrente [" + contaCorrente + "]: ");
            teclado = leia.nextLine();

            if(teclado.matches(".*\\d.*")) {
                saldoCC = Float.parseFloat(teclado);
                break;
            } else {
                System.out.println("[ERRO] Informe um valor v�lido");
                System.out.println("--------------------------------------------------------------");
            }
        }

        while (true) {
            System.out.print("Entre com o n�mero da Conta Poupan�a: ");
            teclado = leia.nextLine();

            if (teclado.matches(".*\\d.*") && teclado.length() == 5) {
                contaPoupanca = Integer.parseInt(teclado);
                break;
            } else {
                System.out.println("[ERRO] O n�mero deve conter 5 d�gitos num�ricos");
                System.out.println("--------------------------------------------------------------");
            }
        }

        while (true) {
            System.out.print("Entre com o saldo inicial da Conta Poupan�a [" + contaPoupanca + "]: ");
            teclado = leia.nextLine();

            if(teclado.matches(".*\\d.*")) {
                saldoCP = Float.parseFloat(teclado);
                if (saldoCP < 0) {
                    System.out.println("[ERRO] Sua conta Poupan�a n�o pode ficar negativa");
                    System.out.println("--------------------------------------------------------------");
                } else {
                    break;
                }
            } else {
                System.out.println("[ERRO] Informe um valor v�lido");
                System.out.println("--------------------------------------------------------------");
            }
        }


        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("                QUAL OPERA��O DESEJA REALIZAR?                ");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 \t\t------------>\t\t Creditar");
            System.out.println("2 \t\t------------>\t\t Debitar");
            System.out.println("3 \t\t------------>\t\t Transferir");
            System.out.println("4 \t\t------------>\t\t Saldo");
            System.out.println("5 \t\t------------>\t\t Sair");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("Escolha uma op��o: ");
            opcao = leia.nextInt();

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("                 QUAL CONTA DESEJA CREDITAR?                  ");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    while(true) {
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupan�a");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma op��o: ");
                        opcao = leia.nextInt();

                        if(opcao < 1 || opcao > 2) {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("               [ERRO] Digite uma op��o v�lida!                ");
                            System.out.println("--------------------------------------------------------------");
                        } else {
                            break;
                        }
                    }

                    if (opcao == 1) {
                        System.out.print("Qual o valor a creditar na sua Conta Corrente " + contaCorrente + "?  -> ");
                        deposito = leia.nextFloat();
                        saldoCC += deposito;
                        System.out.println("Saldo atual na Conta Corrente [" + contaCorrente + "] -> " + saldoCC);
                    } else {
                        System.out.print("Qual o valor a creditar na sua Conta Poupan�a [" + contaPoupanca + "]?  -> ");
                        deposito = leia.nextFloat();
                        saldoCP += deposito;
                        System.out.println("Saldo atual na Conta Poupan�a [" + contaPoupanca + "] -> " + saldoCP);
                    }
                    break;
                case 2:
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("                  QUAL CONTA DESEJA DEBITAR?                  ");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    while (true) {
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupan�a");
                        System.out.print("Escolha uma op��o: ");
                        opcao = leia.nextInt();

                        if (opcao < 1 || opcao > 2) {
                            System.out.println("Digite uma op��o v�lida!");
                        } else {
                            break;
                        }
                    }

                    if (opcao == 1) {
                        System.out.print("Qual o valor a debitar na Conta Corrente [" + contaCorrente + "]? -> ");
                        debito = leia.nextFloat();
                        saldoCC -= debito;
                        System.out.println("Saldo atual na Conta Corrente [" + contaCorrente + "] -> " + saldoCC);
                    } else {
                        while (true) {
                            System.out.print("Qual o valor a debitar na Conta Poupan�a [" + contaPoupanca + "]? -> ");
                            debito = leia.nextFloat();
                            if (saldoCP - debito < 0) {
                                System.out.println("Sua Conta Poupan�a n�o pode ficar negativa!\n" +
                                        "Seu saldo atual �: " + saldoCP + ". Tente novamente.");
                            } else if (saldoCP == 0 && debito > 0) {
                                System.out.println("Seu saldo �: " + saldoCP + ". Adicione fundos e tente novamente!");
                            } else {
                                saldoCP -= debito;
                                System.out.println("Saldo atual na Conta Poupan�a [" + contaPoupanca + "] -> " + saldoCP);
                                break;
                            }
                        }
                    }
                case 3:
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("                      ESCOLHA UMA OP��O                       ");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    while (true) {
                        System.out.println("1 - Conta Corrente para Conta Poupan�a");
                        System.out.println("2 - Conta Poupan�a para Conta Corrente");
                        System.out.print("Escolha uma op��o: ");
                        opcao = leia.nextInt();

                        if(opcao == 1) {
                            System.out.print("Qual valor deseja transferir para a Conta Poupan�a? ");
                            transferencia = leia.nextFloat();
                            if (saldoCC - transferencia < 0) {
                                saldoCC -= transferencia;
                                saldoCP += transferencia;
                                System.out.println("Valor transferido com sucesso!");
                                System.out.println("Conta Corrente " + contaCorrente + " est� com um saldo negativo de " + saldoCC);
                                System.out.println("Saldo atual na Conta Poupan�a " + contaPoupanca + " -> " + saldoCP);
                                System.out.println("--------------------------------------------------------------");
                            } else {
                                saldoCC -= transferencia;
                                saldoCP += transferencia;
                                System.out.println("Valor transferido com sucesso!");
                                System.out.println("Saldo atual na Conta Corrente " + contaCorrente + " -> " + saldoCC);
                                System.out.println("Saldo atual na Conta Corrente " + contaPoupanca + " -> " + saldoCP);
                            }
                        } else {
                            System.out.print("Qual valor deseja transferir para a Conta Corrente? ");
                            transferencia = leia.nextFloat();
                            if (saldoCP - transferencia < 0) {
                                System.out.println("Sua Conta Poupan�a n�o pode ficar negativa");
                                System.out.println("Seu saldo atual � " + saldoCP);
                                System.out.println("--------------------------------------------------------------");
                            } else {
                                saldoCP -= transferencia;
                                saldoCC += transferencia;
                                System.out.println("Valor transferido com sucesso!");
                                System.out.println("Saldo atual na Conta Corrente " + contaCorrente + " -> " + saldoCC);
                                System.out.println("Saldo atual na Conta Corrente " + contaPoupanca + " -> " + saldoCP);
                            }
                        }
                        break;
                    }
                case 4:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("             SALDO CONTA CORRENTE E CONTA POUPAN�A            ");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Saldo atual na Conta Corrente " + contaCorrente + " -> " + saldoCC);
                    System.out.println("Saldo atual na Conta Poupan�a " + contaPoupanca + " -> " + saldoCP);
                    System.out.println("--------------------------------------------------------------");
                    break;
                default:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("                [ERRO] Digite uma op��o v�lida!               ");
                    System.out.println("--------------------------------------------------------------");
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("          Obrigado por trabalhar com o nosso banco!!!         ");
        System.out.println("--------------------------------------------------------------");
    }
}
