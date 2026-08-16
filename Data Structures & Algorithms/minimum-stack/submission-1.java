class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> ms;
    public MinStack() {
         s = new Stack<>();
        ms  = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(ms.isEmpty() || val <= ms.peek()){
            ms.push(val);
        }
        
    }
    
    public void pop() {
        if(s.isEmpty()){
            
        }
        else{
            int remove = s.pop();
            if(!ms.isEmpty() && remove == ms.peek()){
                ms.pop();
            }
        }
    }
    
    public int top() {
        if(s.isEmpty()){
            
        }
        else{
            return s.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(ms.isEmpty()){
            return -1;
        }
        else{
            return ms.peek();
        }
        
    }
}
