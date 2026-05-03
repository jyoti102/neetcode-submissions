class StockSpanner {
    private List<Integer> l;

    public StockSpanner() {
        l = new ArrayList<>();
    }
    
    public int next(int price) {
        this.l.add(price);
        int i = l.size() - 1;
        int span = 0;
        while (i >= 0 && l.get(i) <= price) {
            i--;
            span++;
        }
        return span == 0? -1 : span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */