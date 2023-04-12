package Java.FactoryMethod;

/*
 * Classe responsável por representar a fábrica para criação das cartas.
 */
public class CartaFactory {
    /*
     * Retorna uma nova carta (normal ou naipe), sem que o código cliente saiba
     * exatamente qual é o tipo de carta.
     */
    public static CartaInterface criaCarta(int tipoCarta) {
        if (tipoCarta == 1)
            return new CartaNormal();
        else if (tipoCarta == 2)
            return new CartaNaipe();

        return null;
    }
}
