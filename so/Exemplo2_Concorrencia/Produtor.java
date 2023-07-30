import java.util.Random;

public class Produtor extends Thread {
    Buffer dados;
    public Produtor(Buffer param) {
        dados = param;
    }  

    public void run() {
        try {
            
            Random r = new Random();

            while(true) {
                sleep(2000);
                int value = r.nextInt(1000);
                System.out.println("[Produtor] - " + value);
                dados.inserir(value);


                //aqui vai guardar os dados em algum lugar
                

            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    
}
