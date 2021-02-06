package practice.java.multithreading.producerconsumer;

import java.util.LinkedList;

public class ResourceQueue {
    LinkedList<Integer> queue = new LinkedList<>();
    int capacity;

    ResourceQueue(int capacity){
        this.capacity = capacity;
    }

    synchronized void add(int x){
        queue.addFirst(x);
    }

    synchronized int remove(){
       return queue.removeLast();
    }

    boolean isFull(){
        return queue.size() >= capacity;
    }

    boolean isEmpty(){
        return queue.isEmpty();
    }
}
