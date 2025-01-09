package src.exercicioBonus;

public class ContaPoupanca extends ContaBase{

    @Override
    public double calcularTaxa() {
        return saldo * 0.03; // Taxa de 1% sobre o saldo
    }
}