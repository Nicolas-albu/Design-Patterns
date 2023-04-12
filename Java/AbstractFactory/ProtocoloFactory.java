package Java.AbstractFactory;

import Java.AbstractFactory.interfaces.Canal;
import Java.AbstractFactory.interfaces.Porta;

/**
 * Classe abstrata que representa a forma de como deve ser uma fábrica de
 * protocolos.
 */
public abstract class ProtocoloFactory {

    /**
     * Cria um canal do tipo referente ao tipo da fábrica.
     * @return retorna o canal criado.
     */
    public abstract Canal criaCanal();

    /**
     * Cria uma porta do tipo referente ao tipo da fábrica.
     * @return retorna a porta criada.
     */
    public abstract Porta criaPorta();
}
