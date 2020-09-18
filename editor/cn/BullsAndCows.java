package leetcode.editor.cn;

//You are playing the following Bulls and Cows game with your friend: You write 
//down a number and ask your friend to guess what the number is. Each time your fr
//iend makes a guess, you provide a hint that indicates how many digits in said gu
//ess match your secret number exactly in both digit and position (called "bulls")
// and how many digits match the secret number but locate in the wrong position (c
//alled "cows"). Your friend will use successive guesses and hints to eventually d
//erive the secret number. 
//
// Write a function to return a hint according to the secret number and friend's
// guess, use A to indicate the bulls and B to indicate the cows. 
//
// Please note that both secret number and friend's guess may contain duplicate 
//digits. 
//
// Example 1: 
//
// 
//Input: secret = "1807", guess = "7810"
//
//Output: "1A3B"
//
//Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7. 
//
// Example 2: 
//
// 
//Input: secret = "1123", guess = "0111"
//
//Output: "1A1B"
//
//Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
// 
//
// Note: You may assume that the secret number and your friend's guess only cont
//ain digits, and their lengths are always equal. Related Topics 哈希表 
// 👍 94 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-02 15:44:37
 */
public class BullsAndCows {
    public static void main(String[] args) {
        Solution solution = new BullsAndCows().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = getBulls(secret, guess);
        int cows = getSameCharCount(secret, guess) - bulls;
        String hint = bulls + "A" + cows + "B";
        return hint;
    }

    private int getSameCharCount(String secret, String guess) {
        int[] dict = new int[10];
        for (char ch : secret.toCharArray()) {
            dict[ch - '0']++;
        }

        int cnt = 0;
        for (char ch : guess.toCharArray()) {
            int index = ch - '0';
            if (dict[index] > 0) {
                cnt++;
                dict[index]--;
            }
        }

        return cnt;
    }

    private int getBulls(String secret, String guess) {
        int cnt = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}