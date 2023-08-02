import java.util.concurrent.ThreadLocalRandom;

public class Philosopher extends Thread {
    private final String name;
    private final Fork leftFork, rightFork;
    private final int velocity;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        velocity = ThreadLocalRandom.current().nextInt(1000, 3001);
    }

    public void eat(Fork left, Fork right) throws InterruptedException {
        left.pickUp(this);
        right.pickUp(this);
        sleep(velocity * 3);
        System.out.print("O filósofo " + name + " terminou de comer usando os garfos ");
        System.out.println(left.getName() + " e " + right.getName());
        left.down();
        right.down();
    }

    public void run() {
        try {
            sleep(velocity);
            eat(leftFork, rightFork);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
