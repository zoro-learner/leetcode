package leetcode.editor.cn;

//In LOL world, there is a hero called Teemo and his attacking can make his enem
//y Ashe be in poisoned condition. Now, given the Teemo's attacking ascending time
// series towards Ashe and the poisoning time duration per Teemo's attacking, you 
//need to output the total time that Ashe is in poisoned condition. 
//
// You may assume that Teemo attacks at the very beginning of a specific time po
//int, and makes Ashe be in poisoned condition immediately. 
//
// Example 1: 
//
// 
//Input: [1,4], 2
//Output: 4
//Explanation: At time point 1, Teemo starts attacking Ashe and makes Ashe be po
//isoned immediately. 
//This poisoned status will last 2 seconds until the end of time point 2. 
//And at time point 4, Teemo attacks Ashe again, and causes Ashe to be in poison
//ed status for another 2 seconds. 
//So you finally need to output 4.
// 
//
// 
//
// Example 2: 
//
// 
//Input: [1,2], 2
//Output: 3
//Explanation: At time point 1, Teemo starts attacking Ashe and makes Ashe be po
//isoned. 
//This poisoned status will last 2 seconds until the end of time point 2. 
//However, at the beginning of time point 2, Teemo attacks Ashe again who is alr
//eady in poisoned status. 
//Since the poisoned status won't add up together, though the second poisoning a
//ttack will still work at time point 2, it will stop at the end of time point 3. 
//
//So you finally need to output 3.
// 
//
// 
//
// Note: 
//
// 
// You may assume the length of given time series array won't exceed 10000. 
// You may assume the numbers in the Teemo's attacking time series and his poiso
//ning time duration per attacking are non-negative integers, which won't exceed 1
//0,000,000. 
// 
//
// 
// Related Topics 数组 
// 👍 116 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-27 10:58:17
 */
public class TeemoAttacking {
    public static void main(String[] args) {
        Solution solution = new TeemoAttacking().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int res = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            res += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}