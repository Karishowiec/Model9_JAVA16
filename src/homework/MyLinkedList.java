package homework;

public class MyLinkedList {
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

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.getNext();
        }
        return result.getValue();
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

}



