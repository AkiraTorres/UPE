public class MinhaThread extends Thread {
    
    public void run() {
        int soma = 0;
        try {
            System.out.println("INICIO THREAD");
            for (int i = 0; i < 100; i++) {
                Thread.sleep(1000);
                System.out.println("Add - " + i);
                soma = soma + i;
            }
    
        } catch(Exception e) {
            e.printStackTrace();    
        }


        System.out.println("FIM THREAD - " + soma);
    }
}
