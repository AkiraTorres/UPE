public class MinhaThreadSubtracao extends Thread {

    public void run() {
        System.out.println("INICIO THREAD S");

        int diferenca = 200;
        try {
            for (int i = 0; i < 200; i++) {
                Thread.sleep(1000);
                System.out.println("Sub - " + i);
                diferenca = diferenca - i;
            }
                
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("FIM THREAD S - " + diferenca);

    }

}