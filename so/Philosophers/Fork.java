public class Fork {
    private final String name;
    private Philosopher currentOwner = null;
    private final static Object monitor = new Object();

    public Fork(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void pickUp(Philosopher newOwner) throws InterruptedException {
        if (currentOwner != null) {
            // System.out.println("Porra");
            synchronized(monitor) {
                monitor.wait();
            }
        }
        currentOwner = newOwner;
    }

    public void down() {
        currentOwner = null;
        synchronized(monitor) {
            monitor.notifyAll();
        }
    }
}
