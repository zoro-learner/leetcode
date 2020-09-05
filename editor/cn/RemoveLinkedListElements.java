package leetcode.editor.cn;

//Remove all elements from a linked list of integers that have value val. 
//
// Example: 
//
// 
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5
// 
// Related Topics 链表 
// 👍 436 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-31 14:22:06
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Solution solution = new RemoveLinkedListElements().new Solution();
        
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

public class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
        next = null;
    }
}
}