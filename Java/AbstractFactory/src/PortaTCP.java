package Java.AbstractFactory.src;

import Java.AbstractFactory.interfaces.Porta;

/**
 * Classe concreta de Porta do tipo TCP, para caso de estudo.
 */
public class PortaTCP implements Porta {
    /**
     * Cria uma nova porta do tipo TCP.
     */
    public PortaTCP() {
        System.out.println("Criou a porta TCP");
    }    
}
