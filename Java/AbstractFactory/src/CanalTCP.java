package Java.AbstractFactory.src;

import Java.AbstractFactory.interfaces.Canal;

/**
 * Classe concreta de Canal do tipo TCP, para caso de estudo.
 */
public class CanalTCP implements Canal {
    /**
     * Cria um novo canal do tipo TCP.
     */
    public CanalTCP() {
        System.out.println("Criou o canal TCP");
    }
}
