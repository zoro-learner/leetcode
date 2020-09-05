package leetcode.editor.cn;

//Reverse a singly linked list. 
//
// Example: 
//
// 
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
// 
//
// Follow up: 
//
// A linked list can be reversed either iteratively or recursively. Could you im
//plement both? 
// Related Topics 链表 
// 👍 1198 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-31 14:37:13
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();
        
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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = reverseList(head.next);
        ListNode p = res;
        while (p.next != null) {
            p = p.next;
        }
        p.next = head;
        head.next = null;
        return res;
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