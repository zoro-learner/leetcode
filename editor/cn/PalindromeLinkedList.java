package leetcode.editor.cn;

//Given a singly linked list, determine if it is a palindrome. 
//
// Example 1: 
//
// 
//Input: 1->2
//Output: false 
//
// Example 2: 
//
// 
//Input: 1->2->2->1
//Output: true 
//
// Follow up: 
//Could you do it in O(n) time and O(1) space? 
// Related Topics 链表 双指针 
// 👍 616 👎 0


import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-08-31 15:24:25
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode p = head;
        while (p != null) {
            stack.push(p);
            p = p.next;
        }
        int len = stack.size();
        p = head;
        for (int i = 0; i < len / 2; i++) {
            if (p.val != stack.pop().val) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
}