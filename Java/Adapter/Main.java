package Java.Adapter;

import Java.Adapter.src.ProjetorLG;
import Java.Adapter.src.ProjetorSamsung;

public class Main {
    public static void main(String[] args) {
        AdapterProjetorLG projetorLG = new AdapterProjetorLG(new ProjetorLG());
        AdapterProjetorSamsung projetorSamsung = new AdapterProjetorSamsung(new ProjetorSamsung());

        projetorLG.ligar();
        projetorSamsung.ligar();
    }
} 