package leetcode.editor.cn;

//Given an array A of strings made only from lowercase letters, return a list of
// all characters that show up in all strings within the list (including duplicate
//s). For example, if a character occurs 3 times in all strings but not 4 times, y
//ou need to include that character three times in the final answer. 
//
// You may return the answer in any order. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: ["bella","label","roller"]
//Output: ["e","l","l"]
// 
//
// 
// Example 2: 
//
// 
//Input: ["cool","lock","cook"]
//Output: ["c","o"]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 100 
// 1 <= A[i].length <= 100 
// A[i][j] is a lowercase letter 
// 
// 
// Related Topics 数组 哈希表 
// 👍 92 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-08-19 08:26:38
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        Solution solution = new FindCommonCharacters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> commonChars(String[] A) {
        final int LOWER_NUM = 26;
        List<String> res = new ArrayList<>();
        int[][] counts = new int[A.length][LOWER_NUM];
        for (int i = 0; i < A.length; i++) {
            for (char ch : A[i].toCharArray()) {
                counts[i][ch - 'a']++;
            }
        }

        for (int i = 0; i < LOWER_NUM; i++) {
            int count = counts[0][i];
            for (int j = 1; j < A.length; j++) {
                count = Math.min(count, counts[j][i]);
            }

            for (int k = 0; k < count; k++) {
                char ch = (char) ('a' + i);
                res.add("" + ch);
            }
        }

        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}