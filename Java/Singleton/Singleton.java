package Java.Singleton;

/**
 * Classe que representa um caso de usabilidade do Pattern Singleton.
 */
public class Singleton {
    // selfClass é um atributo responsável por guardar a própria instância.
    private static Singleton selfClass;

    // Um construtor privado para ninguém poder instanciar essa classe diretamente
    // (new).
    private Singleton() {}

    /**
     * Retorna a instância dessa classe, se não existir, criará pela primeira vez e
     * será armazenada em selfClass.
     * 
     * @return retorna a instância da própria classe.
     */
    public static Singleton getInstance() {
        if (selfClass == null)
            selfClass = new Singleton();
        return selfClass;
    }
}