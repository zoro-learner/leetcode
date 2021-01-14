package leetcode.editor.cn;

//Given two arrays A and B of equal size, the advantage of A with respect to B i
//s the number of indices i for which A[i] > B[i]. 
//
// Return any permutation of A that maximizes its advantage with respect to B. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: A = [2,7,11,15], B = [1,10,4,11]
//Output: [2,11,7,15]
// 
//
// 
// Example 2: 
//
// 
//Input: A = [12,24,8,32], B = [13,25,32,11]
//Output: [24,32,8,12]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length = B.length <= 10000 
// 0 <= A[i] <= 10^9 
// 0 <= B[i] <= 10^9 
// 
// 
// 
// Related Topics 贪心算法 数组 
// 👍 87 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-10-31 15:18:24
 */
public class AdvantageShuffle {
    public static void main(String[] args) {
        Solution solution = new AdvantageShuffle().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    // For every B[i], finds the smallest A[j] that A[j] > B[i], if there is no such integer, return the smallest of A that haven't been used

    public int[] advantageCount(int[] A, int[] B) {
        int N = A.length;
        int[] res = new int[N];
        Deque<Integer> sortedA = Arrays.stream(A)
            .boxed()
            .sorted()
            .collect(Collectors.toCollection(LinkedList::new));

        int head = 0;
        for (int i = 0; i < N; i++) {
            Iterator<Integer> ia = sortedA.iterator();
            while (ia.hasNext()) {
                int a = ia.next();
                if (a <= B[i]) {
                    a = ia.next();
                }
            }
            if (idx == sortedA.size()) {
                idx = head;
            }
            res[i] = sortedA.get(idx);
            sortedA.remove(idx);
        }
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}