class MyStack {
    Queue<Integer> q1 ;
    Queue<Integer> q2 ;
    public MyStack() {
        q1 =new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty()) q1.offer(x);
        else q1.offer(x);
    }
    
    public int pop() {
        int x =0;
        if(!q1.isEmpty()){
        while(!q1.isEmpty()){
            x = q1.poll();
            if(!q1.isEmpty()) q2.offer(x);
        }
        }
        else{
            while(!q2.isEmpty()){
            x = q2.poll();
            if(!q2.isEmpty()) q1.offer(x);
        }
        }
        return x;
    }
    
    public int top() {
       int x =0;
        if(!q1.isEmpty()){
        while(!q1.isEmpty()){
            x = q1.poll();
            q2.offer(x);
        }
        }
        else{
            while(!q2.isEmpty()){
            x = q2.poll();
            q1.offer(x);
        }
        }
        return x; 
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()) return true;
        return false;
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