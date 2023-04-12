package Java.AbstractFactory;

import Java.AbstractFactory.interfaces.Canal;
import Java.AbstractFactory.interfaces.Porta;
import Java.AbstractFactory.src.CanalUDP;
import Java.AbstractFactory.src.PortaUDP;

/**
 * Classe concreta de ProtocoloFactory do tipo UDP, responsável por criar os
 * canais e portas desse tipo.
 */
public class UDPProtocoloFactory extends ProtocoloFactory {
    /**
     * Cria uma nova fábrica de protocolos do tipo UDP.
     */
    public UDPProtocoloFactory() {}

    @Override
    public Canal criaCanal() {
        return new CanalUDP();
    }

    @Override
    public Porta criaPorta() {
        return new PortaUDP();
    }
}
