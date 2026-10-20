class MyStack {
   Queue<Integer> que1;
    public MyStack() {
        que1 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        que1.offer(x);
        for(int i=1;i<que1.size();i++){//size = 3 hai to i = 1 , 2 do baar chal jaye
         que1.offer(que1.poll()); 
        }// uelogic yha to yha handle karke sirf push tc  O(n) kar lo nhi to ise o(1) rkho to pop and top ki tc bdegi is logic ke krn
    }
    
    public int pop() {
       return que1.poll();
    }
    
    public int top() {
      return que1.peek();
    }
    
    public boolean empty() {
        return que1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */