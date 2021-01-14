package leetcode.editor.cn;

//
//Given scores of N athletes, find their relative ranks and the people with the 
//top three highest scores, who will be awarded medals: "Gold Medal", "Silver Meda
//l" and "Bronze Medal". 
//
// Example 1: 
// 
//Input: [5, 4, 3, 2, 1]
//Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//Explanation: The first three athletes got the top three highest scores, so the
//y got "Gold Medal", "Silver Medal" and "Bronze Medal". For the left two athletes
//, you just need to output their relative ranks according to their scores.
// 
// 
//
// Note: 
// 
// N is a positive integer and won't exceed 10,000. 
// All the scores of athletes are guaranteed to be unique. 
// 
// 
// 👍 61 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-10-02 18:27:21
 */
public class RelativeRanks {
    public static void main(String[] args) {
        Solution solution = new RelativeRanks().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private String[] topThree = {"Gold Medal", "Silver Medal", "Bronze Medal"};
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        String[] res = new String[nums.length];

        List<Integer> sortedKeys = map.keySet().stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());

        for (int i = 0; i < sortedKeys.size(); i++) {
            String rank;
            if (i < 3) {
                rank = topThree[i];
            } else {
                rank = String.valueOf(i + 1);
            }

            res[map.get(sortedKeys.get(i))] = rank;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}