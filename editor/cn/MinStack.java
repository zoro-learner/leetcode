package leetcode.editor.cn;

//Design a stack that supports push, pop, top, and retrieving the minimum elemen
//t in constant time. 
//
// 
// push(x) -- Push element x onto stack. 
// pop() -- Removes the element on top of the stack. 
// top() -- Get the top element. 
// getMin() -- Retrieve the minimum element in the stack. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]
//
//Explanation
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin(); // return -3
//minStack.pop();
//minStack.top();    // return 0
//minStack.getMin(); // return -2
// 
//
// 
// Constraints: 
//
// 
// Methods pop, top and getMin operations will always be called on non-empty sta
//cks. 
// 
// Related Topics 栈 设计 
// 👍 651 👎 0


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-09-01 10:50:06
 */
public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);

    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    List<Integer> stack;
    int minInt;
    int size;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        minInt = Integer.MAX_VALUE;
        size = 0;
    }
    
    public void push(int x) {
        stack.add(size, x);
        size++;
        minInt = Math.min(minInt, x);
    }
    
    public void pop() {
        if (size <= 0) {
            throw new ArrayIndexOutOfBoundsException("Empty stack");
        }
        if (top() == minInt) {
            minInt = Integer.MAX_VALUE;
            for (int i = 0; i < size - 1; i++) {
                minInt = Math.min(minInt, stack.get(i));
            }
        }
        size--;
    }
    
    public int top() {
        if (size <= 0) {
            throw new ArrayIndexOutOfBoundsException("Empty stack");
        }
        return stack.get(size - 1);
    }
    
    public int getMin() {
        return minInt;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

    
}