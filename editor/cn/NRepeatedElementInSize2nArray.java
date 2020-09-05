package leetcode.editor.cn;

//In a array A of size 2N, there are N+1 unique elements, and exactly one of the
//se elements is repeated N times. 
//
// Return the element repeated N times. 
//
// 
//
// 
// 
//
// 
// Example 1: 
//
// 
//Input: [1,2,3,3]
//Output: 3
// 
//
// 
// Example 2: 
//
// 
//Input: [2,1,2,5,3,2]
//Output: 2
// 
//
// 
// Example 3: 
//
// 
//Input: [5,1,5,2,5,3,5,4]
//Output: 5
// 
//
// 
//
// Note: 
//
// 
// 4 <= A.length <= 10000 
// 0 <= A[i] < 10000 
// A.length is even 
// 
// 
// 
// 
// Related Topics 哈希表 
// 👍 83 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-09-04 20:10:46
 */
public class NRepeatedElementInSize2nArray {
    public static void main(String[] args) {
        Solution solution = new NRepeatedElementInSize2nArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for (int num : A) {
            if (set.contains(num)) {
                res = num;
                break;
            }
            set.add(num);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}