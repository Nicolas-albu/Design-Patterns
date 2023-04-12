package Java.Adapter.src;

/**
 * Classe que representa um projetor da marca LG.
 */
public class ProjetorLG {
    /**
     * Cria um novo projetor da LG.
     */
    public ProjetorLG() {}

    /**
     * Liga o projetor da LG.
     * @param tempoLigar é a quantidade de tempo para ligar o projetor da LG.
     */
    public void turnOn(int tempoLigar) {
        System.out.println("Projetor LG ativado.");
    }
}
