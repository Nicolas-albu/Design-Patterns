package Java.Proxy;

public class Main {
    public static void main(String[] args) {
        BuscaLivroInterface buscadorDeLivros = new BuscaLivro();
        BuscaLivroProxy proxy = new BuscaLivroProxy(buscadorDeLivros);
        
        proxy.isAutenticador("Ola");
        System.out.println("Tentativa de buscar o livro (sem autorização): " + proxy.getLivro(1232));

        proxy.isAutenticador("asadaKdfejnj");
        System.out.println("Tentativa de buscar o livro (sem autorização): " + proxy.getLivro(1232));
    }
}
