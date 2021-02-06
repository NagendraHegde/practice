package practice.java.multithreading.producerconsumer;

public class Consumer implements Runnable {

    private ResourceQueue queue;
    private String name;

    public Consumer(String name, ResourceQueue queue) {
        this.queue = queue;
        this.name = name;
    }


    @Override
    public void run() {
        int consumedVal = 0;
        while(consumedVal < 9) {
            if (queue.isEmpty()) {
                try {
                    System.out.println("consumer: " + name + " waiting");
                        synchronized (queue){
                        queue.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            consumedVal = queue.remove();
            System.out.println("Consumer: " + name + " consumed value: " + consumedVal);
            synchronized (queue){
                queue.notifyAll();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
