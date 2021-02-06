package practice.java.multithreading.producerconsumer;

import practice.java.multithreading.deadlock.Resource;

public class WaitingThreadImpl implements Runnable {

    private String name;
    private Resource resource;

    public WaitingThreadImpl(String name, Resource resource) {
        this.name = name;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(){
        resource.notify();
        System.out.println("Thread: "+name+" called notify for resource");
        try {
            System.out.println("Thread: "+ name +" Before wait on resource");
            resource.wait();
            System.out.println("Thread: "+ name +" After wait on resource");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
