import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Class extends Thread {
    private final String className;
    private final ArrayList<Park> parks;
    private final int velocity;

    public Class(String name, ArrayList<Park> parks) {
        this.className = name;
        this.parks = parks;
        velocity = ThreadLocalRandom.current().nextInt(1000, 5001);
    }

    public String getClassName() {
        return className;
    }

    public int getVelocity() {
        return velocity;
    }

    public void run() {
        for (Park park : parks) {
            try {
                park.wander(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
