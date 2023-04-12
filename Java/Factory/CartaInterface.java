package Java.Factory;

/**
 * Interface que representa qualquer tipo de carta.
 */
public interface CartaInterface {
    /*
     * Retorna a pontuação da carta.
     */
    public abstract int getPontuacao();

    /*
     * Inseri uma nova pontuação na carta.
     */
    public abstract void setPontuacao(int _pontuacaoCarta);

    /*
     * Retorna em String o tipo da carta que está sendo utilizada.
     */
    public abstract String getTipoCarta();

    /*
     * Retorna a altura da carta.
     */
    public abstract float getAlturaCarta();
    
    /*
     * Inseri uma nova altura para a carta.
     */
    public abstract void setAlturaCarta(float _alturaCarta);

    // Entre outros métodos abstratos.
}
