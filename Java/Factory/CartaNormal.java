package Java.Factory;

/*
 * Uma classe CartaNormal que implementa a interface Carta para exemplo.
 */
public class CartaNormal implements CartaInterface {
    private final String tipoCarta = "Carta Normal";
    private int pontuacaoCarta;
    private float alturaCarta;

    /*
     * Cria uma nova carta normal.
     */
    public CartaNormal() {}

    @Override
    public int getPontuacao() {
        return this.pontuacaoCarta;
    }

    @Override
    public void setPontuacao(int _pontuacaoCarta) {
        this.pontuacaoCarta = _pontuacaoCarta;
    }

    @Override
    public String getTipoCarta() {
        return this.tipoCarta;
    }

    @Override
    public float getAlturaCarta() {
        return this.alturaCarta;
    }

    @Override
    public void setAlturaCarta(float _alturaCarta) {
        this.alturaCarta = _alturaCarta;
    }

    // Entre outros métodos da própria CartaNormal.
}
