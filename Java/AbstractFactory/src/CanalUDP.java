package Java.AbstractFactory.src;

import Java.AbstractFactory.interfaces.Canal;

/**
 * Classe concreta de Canal do tipo UDP, para caso de estudo.
 */
public class CanalUDP implements Canal {
    /**
     * Cria um novo canal do tipo UDP.
     */
    public CanalUDP() {
        System.out.println("Criou o canal UDP");
    }
}
