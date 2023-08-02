public class Park {
    private final String name;
    private int counter = 0;
    private final int totalClasses;
    final static Object monitor = new Object();

    public Park(String name, int totalClasses) {
        this.name = name;
        this.totalClasses = totalClasses;
    }

    public void wander(Class t) throws InterruptedException {
        System.out.println(Utils.GREEN + "Turma [" + t.getClassName() + "] " + Utils.RESET + "entrou no parque " + name);
        Thread.sleep(t.getVelocity());
        System.out.println(Utils.GREEN + "Turma [" + t.getClassName() + "] " + Utils.RESET + "saiu do parque " + name);
        counter++;

        if (counter < totalClasses) {
            synchronized (monitor) {
                monitor.wait();
            }
        } else {
            System.out.println();
            counter = 0;
            synchronized (monitor) {
                monitor.notifyAll();
            }
        }
    }
}
