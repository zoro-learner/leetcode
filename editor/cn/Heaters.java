package leetcode.editor.cn;

//Winter is coming! Your first job during the contest is to design a standard he
//ater with fixed warm radius to warm all the houses. 
//
// Now, you are given positions of houses and heaters on a horizontal line, find
// out minimum radius of heaters so that all houses could be covered by those heat
//ers. 
//
// So, your input will be the positions of houses and heaters seperately, and yo
//ur expected output will be the minimum radius standard of heaters. 
//
// Note: 
//
// 
// Numbers of houses and heaters you are given are non-negative and will not exc
//eed 25000. 
// Positions of houses and heaters you are given are non-negative and will not e
//xceed 10^9. 
// As long as a house is in the heaters' warm radius range, it can be warmed. 
// All the heaters follow your radius standard and the warm radius will the same
//. 
// 
//
// 
//
// Example 1: 
//
// 
//Input: [1,2,3],[2]
//Output: 1
//Explanation: The only heater was placed in the position 2, and if we use the r
//adius 1 standard, then all the houses can be warmed.
// 
//
// 
//
// Example 2: 
//
// 
//Input: [1,2,3,4],[1,4]
//Output: 1
//Explanation: The two heater was placed in the position 1 and 4. We need to use
// radius 1 standard, then all the houses can be warmed.
// 
//
// 
// Related Topics 二分查找 
// 👍 152 👎 0


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-09-25 19:51:07
 */
public class Heaters {
    public static void main(String[] args) {
        Solution solution = new Heaters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int left = 0;
        int right = Math.max(houses[houses.length - 1], heaters[heaters.length - 1]);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isAllCover(houses, heaters, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isAllCover(int[] houses, int[] heaters, int r) {
        boolean res = true;
        for (int house : houses) {
            if (!isCover(house, heaters, r)) {
                res = false;
                break;
            }
        }
        return res;
    }

    private boolean isCover(int house, int[] heaters, int r) {
        int left = 0;
        int right = heaters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (heaters[mid] == house) {
                return true;
            } else if (heaters[mid] < house) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (house >= heaters[left] - r && house <= heaters[left] + r) {
            return true;
        }
        if (left > 0 && house >= heaters[left - 1] - r && house <= heaters[left - 1] + r) {
            return true;
        }

        return false;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

    
}