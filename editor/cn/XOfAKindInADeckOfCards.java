package leetcode.editor.cn;

//In a deck of cards, each card has an integer written on it. 
//
// Return true if and only if you can choose X >= 2 such that it is possible to 
//split the entire deck into 1 or more groups of cards, where: 
//
// 
// Each group has exactly X cards. 
// All the cards in each group have the same integer. 
// 
//
// 
// Example 1: 
//
// 
//Input: deck = [1,2,3,4,4,3,2,1]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
// 
//
// Example 2: 
//
// 
//Input: deck = [1,1,1,2,2,2,3,3]
//Output: false´
//Explanation: No possible partition.
// 
//
// Example 3: 
//
// 
//Input: deck = [1]
//Output: false
//Explanation: No possible partition.
// 
//
// Example 4: 
//
// 
//Input: deck = [1,1]
//Output: true
//Explanation: Possible partition [1,1].
// 
//
// Example 5: 
//
// 
//Input: deck = [1,1,2,2,2,2]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[2,2].
// 
//
// 
// Constraints: 
//
// 
// 1 <= deck.length <= 10^4 
// 0 <= deck[i] < 10^4 
// 
// Related Topics 数组 数学 
// 👍 179 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-08-18 11:33:37
 */
public class XOfAKindInADeckOfCards {
    public static void main(String[] args) {
        Solution solution = new XOfAKindInADeckOfCards().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : deck) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (Integer num : countMap.keySet()) {
            if (res == 0) {
                res = countMap.get(num);
            } else if (res < 2) {
                return false;
            } else {
                res = gcd(res, countMap.get(num));
            }
        }
        return res >= 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}