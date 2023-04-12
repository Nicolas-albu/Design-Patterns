package Java.AbstractFactory;

import Java.AbstractFactory.interfaces.Canal;
import Java.AbstractFactory.interfaces.Porta;

import Java.AbstractFactory.src.CanalTCP;
import Java.AbstractFactory.src.PortaTCP;

/**
 * Classe concreta de ProtocoloFactory do tipo TCP, responsável por criar os
 * canais e portas desse tipo.
 */
public class TCPProtocoloFactory extends ProtocoloFactory {
    /**
     * Cria uma nova fábrica de protocolos do tipo TCP.
     */
    public TCPProtocoloFactory() {}

    @Override
    public Canal criaCanal() {
        return new CanalTCP();
    }

    @Override
    public Porta criaPorta() {
        return new PortaTCP();
    }
}
