class MinStack {
    Stack<Integer>min;
    int minValue ;
    Stack<Integer>add;
    public MinStack() {
        min = new Stack<>();
        add = new Stack<>();
        minValue = Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        minValue = (minValue > value) ? value : minValue;
        min.push(value);
        add.push(minValue);        
    }
    
    public void pop() {
       min.pop();
      add.pop();
      if(!add.isEmpty()){
      minValue = add.peek();
      }else{
        minValue = Integer.MAX_VALUE;
      }
    }
    
    public int top() {
        return min.peek();        
    }
    
    public int getMin() {
        return add.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */