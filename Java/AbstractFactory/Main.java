package Java.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Atributo responsável por guardar o tipo de fábrica de protocolos.
        ProtocoloFactory fabricaProtocolos = null;
        String tipoProtocolo = "TCP";

        // Cria uma fábrica de protocolos dependendo de um caso particular.
        if (tipoProtocolo.equalsIgnoreCase("TCP"))
            fabricaProtocolos = new TCPProtocoloFactory();
        else if (tipoProtocolo.equalsIgnoreCase("UDP"))
            fabricaProtocolos = new UDPProtocoloFactory();

        // Passa a fábrica de protocolos escolhida na condicional acima para Diretor.
        Diretor diretor = new Diretor(fabricaProtocolos);
        // Ativa a criação do protocolo (canal e porta) de Diretor.
        diretor.criaProtocolo();
    }
}
