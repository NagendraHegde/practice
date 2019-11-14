package practice.ds.linkedlist;

public class NodeRand {
    private int value;
    private NodeRand next;
    private NodeRand rand;

    NodeRand(final int value, final NodeRand next, final NodeRand rand){
        this.value = value;
        this.next = next;
        this.rand = rand;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeRand getNext() {
        return next;
    }

    public void setNext(NodeRand next) {
        this.next = next;
    }

    public NodeRand getRand() {
        return rand;
    }

    public void setRand(NodeRand rand) {
        this.rand = rand;
    }
}
