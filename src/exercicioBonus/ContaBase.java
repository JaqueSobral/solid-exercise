package src.exercicioBonus;

public abstract class ContaBase implements Conta{
        protected double saldo;

        @Override
        public void depositar(double valor) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: " + saldo);
        }

        @Override
        public void sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado. Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}