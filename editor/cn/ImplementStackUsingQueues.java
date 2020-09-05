package leetcode.editor.cn;

//Implement the following operations of a stack using queues. 
//
// 
// push(x) -- Push element x onto stack. 
// pop() -- Removes the element on top of the stack. 
// top() -- Get the top element. 
// empty() -- Return whether the stack is empty. 
// 
//
// Example: 
//
// 
//MyStack stack = new MyStack();
//
//stack.push(1);
//stack.push(2);  
//stack.top();   // returns 2
//stack.pop();   // returns 2
//stack.empty(); // returns false 
//
// Notes: 
//
// 
// You must use only standard operations of a queue -- which means only push to 
//back, peek/pop from front, size, and is empty operations are valid. 
// Depending on your language, queue may not be supported natively. You may simu
//late a queue by using a list or deque (double-ended queue), as long as you use o
//nly standard operations of a queue. 
// You may assume that all operations are valid (for example, no pop or top oper
//ations will be called on an empty stack). 
// 
// Related Topics 栈 设计 
// 👍 219 👎 0


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author zoro-learner
 * @create 2020-09-01 16:52:21
 */
public class ImplementStackUsingQueues {
    public static void main(String[] args) {

    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if (q1.isEmpty()) {
            q2.add(x);
        } else {
            q1.add(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (q1.isEmpty()) {
            Queue<Integer> tmp = q1;
            q1 = q2;
            q2 = tmp;
        }
        int k = q1.size();
        for (int i = 0; i < k - 1; i++) {
            q2.add(q1.remove());
        }
        return q1.remove();
    }
    
    /** Get the top element. */
    public int top() {
        if (q1.isEmpty()) {
            Queue<Integer> tmp = q1;
            q1 = q2;
            q2 = tmp;
        }
        int k = q1.size();
        for (int i = 0; i < k - 1; i++) {
            q2.add(q1.remove());
        }
        int res = q1.remove();
        q2.add(res);
        return res;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size() == 0;
    }

    public int size() {
        return q1.size() + q2.size();
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
//leetcode submit region end(Prohibit modification and deletion)

    
}