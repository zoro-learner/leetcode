package leetcode.editor.cn;

//Alice and Bob take turns playing a game, with Alice starting first. 
//
// Initially, there is a number N on the chalkboard. On each player's turn, that
// player makes a move consisting of: 
//
// 
// Choosing any x with 0 < x < N and N % x == 0. 
// Replacing the number N on the chalkboard with N - x. 
// 
//
// Also, if a player cannot make a move, they lose the game. 
//
// Return True if and only if Alice wins the game, assuming both players play op
//timally. 
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
//Input: 2
//Output: true
//Explanation: Alice chooses 1, and Bob has no more moves.
// 
//
// 
// Example 2: 
//
// 
//Input: 3
//Output: false
//Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
// 
//
// 
//
// Note: 
//
// 
// 1 <= N <= 1000 
// 
// 
// Related Topics 数学 动态规划 
// 👍 230 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-11 09:02:06
 */
public class DivisorGame {
    public static void main(String[] args) {
        Solution solution = new DivisorGame().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean divisorGame(int N) {
        int[] win = new int[N + 1]; // whether the first player can win.

        win[0] = 0;
        win[1] = 0;
        for (int n = 2; n <= N; n++) {
            int turn = 1 - win[n - 1];
            for (int i = 2; i < n; i++) {
                if (n % i == 0 && win[n - i] == 0) {
                    turn = 1;
                    break;
                }
            }
            win[n] = turn;
        }

        return win[N] == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}