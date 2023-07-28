public class Main {
    public static void main(String[] args) {
        String password = "5555555555";
        long start = System.currentTimeMillis();

        BreakPassword breaker1 = new BreakPassword("0000000000", "9999999999", password);

        breaker1.start();
        try {
            breaker1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Tempo de execução: " + timeElapsed);
    }
}