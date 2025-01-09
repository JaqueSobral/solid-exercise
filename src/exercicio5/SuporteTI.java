package src.exercicio5;

public class SuporteTI {

        public static void main(String[] args) {

            DispositivoEntrada teclado = new Teclado();
            Computador computadorComTeclado = new Computador(teclado);
            computadorComTeclado.usarDispositivo();

            DispositivoEntrada mouse = new Mouse();
            Computador computadorComMouse = new Computador(mouse);
            computadorComMouse.usarDispositivo();
        }
}
