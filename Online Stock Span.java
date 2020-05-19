class StockSpanner {
  private Stack<Integer> s;
  private List<Integer> alist;
  private int cnt;
  public StockSpanner() {
    s = new Stack<>();
    alist = new ArrayList<>();
    cnt = 0;
  }

  public int next(int price) {
    while( !s.empty() && alist.get(s.peek()) <= price ){
      s.pop();
    }
    int tmpval;
    if(!s.empty()) tmpval = s.peek();
    else tmpval = -1;
    s.add(cnt);
    alist.add(price);
    cnt++;
    return s.peek() - tmpval;
  }
}
