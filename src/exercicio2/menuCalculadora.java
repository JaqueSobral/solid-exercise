package src.exercicio2;

import java.util.Scanner;

public class menuCalculadora {
public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            Calculadora calculadora = new Calculadora();
            boolean continuar = true;

            while (continuar) {
                System.out.println("=== Menu da Calculadora ===");
                System.out.println("1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Sair");
                System.out.print("Escolha uma operação: ");
                int escolha = leitor.nextInt();
                if (escolha == 4) {
                    continuar = false;
                    System.out.println("Encerrando a calculadora...");
                    break;
                }
                System.out.print("Digite o primeiro número: ");
                int a = leitor.nextInt();
                System.out.print("Digite o segundo número: ");
                int b = leitor.nextInt();

                switch (escolha) {
                    case 1:
                        Operacao adicao = new Adicao();
                        System.out.println("Resultado da Soma: " + calculadora.calculo(adicao, a, b));
                        break;
                    case 2:
                        Operacao subtracao = new Subtracao();
                        System.out.println("Resultado da Subtração: " + calculadora.calculo(subtracao, a, b));
                        break;
                    case 3:
                        Operacao multiplicacao = new Multiplicacao();
                        System.out.println("Resultado da Multiplicação: " + calculadora.calculo(multiplicacao,  a, b));
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                System.out.println();
            }
            leitor.close();
        }
    }