package Java.Factory;

public class Main {
    public static void main(String[] args) {
        CartaInterface carta1 = CartaFactory.criaCarta(1);
        CartaInterface carta2 = CartaFactory.criaCarta(2);
        CartaInterface carta3 = CartaFactory.criaCarta(0);

        System.out.println(String.format("Carta1: %s", carta1.getTipoCarta()));
        System.out.println(String.format("Carta2: %s", carta2.getTipoCarta()));
        System.out.println(String.format("Carta3: %s", carta3));
    }
}
