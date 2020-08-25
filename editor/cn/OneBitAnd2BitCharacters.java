package leetcode.editor.cn;

//We have two special characters. The first character can be represented by one 
//bit 0. The second character can be represented by two bits (10 or 11). 
//
// Now given a string represented by several bits. Return whether the last chara
//cter must be a one-bit character or not. The given string will always end with a
// zero. 
//
// Example 1: 
// 
//Input: 
//bits = [1, 0, 0]
//Output: True
//Explanation: 
//The only way to decode it is two-bit character and one-bit character. So the l
//ast character is one-bit character.
// 
// 
//
// Example 2: 
// 
//Input: 
//bits = [1, 1, 1, 0]
//Output: False
//Explanation: 
//The only way to decode it is two-bit character and two-bit character. So the l
//ast character is NOT one-bit character.
// 
// 
//
// Note:
// 1 <= len(bits) <= 1000. 
// bits[i] is always 0 or 1. 
// Related Topics 数组 
// 👍 136 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-12 16:01:07
 */
public class OneBitAnd2BitCharacters {
    public static void main(String[] args) {
        Solution solution = new OneBitAnd2BitCharacters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int start = 0;
        while (start < bits.length - 1) {
            if (bits[start] == 0) {
                start += 1;
            } else {
                start += 2;
            }
        }
        return start == bits.length - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}