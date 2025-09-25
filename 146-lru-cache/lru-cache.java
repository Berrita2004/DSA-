class LRUCache {
    //DLL and hashMap to be used
    class Node {
        int key ; int val ; 
        Node prev ; Node next;
        Node(int key , int val){
            this.key= key;
            this.val = val;
        }
    }
    HashMap <Integer,Node> mpp ;
    int capacity;
    //dummies to be used
    Node head ; 
    Node tail; 

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mpp = new HashMap <>();
        head = new Node(-1, -1);
        tail = new Node (-1, -1);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if ( !mpp.containsKey(key)) return -1;
        //map se node lane ke liye
        Node node = mpp.get(key);
        //udao isko position se
        deleteNode (node);
        //aage add karo 
        insertAfterHead(node);
        //value toh return karo 
        return node.val;
    }
    
    public void put(int key, int value) {

        if ( mpp.containsKey(key)){
            Node existingNode = mpp.get(key);
            existingNode.val = value;
            deleteNode (existingNode);
            insertAfterHead(existingNode);
        }
        else {
            if (mpp.size() == capacity){
                Node lru = tail.prev;
                deleteNode(lru);
                mpp.remove(lru.key);
            }
            Node newNode = new Node(key,value);
            insertAfterHead(newNode);
            mpp.put(key,newNode);
        }
    }
    private void deleteNode (Node node){
        node.prev.next = node.next;
        node.next.prev= node.prev;
    }
    private void insertAfterHead(Node node){
        node.next = head.next ;
        node.prev = head;

        head.next.prev = node;
        head.next = node;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */