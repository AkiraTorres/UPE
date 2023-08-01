import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Park> parks = new ArrayList<>();
        int t = 5;

        short symbol = 65;
        for (int i = 0; i < 5; i++) {
            parks.add(new Park("P" + Character.toString(symbol + i), t));
        }

        for (int i = 0; i < t; i++) {
            String name = "T" + (i + 1);
            new Class(name, parks).start();
        }
    }
}
