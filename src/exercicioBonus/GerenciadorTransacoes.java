package src.exercicioBonus;

public class GerenciadorTransacoes {
        private final Notificacao notificacao;

        public GerenciadorTransacoes(Notificacao notificacao) {
            this.notificacao = notificacao;
        }

        public void realizarTransacao(Conta conta, double valor, boolean isDeposito) {
            if (isDeposito) {
                conta.depositar(valor);
            } else {
                conta.sacar(valor);
            }
            notificacao.enviar("Transação realizada. Saldo atual: " + conta.getSaldo());
        }
}