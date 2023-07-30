public class Consumidor extends Thread {

    Buffer dados;
    public Consumidor(Buffer param) {
        dados = param;
    }

    public void run() {
        try {
            
            while(true) {
                sleep(2100);
                int value = dados.pegarValor();

                System.out.println("[Consumidor] - " + value);

            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
