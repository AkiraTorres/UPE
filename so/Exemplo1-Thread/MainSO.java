public class MainSO {
    
    public static void main(String[] args) {
        System.out.println("INICIO MAIN");

        new MinhaThread().start();
        new MinhaThreadSubtracao().start();

        System.out.println("FIM MAIN");
    }
}
