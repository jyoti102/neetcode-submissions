class MyCircularQueue {
    private List<Integer> q;
    private int cap;

    public MyCircularQueue(int k) {
        q = new ArrayList<>();
        cap = k;
    }
    
    public boolean enQueue(int value) {
        if (q.size() == cap) return false;

        q.add(value);
        return true;
    }
    
    public boolean deQueue() {
        if (q.isEmpty()) return false;

        q.remove(0);
        return true;
    }
    
    public int Front() {
        if (!q.isEmpty()) return q.get(0);

        return -1;
    }
    
    public int Rear() {
        if (!q.isEmpty()) return q.get(q.size()-1);

        return -1;
    }
    
    public boolean isEmpty() {
        return q.isEmpty();
    }
    
    public boolean isFull() {
        return q.size() == cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */