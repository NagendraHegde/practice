package practice.java.multithreading.deadlock;

public class Main {

    public static void main(String[] args) {
        Resource r1 = new Resource("r1");
        Resource r2 = new Resource("r2");

        Thread t1 = new Thread(new ThreadImpl("t1", r1, r2));
        Thread t2 = new Thread(new ThreadImpl("t2", r2, r1));

       // for (int i = 0; i < 10; i++) {
            t1.start();
            t2.start();
      //  }

        System.out.println("over");
    }
}
