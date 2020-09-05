package leetcode.editor.cn;

//Implement the following operations of a queue using stacks. 
//
// 
// push(x) -- Push element x to the back of queue. 
// pop() -- Removes the element from in front of queue. 
// peek() -- Get the front element. 
// empty() -- Return whether the queue is empty. 
// 
//
// Example: 
//
// 
//MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);  
//queue.peek();  // returns 1
//queue.pop();   // returns 1
//queue.empty(); // returns false 
//
// Notes: 
//
// 
// You must use only standard operations of a stack -- which means only push to 
//top, peek/pop from top, size, and is empty operations are valid. 
// Depending on your language, stack may not be supported natively. You may simu
//late a stack by using a list or deque (double-ended queue), as long as you use o
//nly standard operations of a stack. 
// You may assume that all operations are valid (for example, no pop or peek ope
//rations will be called on an empty queue). 
// 
// Related Topics 栈 设计 
// 👍 222 👎 0


import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-09-01 17:18:21
 */
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if (stack1.isEmpty()) {
            stack2.push(x);
        } else {
            stack1.push(x);
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack1.isEmpty()) {
            Stack<Integer> tmp = stack1;
            stack1 = stack2;
            stack2 = tmp;
        }
        int k = stack1.size();
        for (int i = 0; i < k - 1; i++) {
            stack2.push(stack1.pop());
        }
        int res = stack1.pop();
        for (int i = 0; i < k - 1; i++) {
            stack1.push(stack2.pop());
        }

        return res;
    }
    
    /** Get the front element. */
    public int peek() {
        if (stack1.isEmpty()) {
            Stack<Integer> tmp = stack1;
            stack1 = stack2;
            stack2 = tmp;
        }
        int k = stack1.size();
        for (int i = 0; i < k - 1; i++) {
            stack2.push(stack1.pop());
        }
        int res = stack1.pop();
        stack2.push(res);
        for (int i = 0; i < k; i++) {
            stack1.push(stack2.pop());
        }
        return res;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size() == 0;
    }

    public int size() {
        return stack1.size() + stack2.size();
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
//leetcode submit region end(Prohibit modification and deletion)

    
}