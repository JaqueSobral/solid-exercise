package src.exercicioBonus;
import java.util.Scanner;

public class MenuConta {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Conta contaCorrente = new ContaCorrente();
            Conta contaPoupanca = new ContaPoupanca();

            Notificacao notificacaoEmail = new NotificacaoEmail();
            Notificacao notificacaoSMS = new NotificacaoSMS();

            GerenciadorTransacoes gerenciadorEmail = new GerenciadorTransacoes(notificacaoEmail);
            GerenciadorTransacoes gerenciadorSMS = new GerenciadorTransacoes(notificacaoSMS);

            boolean continuar = true;

            while (continuar) {
                System.out.println("***** Sistema Bancário CATALISA *****");
                System.out.println("1-Acessar a Conta Corrente");
                System.out.println("2-Acessar a Conta Poupança");
                System.out.println("3-Fechar o sistema");
                System.out.print("Escolha a conta: ");
                int escolhaConta = scanner.nextInt();

                if (escolhaConta == 3) {
                    continuar = false;
                    System.out.println("Obrigado por usar nossos serviços.Precisando estamos a disposição!!");
                    break;
                }

                Conta contaSelecionada = null;
                if (escolhaConta == 1) {
                    contaSelecionada = contaCorrente;
                } else if (escolhaConta == 2) {
                    contaSelecionada = contaPoupanca;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }

                System.out.println("**** Ações Disponíveis para realizar ****");
                System.out.println("1-Depositar");
                System.out.println("2-Sacar");
                System.out.println("3-Consultar Saldo");
                System.out.println("4-Calcular Taxa");
                System.out.println("5-Voltar");
                System.out.print("Escolha a ação que deseja realizar: ");
                int escolhaAcao = scanner.nextInt();

                switch (escolhaAcao) {
                    case 1:
                        System.out.print("Digite o valor que deseja depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        gerenciadorEmail.realizarTransacao(contaSelecionada, valorDeposito, true);
                        break;

                    case 2:
                        System.out.print("Digite o valor que deseja sacar: ");
                        double valorSaque = scanner.nextDouble();
                        gerenciadorSMS.realizarTransacao(contaSelecionada, valorSaque, false);
                        break;

                    case 3:
                        System.out.println("Saldo atual: " + contaSelecionada.getSaldo());
                        break;

                    case 4:
                        System.out.println("Taxa da conta: " + contaSelecionada.calcularTaxa());
                        break;

                    case 5:
                        System.out.println("Voltando ao menu principal...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
                System.out.println();
            }
            scanner.close();
        }
}