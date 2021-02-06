package practice.java.multithreading.deadlock;

import static java.lang.String.format;

public class Resource {

    private String name;

    public String getName() {
        return name;
    }

    public Resource(final String name) {
        this.name = name;
    }

    synchronized void acquire(final String acquirerName, final long acquireDuration, final Resource anotherResource) {
        try {
            System.out.println(format("resource %s acquired", name));
            System.out.println("acquirer thread: " + acquirerName);
            Thread.sleep(acquireDuration);
            if (anotherResource != null)
                anotherResource.acquire(acquirerName, acquireDuration, null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
