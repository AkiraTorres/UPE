import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fork> forks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            forks.add(new Fork("F" + (i + 1)));
        }

        new Philosopher("Aristóteles", forks.get(0), forks.get(1)).start();
        new Philosopher("Platão", forks.get(1), forks.get(2)).start();
        new Philosopher("Santo Agostinho", forks.get(2), forks.get(3)).start();
        new Philosopher("Sócrates", forks.get(3), forks.get(4)).start();
        new Philosopher("Maquiavel", forks.get(4), forks.get(0)).start();

    }
}