package practice.java.multithreading.producerconsumer;

public class Producer implements Runnable{

    private ResourceQueue queue;
    private String name;
    private int valueToBeInserted = 0;

    public Producer(String name, ResourceQueue queue) {
        this.queue = queue;
        this.name = name;
    }


    @Override
    public void run() {
        while(valueToBeInserted < 10) {
            if (queue.isFull()) {
                try {
                    System.out.println("producer: " + name + " waiting");
                    synchronized (queue){
                        queue.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Producer: " + name + " adding value: " + valueToBeInserted);
            queue.add(valueToBeInserted++);
            synchronized (queue){
                queue.notifyAll();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
