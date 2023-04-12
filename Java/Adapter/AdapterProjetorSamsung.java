package Java.Adapter;

import Java.Adapter.src.ProjetorSamsung;

/**
 * Classe concreta de ProjetorInterface responsável por adaptar a classe ProjetorSamsung.
 */
public class AdapterProjetorSamsung implements ProjetorInterface {
    private ProjetorSamsung projetorSamsung;

    /**
     * Cria um novo adaptador de projetorSamsung.
     * @param _projetorSamsung é a instância de projetorSamsung.
     */
    public AdapterProjetorSamsung(ProjetorSamsung _projetorSamsung) {
        this.projetorSamsung = _projetorSamsung;
    }

    @Override
    public void ligar() {
        this.projetorSamsung.enable();
    }
}
