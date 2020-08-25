package leetcode.editor.cn;

//Suppose you have a long flowerbed in which some of the plots are planted and s
//ome are not. However, flowers cannot be planted in adjacent plots - they would c
//ompete for water and both would die. 
//
// Given a flowerbed (represented as an array containing 0 and 1, where 0 means 
//empty and 1 means not empty), and a number n, return if n new flowers can be pla
//nted in it without violating the no-adjacent-flowers rule. 
//
// Example 1: 
// 
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: True
// 
// 
//
// Example 2: 
// 
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: False
// 
// 
//
// Note: 
// 
// The input array won't violate no-adjacent-flowers rule. 
// The input array size is in the range of [1, 20000]. 
// n is a non-negative integer which won't exceed the input array size. 
// 
// Related Topics 数组 
// 👍 157 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-11 18:43:40
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new CanPlaceFlowers().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxNum = maxPlaceFlowers(flowerbed);
        return maxNum >= n;
    }

    private int maxPlaceFlowers(int[] flowerbed) {
        int maxNum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (canPlace(flowerbed, i)) {
                maxNum++;
                flowerbed[i] = 1;
            }
        }
        return maxNum;
    }

    /**
     * can position n be planted
     * @param flowerbed
     * @param n position to be planted
     * @return
     */
    private boolean canPlace(int[] flowerbed, int n) {
        if (flowerbed == null || n < 0 || n > flowerbed.length - 1 || flowerbed[n] == 1) {
            return false;
        }
        if (flowerbed.length == 1) {
            return true;
        }
        if (n == 0) {
            return flowerbed[n + 1] == 0;
        } else if (n == flowerbed.length - 1) {
            return flowerbed[n - 1] == 0;
        } else {
            return flowerbed[n - 1] == 0 && flowerbed[n + 1] == 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}