class StockSpanner {
    Stack<Integer> s;
    ArrayList<Integer> stock;

    public StockSpanner() {
        s = new Stack<>();
        stock = new ArrayList<>();
    }
    
    public int next(int price) {
        stock.add(price);
            int i = stock.size()-1;
            while(!s.isEmpty() && price >= stock.get(s.peek())){
                s.pop();
            }
            int span;
            if(s.isEmpty()){
              span = i+1;
            }else{
                int prevHigh = s.peek();
                span = i - prevHigh;
            }
        
        s.push(i);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */