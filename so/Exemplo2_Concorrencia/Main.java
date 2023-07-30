
public class Main {
    public static void main(String[] args) {
        Buffer dados = new Buffer();

        new Produtor(dados).start();
        new Consumidor(dados).start();

    }
    
}
