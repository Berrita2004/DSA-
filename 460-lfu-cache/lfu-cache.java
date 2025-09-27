import java.util.*;

class LFUCache {

    class Node {
        int key, val, freq;
        Node prev, next;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.freq = 1;
        }
    }

    class DoublyLinkedList {
        Node head, tail;
        int size;
        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        void addFirst(Node node) {
            node.next = head.next;  
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }
        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }
        Node removeLast() {
            if (size > 0) {
                Node last = tail.prev;
                remove(last);
                return last;
            }
            return null;
        }
    }

    private final int capacity;
    private int minFreq;
    private Map<Integer, Node> keyToNode;
    private Map<Integer, DoublyLinkedList> freqToList;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyToNode = new HashMap<>();
        this.freqToList = new HashMap<>();
    }

    public int get(int key) {
        if (!keyToNode.containsKey(key)) return -1;
        Node node = keyToNode.get(key);
        updateFreq(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            node.val = value;
            updateFreq(node);
        } else {
            if (keyToNode.size() >= capacity) {
                DoublyLinkedList minList = freqToList.get(minFreq);
                Node toRemove = minList.removeLast();
                keyToNode.remove(toRemove.key);
            }
            Node newNode = new Node(key, value);
            keyToNode.put(key, newNode);
            minFreq = 1;
            freqToList.computeIfAbsent(1, k -> new DoublyLinkedList()).addFirst(newNode);
        }
    }

    private void updateFreq(Node node) {
        int oldFreq = node.freq;
        DoublyLinkedList oldList = freqToList.get(oldFreq);
        oldList.remove(node);
        if (oldFreq == minFreq && oldList.size == 0) minFreq++;
        node.freq++;
        freqToList.computeIfAbsent(node.freq, k -> new DoublyLinkedList()).addFirst(node);
    }
}
