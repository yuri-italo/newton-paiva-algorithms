import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) throws InterruptedException {
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
                System.out.println("--------------------------------------------------------------");
                System.out.println("           [ERRO] O nome deve conter apenas letras!           ");
                System.out.println("--------------------------------------------------------------");
                Thread.sleep(1000);
            } else if (nome.length() < 3) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("        [ERRO] O nome deve conter pelo menos 3 letras!        ");
                System.out.println("--------------------------------------------------------------");
                Thread.sleep(1000);
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Entre com o número da Conta Corrente: ");
            teclado = leia.nextLine();

            if (teclado.matches(".*\\d.*") && teclado.length() == 5) {
                contaCorrente = Integer.parseInt(teclado);
                break;
            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("        [ERRO] O número deve conter 5 dígitos numéricos       ");
                System.out.println("--------------------------------------------------------------");
                Thread.sleep(1000);
            }
        }

        while (true) {
            System.out.print("Entre com o saldo inicial da Conta Corrente [" + contaCorrente + "]: ");
            teclado = leia.nextLine();

            if(teclado.matches(".*\\d.*")) {
                saldoCC = Float.parseFloat(teclado);
                break;
            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("                [ERRO] Informe um valor válido                ");
                System.out.println("--------------------------------------------------------------");
                Thread.sleep(1000);
            }
        }

        while (true) {
            System.out.print("Entre com o número da Conta Poupança: ");
            teclado = leia.nextLine();

            if (teclado.matches(".*\\d.*") && teclado.length() == 5) {
                contaPoupanca = Integer.parseInt(teclado);
                if(contaCorrente == contaPoupanca) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("       [ERRO] O número das contas devem ser diferentes!       ");
                    System.out.println("--------------------------------------------------------------");
                    Thread.sleep(1000);
                } else {
                    break;
                }
            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("        [ERRO] O número deve conter 5 dígitos numéricos       ");
                System.out.println("--------------------------------------------------------------");
                Thread.sleep(1000);
            }
        }

        while (true) {
            System.out.print("Entre com o saldo inicial da Conta Poupança [" + contaPoupanca + "]: ");
            teclado = leia.nextLine();

            if(teclado.matches(".*\\d.*")) {
                saldoCP = Float.parseFloat(teclado);
                if (saldoCP < 0) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("       [ERRO] Sua conta Poupança não pode ficar negativa      ");
                    System.out.println("--------------------------------------------------------------");
                    Thread.sleep(1000);
                } else {
                    break;
                }
            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("                [ERRO] Informe um valor válido                ");
                System.out.println("--------------------------------------------------------------");
                Thread.sleep(1000);
            }
        }


        while (true) {
            while (true) {
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
                teclado = leia.nextLine();

                if(teclado.matches(".*\\d.*")) {
                    opcao = Integer.parseInt(teclado);
                    break;
                } else {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("                [ERRO] Digite uma opção válida!               ");
                    System.out.println("--------------------------------------------------------------");
                    Thread.sleep(1000);
                }
            }

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    while(true) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("                 QUAL CONTA DESEJA CREDITAR?                  ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupança");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma opção: ");
                        teclado = leia.nextLine();

                        if(teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if(opcao < 1 || opcao > 2) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("               [ERRO] Digite uma opção válida!                ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                  [ERRO] Formato inválido!                    ");
                            System.out.println("--------------------------------------------------------------");
                            Thread.sleep(1000);
                        }
                    }

                    if (opcao == 1) {
                        while (true) {
                            System.out.print("Qual o valor a creditar na sua Conta Corrente " + contaCorrente + "?  -> ");
                            teclado = leia.nextLine();

                            if(teclado.matches(".*\\d.*")) {
                                deposito = Float.parseFloat(teclado);
                                if (deposito < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("       [ERRO] Não é possível creditar um valor negativo!      ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else {
                                    saldoCC += deposito;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.printf("Saldo atual na Conta Corrente [%d] -> %.2f\n", contaCorrente, saldoCC);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                }
                            } else {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                  [ERRO] Formato inválido!                    ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            }
                        }
                    } else {
                        while (true) {
                            System.out.print("Qual o valor a creditar na sua Conta Poupança [" + contaPoupanca + "]?  -> ");
                            teclado = leia.nextLine();

                            if(teclado.matches(".*\\d.*")) {
                                deposito = Float.parseFloat(teclado);
                                if (deposito < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("       [ERRO] Não é possível creditar um valor negativo!      ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else {
                                    saldoCP += deposito;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.printf("Saldo atual na Conta Poupança [%d] -> %.2f\n", contaPoupanca, saldoCP);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                }
                            } else {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                  [ERRO] Formato inválido!                    ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            }
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("                  QUAL CONTA DESEJA DEBITAR?                  ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupança");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma opção: ");
                        teclado = leia.nextLine();

                        if(teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if (opcao < 1 || opcao > 2) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("               [ERRO] Digite uma opção válida!                ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                  [ERRO] Formato inválido!                    ");
                            System.out.println("--------------------------------------------------------------");
                            Thread.sleep(1000);
                        }
                    }

                    if (opcao == 1) {
                        while(true) {
                            System.out.print("Qual o valor a debitar na Conta Corrente [" + contaCorrente + "]? -> ");
                            teclado = leia.nextLine();

                            if(teclado.matches(".*\\d.*")) {
                                debito = Float.parseFloat(teclado);
                                if (debito < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("       [ERRO] Não é possível debitar um valor negativo!       ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else {
                                    saldoCC -= debito;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Saldo atual na Conta Corrente [" + contaCorrente + "] -> " + saldoCC);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                }
                            } else {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                  [ERRO] Formato inválido!                    ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            }
                        }
                    } else {
                        while (true) {
                            System.out.print("Qual o valor a debitar na Conta Poupança [" + contaPoupanca + "]? -> ");
                            teclado = leia.nextLine();

                            if(teclado.matches(".*\\d.*")) {
                                debito = Float.parseFloat(teclado);
                                if(debito < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("       [ERRO] Não é possível debitar um valor negativo!       ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else if (saldoCP - debito < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Sua Conta Poupança não pode ficar negativa!                   ");
                                    System.out.println("Seu saldo atual é: " + saldoCP + " Tente novamente.           ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else if (saldoCP == 0 && debito > 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Seu saldo é: " + saldoCP + ". Não é possível realizar débito! ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else {
                                    saldoCP -= debito;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Saldo atual na Conta Poupança [" + contaPoupanca + "] -> " + saldoCP);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                }
                            } else {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                  [ERRO] Formato inválido!                    ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            }
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("                      ESCOLHA UMA OPÇÃO                       ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("1 - Conta Corrente para Conta Poupança");
                        System.out.println("2 - Conta Poupança para Conta Corrente");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma opção: ");
                        teclado = leia.nextLine();

                        if(teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if(opcao < 1 || opcao > 2) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("               [ERRO] Digite uma opção válida!                ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                  [ERRO] Formato inválido!                    ");
                            System.out.println("--------------------------------------------------------------");
                            Thread.sleep(1000);
                        }
                    }

                    if(opcao == 1) {
                        while (true) {
                            System.out.print("Qual valor deseja transferir para a Conta Poupança? ");
                            teclado = leia.nextLine();

                            if (teclado.matches(".*\\d.*")) {
                                transferencia = Float.parseFloat(teclado);
                                if (transferencia < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("      [ERRO] Não é possível transferir um valor negativo!     ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else if (saldoCC - transferencia < 0) {
                                    saldoCC -= transferencia;
                                    saldoCP += transferencia;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Valor transferido com sucesso!");
                                    System.out.println("Conta Corrente " + contaCorrente + " está com um saldo negativo de " + saldoCC);
                                    System.out.println("Saldo atual na Conta Poupança " + contaPoupanca + " -> " + saldoCP);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                } else {
                                    saldoCC -= transferencia;
                                    saldoCP += transferencia;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Valor transferido com sucesso!");
                                    System.out.println("Saldo atual na Conta Corrente " + contaCorrente + " -> " + saldoCC);
                                    System.out.println("Saldo atual na Conta Corrente " + contaPoupanca + " -> " + saldoCP);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                }
                            } else {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                  [ERRO] Formato inválido!                    ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            }
                        }
                    } else {
                        while (true) {
                            System.out.print("Qual valor deseja transferir para a Conta Corrente? ");
                            teclado = leia.nextLine();

                            if(teclado.matches(".*\\d.*")) {
                                transferencia = Float.parseFloat(teclado);
                                if (transferencia < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("      [ERRO] Não é possível transferir um valor negativo!     ");
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else if (saldoCP - transferencia < 0) {
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Sua Conta Poupança não pode ficar negativa");
                                    System.out.println("Seu saldo atual é " + saldoCP);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                } else {
                                    saldoCP -= transferencia;
                                    saldoCC += transferencia;
                                    System.out.println("--------------------------------------------------------------");
                                    System.out.println("Valor transferido com sucesso!");
                                    System.out.println("Saldo atual na Conta Corrente " + contaCorrente + " -> " + saldoCC);
                                    System.out.println("Saldo atual na Conta Corrente " + contaPoupanca + " -> " + saldoCP);
                                    System.out.println("--------------------------------------------------------------");
                                    Thread.sleep(1000);
                                    break;
                                }
                            } else {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                  [ERRO] Formato inválido!                    ");
                                System.out.println("--------------------------------------------------------------");
                                Thread.sleep(1000);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nSr(a). " + nome + " o saldo da suas contas é:");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("             SALDO CONTA CORRENTE E CONTA POUPANÇA            ");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Saldo atual na Conta Corrente " + contaCorrente + " -> " + saldoCC);
                    System.out.println("Saldo atual na Conta Poupança " + contaPoupanca + " -> " + saldoCP);
                    System.out.println("--------------------------------------------------------------");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("                [ERRO] Digite uma opção válida!               ");
                    System.out.println("--------------------------------------------------------------");
                    Thread.sleep(1000);
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("          Obrigado por trabalhar com o nosso banco!!!         ");
        System.out.println("--------------------------------------------------------------");
    }
}
