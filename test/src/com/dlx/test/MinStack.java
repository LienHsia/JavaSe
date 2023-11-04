class MinStack {
    Stack<Integer> stack;
    Stack<Integer> MinStack;

    public MinStack() {//构造两个栈，一个普通栈，一个辅助栈
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);//压入元素
        if(MinStack.isEmpty()){
            MinStack.push(val);如果两个栈都是空，也要将此元素压入辅助栈
        }
        else{
            if(val <= MinStack.peek())//如果新压入的元素小于辅助栈栈顶元素
            MinStack.push(val);//将新元素压入辅助栈
        }
    }
    
    public void pop() {
        //如果从普通栈中弹出的元素等于辅助栈的栈顶元素，那么也要将此元素从辅助栈弹出
        if(stack.pop().equals(MinStack.peek())){//这里要用eqauls，不能用==，pop方法和peek方法返回的是一个object类型，也就是两个对象，我们要比较对象的值，如果用==，比较的是对象的地址
            MinStack.pop();//弹出辅助栈栈顶元素
        }
    }
    
    public int top() {
        if(MinStack.isEmpty()){
            return -1;
        }
        return stack.peek();//查看普通栈栈顶元素
    }
    
    public int getMin() {
        if(MinStack.isEmpty()){
            return -1;
        }
        return MinStack.peek();//查看辅助栈栈顶元素
    }
}
