class LRUCache {
    Map<Integer, Node> cache;
    int cap;
    Node old;
    Node recent;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.cap = capacity;

        this.old = new Node(0,0);
        this.recent = new Node(0,0);
        this.old.next = this.recent;
        this.recent.prev = this.old;

    }
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            // make it recent entry
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node newNode = new Node(key, value);
        cache.put (key, newNode);
        insert(newNode);

        if (cache.size() > cap) {
            Node lru = this.old.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    public void insert(Node node) {
        Node prev = this.recent.prev;
        prev.next = node;
        node.next = this.recent;
        node.prev = prev;
        this.recent.prev = node;
    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }
}

class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}