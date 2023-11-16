package homework;

public class HashMap {
    public static final int CAPACITY = 16;
    private Entry[] table;
    private int size;

    public HashMap() {

        table = new Entry[CAPACITY];
    }

    public int size() {
        return size;
    }

    public void clear() {
        table = new Entry[CAPACITY];
        size = 0;
    }

    public void put(Object key, Object value) {
        Entry entry = new Entry(key, value);
        int hashKey = key.hashCode();
        int index = hashKey % CAPACITY;
        table[index] = entry;
        size++;
    }

    public Object get(Object key) {
        int hashKey = key.hashCode();
        int index = hashKey % CAPACITY;
        Entry entry = table[index];
        return entry.getValue();
    }
    public void remove (Object key) {
        int hashKey = key.hashCode();
        int index = hashKey % CAPACITY;
        table[index] = null;
    }
}

class Entry {
    private Object key;
    private Object value;

    public Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

