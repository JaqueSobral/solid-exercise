package src.exercicioBonus;

public class NotificacaoSMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS sobre sua conta:  " + mensagem);
    }
}