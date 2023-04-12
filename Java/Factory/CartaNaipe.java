package Java.Factory;

/*
 * Uma classe CartaNaipe que implementa a interface Carta para exemplo.
 */
public class CartaNaipe implements CartaInterface {
    private final String tipoCarta = "Carta Naipe";
    private int pontuacaoCarta;
    private float alturaCarta;

    /*
     * Cria uma nova carta naipe.
     */
    public CartaNaipe() {}

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
