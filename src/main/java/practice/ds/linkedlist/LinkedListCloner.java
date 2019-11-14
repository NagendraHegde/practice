package practice.ds.linkedlist;

public class LinkedListCloner {

    public static NodeRand cloneRandPointingList(final NodeRand start){

        NodeRand outIter = null;
        NodeRand node = start;
        while(node != null){
            NodeRand temp = new NodeRand(node.getValue(),node.getNext(),null);
            node.setNext(temp);
            node = temp.getNext();
        }

        NodeRand output = start.getNext();


        while(start.getNext() != null){
            outIter = start.getNext();
            start.getNext().setRand(start.getRand().getNext());
            start.setNext(start.getNext().getNext());
            outIter.setNext(outIter.getNext().getNext());
        }

        return output;

    }

}
