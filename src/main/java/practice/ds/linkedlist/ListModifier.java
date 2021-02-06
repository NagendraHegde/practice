package practice.ds.linkedlist;

public class ListModifier {

    public Node deleteNthNodeFromLast(Node list, int n) {

        if (list == null || list.getNext() == null) {
            return null;
        }

        Node ptr1 = list;
        Node ptr2 = list;
        int count = 1;

        while (ptr2 != null) {
            ptr1 = ptr1.getNext();
            if (ptr2.getNext() == null) {
                break;
            }
            count++;
            ptr2 = ptr2.getNext().getNext();
            if (ptr2 != null)
                count++;
        }


        return null;

    }

    public static int getListLength(Node list){
        if(list == null){
            return 0;
        }
        if(list.getNext() == null){
            return 1;
        }

        Node ptr1 = list;
        Node ptr2 = list;
        int count = 1;

        while (ptr2 != null) {
            ptr1 = ptr1.getNext();
            if (ptr2.getNext() == null) {
                break;
            }
            count++;
            ptr2 = ptr2.getNext().getNext();
            if (ptr2 != null)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Node list = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        System.out.println("list length: " + getListLength(list));
    }

}
