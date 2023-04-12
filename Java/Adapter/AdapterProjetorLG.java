package Java.Adapter;

import Java.Adapter.src.ProjetorLG;

/**
 * Classe concreta de ProjetorInterface responsável por adaptar a classe ProjetorLG.
 */
public class AdapterProjetorLG implements ProjetorInterface {
    private ProjetorLG projetorLG;

    /**
     * Cria um novo adaptador para o projetor LG.
     * @param _projetorLG é a instância de projetorLG.
     */
    public AdapterProjetorLG(ProjetorLG _projetorLG) {
        this.projetorLG = _projetorLG;
    }

    @Override
    public void ligar() {
        this.projetorLG.turnOn(10);
    }
}
