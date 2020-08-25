package leetcode.editor.cn;

//In a string S of lowercase letters, these letters form consecutive groups of t
//he same character. 
//
// For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx",
// "z" and "yy". 
//
// Call a group large if it has 3 or more characters. We would like the starting
// and ending positions of every large group. 
//
// The final answer should be in lexicographic order. 
//
// 
//
// Example 1: 
//
// 
//Input: "abbxxxxzzy"
//Output: [[3,6]]
//Explanation: "xxxx" is the single large group with starting  3 and ending posi
//tions 6.
// 
//
// Example 2: 
//
// 
//Input: "abc"
//Output: []
//Explanation: We have "a","b" and "c" but no large group.
// 
//
// Example 3: 
//
// 
//Input: "abcdddeeeeaabbbcd"
//Output: [[3,5],[6,9],[12,14]] 
//
// 
//
// Note: 1 <= S.length <= 1000 
// Related Topics 数组 
// 👍 50 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-08-13 18:08:41
 */
public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        Solution solution = new PositionsOfLargeGroups().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        if (S == null || S.length() < 3) {
            return res;
        }
        int start = 0;
        int stop = 0;
        while (stop < S.length()) {
            if (S.charAt(stop) == S.charAt(start)) {
                stop++;
            } else {
                if (stop - start > 2) {
                    res.add(Arrays.asList(start, stop - 1));
                }
                start = stop;
            }
        }
        if (stop - start > 2) {
            res.add(Arrays.asList(start, stop - 1));
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}