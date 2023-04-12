package Java.AbstractFactory;

/**
 * Classe reponsável por controlar/utilizar o tipo de protocolo passado.
 */
public class Diretor {
    // Atributo responsável por armazenar o tipo de fábrica de protocolos.
    private ProtocoloFactory factory;

    /**
     * Cria uma nova classe Diretor.
     * 
     * @param _factory fábrica de protocolos a ser utilizado no sistema.
     */
    public Diretor(ProtocoloFactory _factory) {
        this.factory = _factory;
    }

    /**
     * Cria os canais e portas do protocolo passado como parâmetro de Diretor.
     */
    public void criaProtocolo() {
        this.factory.criaCanal();
        this.factory.criaPorta();
    }
}
