package practice.java.multithreading.producerconsumer;

public class Main {

    public static void main(String[] args) {
        ResourceQueue queue = new ResourceQueue(10);
        Thread t1 = new Thread(new Producer("p1", queue));
        Thread t2 = new Thread(new Consumer("c1", queue));

        // for (int i = 0; i < 10; i++) {
        t1.start();
        t2.start();
        //  }

        System.out.println("over");
    }
}
