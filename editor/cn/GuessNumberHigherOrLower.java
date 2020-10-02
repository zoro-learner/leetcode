package leetcode.editor.cn;

//We are playing the Guess Game. The game is as follows: 
//
// I pick a number from 1 to n. You have to guess which number I picked. 
//
// Every time you guess wrong, I'll tell you whether the number is higher or low
//er. 
//
// You call a pre-defined API guess(int num) which returns 3 possible results (-
//1, 1, or 0): 
//
// 
//-1 : My number is lower
// 1 : My number is higher
// 0 : Congrats! You got it!
// 
//
// Example : 
//
// 
// 
//Input: n = 10, pick = 6
//Output: 6
// 
// 
// Related Topics 二分查找 
// 👍 82 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-23 10:38:26
 */
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        Solution solution = new GuessNumberHigherOrLower().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
//            System.out.println(mid);
//            System.out.println(guess(mid));
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}