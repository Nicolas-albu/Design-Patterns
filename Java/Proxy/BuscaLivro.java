package Java.Proxy;

/**
 * Classe concreta de BuscaLivroInterface.
 */
public class BuscaLivro implements BuscaLivroInterface {
    /**
     * Cria um novo buscador de livros.
     */
    public BuscaLivro() {}

    @Override
    public Livro getLivro(int codigoISBN) {
        // Implementa a lógica de pegar um livro por seu código ISBN.
        return new Livro();
    }
}
