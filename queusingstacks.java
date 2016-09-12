class MyQueue {
    Stack<Integer> st=new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> tempStack = new Stack<Integer>();
        if(st.empty()) st.push(x);
        else{
            // when poping out elements to the temporary stack, the order of the element would be reversed which make up the requirement of queue
            while(!st.empty()){
                tempStack.push(st.pop());
            }
            st.push(x);
            while(!tempStack.empty()){
                st.push(tempStack.pop());
            }
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        st.pop();
    }

    // Get the front element.
    public int peek() {
        return st.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return st.empty();
    }
}