package Java.Proxy;

/**
 * Enumerate para guardar a constante de um código de autorização, apenas para
 * estudo do Pattern Proxy.
 */
public enum Constantes {
    CODIGO_DE_AUTORIZACAO("asadaKdfejnj");

    private final String codigo;

    /**
     * Cria um novo enumerate Constantes.
     * @param codigo
     */
    Constantes(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return retorna o código da constante.
     */
    public String getCodigo() {
        return this.codigo;
    }
}
