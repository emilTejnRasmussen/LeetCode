package p0232_implement_queue_using_stacks;

import java.util.Stack;

class MyQueue
{
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue()
    {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x)
    {
        if (outStack.isEmpty())
        {
            outStack.push(x);
            return;
        }

        reverseStack(outStack, inStack);
        inStack.push(x);
        reverseStack(inStack, outStack);
    }

    private void reverseStack(Stack<Integer> fromStack, Stack<Integer> intoStack)
    {
        while (!fromStack.isEmpty()){
            intoStack.push(fromStack.pop());
        }
    }

    public int pop()
    {
        return outStack.pop();
    }

    public int peek()
    {
        return outStack.peek();
    }

    public boolean empty()
    {
        return outStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */