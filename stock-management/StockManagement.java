import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float estoqueP, estoqueJ, entrada, saida, transferencia;
        String teclado;
        int opcao;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                     CONTROLE DE ESTOQUE                      ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        while (true) {
            System.out.print("Estoque inicial de açúcar empresa 1: JATIBOCA(KG): ");
            teclado = leia.nextLine();
            if(teclado.matches(".*\\d.*")) {
                estoqueJ = Float.parseFloat(teclado);
                if(estoqueJ < 0) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("            [ERRO] O estoque não pode ser negativo!           ");
                    System.out.println("--------------------------------------------------------------");
                } else {
                    break;
                }
            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("                [ERRO] Informe um valor válido!               ");
                System.out.println("--------------------------------------------------------------");
            }
        }

        while (true) {
            System.out.print("Estoque inicial de açúcar empresa 2: PONTAL(KG): ");
            teclado = leia.nextLine();
            if(teclado.matches(".*\\d.*")) {
                estoqueP = Float.parseFloat(teclado);
                if(estoqueP < 0) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("            [ERRO] O estoque não pode ser negativo!           ");
                    System.out.println("--------------------------------------------------------------");
                } else {
                    break;
                }
            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("                [ERRO] Informe um valor válido!               ");
                System.out.println("--------------------------------------------------------------");
            }
        }

        while (true) {
            while (true) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("                      O QUE DESEJA FAZER?                     ");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("    1 \t\t------------>\t\t Entrada de estoque");
                System.out.println("    2 \t\t------------>\t\t Saída de estoque");
                System.out.println("    3 \t\t------------>\t\t Transferência de estoque");
                System.out.println("    4 \t\t------------>\t\t Consulta de Estoque");
                System.out.println("    5 \t\t------------>\t\t Finalizar");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.print("Escolha uma opção: ");
                teclado = leia.nextLine();
                if(teclado.matches(".*\\d.*")) {
                    opcao = Integer.parseInt(teclado);
                    if(opcao < 1 || opcao > 5) {
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("                [ERRO] Digite uma opção válida!               ");
                        System.out.println("--------------------------------------------------------------");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("                [ERRO] Informe um valor válido!               ");
                    System.out.println("--------------------------------------------------------------");
                }
            }

            if(opcao == 5) break;

            switch (opcao) {
                case 1:
                    while (true) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("               EM QUAL EMPRESA DESEJA REALIZAR?               ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("1 - Empresa 1 - JATIBOCA");
                        System.out.println("2 - Empresa 2 - PONTAL");
                        System.out.println("3 - Cancelar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma opção: ");
                        teclado = leia.nextLine();

                        if(teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if(opcao < 1 || opcao > 3) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                [ERRO] Digite uma opção válida!               ");
                                System.out.println("--------------------------------------------------------------");
                            } else {
                                if(opcao == 3) {
                                    break;
                                } else {
                                    if(opcao == 1) {
                                        while (true) {
                                            System.out.print("Quantidade de Entrada de açúcar em JATIBOCA (KG): ");
                                            teclado = leia.nextLine();
                                            if(teclado.matches(".*\\d.*")) {
                                                entrada = Float.parseFloat(teclado);
                                                if(entrada < 0) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("      [ERRO] A entrada de estoque não pode ser negativa!      ");
                                                    System.out.println("--------------------------------------------------------------");
                                                } else {
                                                    estoqueJ += entrada;
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.printf("Estoque atual em JATIBOCA: %.3f Kg\n", estoqueJ);
                                                    System.out.println("--------------------------------------------------------------");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("--------------------------------------------------------------");
                                                System.out.println("                [ERRO] Informe um valor válido!               ");
                                                System.out.println("--------------------------------------------------------------");
                                            }
                                        }
                                        break;
                                    } else {
                                        while (true) {
                                            System.out.print("Quantidade de Entrada de açúcar em PONTAL (KG): ");
                                            teclado = leia.nextLine();
                                            if(teclado.matches(".*\\d.*")) {
                                                entrada = Float.parseFloat(teclado);
                                                if(entrada < 0) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("      [ERRO] A entrada de estoque não pode ser negativa!      ");
                                                    System.out.println("--------------------------------------------------------------");
                                                } else {
                                                    estoqueP += entrada;
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.printf("Estoque atual em PONTAL: %.3f Kg\n", estoqueP);
                                                    System.out.println("--------------------------------------------------------------");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("--------------------------------------------------------------");
                                                System.out.println("                [ERRO] Informe um valor válido!               ");
                                                System.out.println("--------------------------------------------------------------");
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                [ERRO] Informe um valor válido!               ");
                            System.out.println("--------------------------------------------------------------");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("               EM QUAL EMPRESA DESEJA REALIZAR?               ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("1 - Empresa 1 - JATIBOCA");
                        System.out.println("2 - Empresa 2 - PONTAL");
                        System.out.println("3 - Cancelar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma opção: ");
                        teclado = leia.nextLine();

                        if(teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if(opcao < 1 || opcao > 3) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                [ERRO] Digite uma opção válida!               ");
                                System.out.println("--------------------------------------------------------------");
                            } else {
                                if(opcao == 3) {
                                    break;
                                } else {
                                    if(opcao == 1) {
                                        while (true) {
                                            System.out.print("Quantidade de saída de açúcar em JATIBOCA (KG): ");
                                            teclado = leia.nextLine();
                                            if(teclado.matches(".*\\d.*")) {
                                                saida = Float.parseFloat(teclado);
                                                if(saida < 0) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("       [ERRO] A saída de estoque não pode ser negativa!       ");
                                                    System.out.println("--------------------------------------------------------------");
                                                } else {
                                                    estoqueJ -= saida;
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.printf("Estoque atual em JATIBOCA: %.3f Kg\n", estoqueJ);
                                                    System.out.println("--------------------------------------------------------------");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("--------------------------------------------------------------");
                                                System.out.println("                [ERRO] Informe um valor válido!               ");
                                                System.out.println("--------------------------------------------------------------");
                                            }
                                        }
                                        break;
                                    } else {
                                        while (true) {
                                            System.out.print("Quantidade de saída de açúcar em PONTAL (KG): ");
                                            teclado = leia.nextLine();
                                            if(teclado.matches(".*\\d.*")) {
                                                saida = Float.parseFloat(teclado);
                                                if(saida < 0) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("       [ERRO] A saída de estoque não pode ser negativa!       ");
                                                    System.out.println("--------------------------------------------------------------");
                                                } else {
                                                    estoqueP -= saida;
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.printf("Estoque atual em PONTAL: %.3f Kg\n", estoqueP);
                                                    System.out.println("--------------------------------------------------------------");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("--------------------------------------------------------------");
                                                System.out.println("                [ERRO] Informe um valor válido!               ");
                                                System.out.println("--------------------------------------------------------------");
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                [ERRO] Informe um valor válido!               ");
                            System.out.println("--------------------------------------------------------------");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("              PARA QUAL EMPRESA DESEJA TRANSFERIR?            ");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.println("1 - De JATIBOCA para PONTAL");
                        System.out.println("2 - De PONTAL para JATIBOCA");
                        System.out.println("3 - Cancelar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                        System.out.print("Escolha uma opção: ");
                        teclado = leia.nextLine();

                        if(teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if(opcao < 1 || opcao > 3) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("                [ERRO] Digite uma opção válida!               ");
                                System.out.println("--------------------------------------------------------------");
                            } else {
                                if(opcao == 3) {
                                    break;
                                } else {
                                    if(opcao == 1) {
                                        while (true) {
                                            System.out.print("Quantidade de açúcar JATIBOCA -> PONTAL (KG): ");
                                            teclado = leia.nextLine();
                                            if(teclado.matches(".*\\d.*")) {
                                                transferencia = Float.parseFloat(teclado);
                                                if(transferencia < 0) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("        [ERRO] A transferência não pode ser negativa!         ");
                                                    System.out.println("--------------------------------------------------------------");
                                                } else if(transferencia > estoqueJ) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("Impossível transferir, estoque insuficiente!                  ");
                                                    System.out.printf("Estoque atual em JATIBOCA: %.3f Kg\n", estoqueJ);
                                                    System.out.println("--------------------------------------------------------------");
                                                } else {
                                                    estoqueJ -= transferencia;
                                                    estoqueP += transferencia;
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("Transferência realizada com sucesso!                          ");
                                                    System.out.printf("Estoque atual em JATIBOCA: %.3f Kg\n", estoqueJ);
                                                    System.out.printf("Estoque atual em PONTAL: %.3f Kg\n", estoqueP);
                                                    System.out.println("--------------------------------------------------------------");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("--------------------------------------------------------------");
                                                System.out.println("                [ERRO] Informe um valor válido!               ");
                                                System.out.println("--------------------------------------------------------------");
                                            }
                                        }
                                        break;
                                    } else {
                                        while (true) {
                                            System.out.print("Quantidade de açúcar PONTAL -> JATIBOCA (KG): ");
                                            teclado = leia.nextLine();
                                            if(teclado.matches(".*\\d.*")) {
                                                transferencia = Float.parseFloat(teclado);
                                                if(transferencia < 0) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("        [ERRO] A transferência não pode ser negativa!         ");
                                                    System.out.println("--------------------------------------------------------------");
                                                } else if(transferencia > estoqueP) {
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("Impossível transferir, estoque insuficiente!                  ");
                                                    System.out.printf("Estoque atual em PONTAL: %.3f Kg\n", estoqueP);
                                                    System.out.println("--------------------------------------------------------------");
                                                } else {
                                                    estoqueP -= transferencia;
                                                    estoqueJ += transferencia;
                                                    System.out.println("--------------------------------------------------------------");
                                                    System.out.println("Transferência realizada com sucesso!                          ");
                                                    System.out.printf("Estoque atual em JATIBOCA: %.3f Kg\n", estoqueJ);
                                                    System.out.printf("Estoque atual em PONTAL: %.3f Kg\n", estoqueP);
                                                    System.out.println("--------------------------------------------------------------");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("--------------------------------------------------------------");
                                                System.out.println("                [ERRO] Informe um valor válido!               ");
                                                System.out.println("--------------------------------------------------------------");
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                [ERRO] Informe um valor válido!               ");
                            System.out.println("--------------------------------------------------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("                QUANTIDADE DE AÇÚCAR EM ESTOQUE               ");
                    System.out.println("--------------------------------------------------------------");
                    System.out.printf("Estoque atual em JATIBOCA: %.3f Kg\n", estoqueJ);
                    System.out.printf("Estoque atual em PONTAL: %.3f Kg\n", estoqueP);
                    System.out.println("--------------------------------------------------------------");

                    while (true) {
                        System.out.print("Digite 3 para voltar ao Menu Principal: ");
                        teclado = leia.nextLine();
                        if (teclado.matches(".*\\d.*")) {
                            opcao = Integer.parseInt(teclado);
                            if (opcao != 3) {
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("               [ERRO] Digite uma opção válida!                ");
                                System.out.println("--------------------------------------------------------------");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("--------------------------------------------------------------");
                            System.out.println("                [ERRO] Informe um valor válido!               ");
                            System.out.println("--------------------------------------------------------------");
                        }
                    }
                    break;
                default:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("                [ERRO] Digite uma opção válida!               ");
                    System.out.println("--------------------------------------------------------------");
            }

        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("                        Volte Sempre!!!                       ");
        System.out.println("--------------------------------------------------------------");
    }
}
