package Java.AbstractFactory.src;

import Java.AbstractFactory.interfaces.Porta;

/**
 * Classe concreta de Porta do tipo UDP, para caso de estudo.
 */
public class PortaUDP implements Porta {
    /**
     * Cria uma nova porta do tipo UDP.
     */
    public PortaUDP() {
        System.out.println("Criou a porta UDP");
    }    
}
