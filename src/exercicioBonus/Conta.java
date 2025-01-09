package src.exercicioBonus;

public interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double calcularTaxa();
    double getSaldo();
}