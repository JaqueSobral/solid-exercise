package src.exercicio1;

public class GerarRelatorioFinanceiro {

    public static void main(String[] args) {
        GerarRelatorio mensageiro = new GerarRelatorio();
        EnviarPorEmail caixaDeEntrada = new EnviarPorEmail();
        mensageiro.gerarRelatorio();
        caixaDeEntrada.enviarPorEmail();
    }
}