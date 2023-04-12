package Java.Proxy;

public class BuscaLivroProxy implements BuscaLivroInterface {
    private BuscaLivroInterface buscadorLivrosBase;
    private boolean autorizacao = false;

    public BuscaLivroProxy(BuscaLivroInterface buscadorLivros) {
        this.buscadorLivrosBase = buscadorLivros;
    }

    @Override
    public Livro getLivro(int codigoISBN) {
        return this.autorizacao ? this.buscadorLivrosBase.getLivro(codigoISBN) : null;
    }

    public void isAutenticador(String codigoPermissao) {
        this.autorizacao = !codigoPermissao.equals(
            Constantes.CODIGO_DE_AUTORIZACAO.getCodigo()) ? false : true;
    }

}
