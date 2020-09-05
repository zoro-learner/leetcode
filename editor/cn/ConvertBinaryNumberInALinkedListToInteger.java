package leetcode.editor.cn;

//Given head which is a reference node to a singly-linked list. The value of eac
//h node in the linked list is either 0 or 1. The linked list holds the binary rep
//resentation of a number. 
//
// Return the decimal value of the number in the linked list. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,0,1]
//Output: 5
//Explanation: (101) in base 2 = (5) in base 10
// 
//
// Example 2: 
//
// 
//Input: head = [0]
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: head = [1]
//Output: 1
// 
//
// Example 4: 
//
// 
//Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
//Output: 18880
// 
//
// Example 5: 
//
// 
//Input: head = [0,0]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// The Linked List is not empty. 
// Number of nodes will not exceed 30. 
// Each node's value is either 0 or 1. 
// Related Topics 位运算 链表 
// 👍 51 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-31 16:43:41
 */
public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        Solution solution = new ConvertBinaryNumberInALinkedListToInteger().new Solution();
        
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
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

public class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
    }
}
}