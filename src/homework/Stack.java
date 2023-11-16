package homework;

public class Stack {
    private Node head;
    private Node tail;
    private int size;

    public void push(Object value) {
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

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.getNext();
        }
        size--;
        if (result.getPrev() != null) {
            result.getPrev().setNext(result.getNext());
        } else {
            head = result.getNext();
        }
        if (result.getNext() != null) {
            result.getNext().setPrev(result.getPrev());
        } else {
            tail = result.getPrev();
        }
    }
    public Object peek () {
        return tail.getValue();
    }
    public Object pop () {
        Object value = tail.getValue();
        tail= tail.getPrev();
        return value;
    }
}
