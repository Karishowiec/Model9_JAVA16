package homework;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public void add(Object value) {
        Node newNode = new Node(value);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
     public Object peek () {
        return head.getValue();
     }
     public Object poll () {
         Object value = head.getValue();
         head = head.getNext();
         return value;
     }
}
