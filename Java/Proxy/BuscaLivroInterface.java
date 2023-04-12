package Java.Proxy;

/**
 * Interface que representa um buscador de livros.
 */
public interface BuscaLivroInterface {
    
    /**
     * @param codigoISBN é o código ISBN do livro.
     * @return retorna o livro encontrado pelo codigo ISBN.
     */
    public abstract Livro getLivro(int codigoISBN);
}
