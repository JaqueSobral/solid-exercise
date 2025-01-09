package src.exercicioBonus;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail sobre sua conta: " + mensagem);
    }
}