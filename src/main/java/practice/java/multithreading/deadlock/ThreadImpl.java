package practice.java.multithreading.deadlock;

public class ThreadImpl implements Runnable {

    private String name;
    private Resource resource1;
    private Resource resource2;

    ThreadImpl(final String name, final Resource resource1, final Resource resource2) {
        this.name = name;
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        System.out.println("acquiring : " + resource1.getName());
        resource1.acquire(name, 10000, resource2);
        System.out.println(resource1.getName() + "released by " + name);
    }
}
