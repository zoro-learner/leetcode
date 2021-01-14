package leetcode.editor.cn;

//Some people will make friend requests. The list of their ages is given and age
//s[i] is the age of the ith person. 
//
// Person A will NOT friend request person B (B != A) if any of the following co
//nditions are true: 
//
// 
// age[B] <= 0.5 * age[A] + 7 
// age[B] > age[A] 
// age[B] > 100 && age[A] < 100 
// 
//
// Otherwise, A will friend request B. 
//
// Note that if A requests B, B does not necessarily request A. Also, people wil
//l not friend request themselves. 
//
// How many total friend requests are made? 
//
// Example 1: 
//
// 
//Input: [16,16]
//Output: 2
//Explanation: 2 people friend request each other.
// 
//
// Example 2: 
//
// 
//Input: [16,17,18]
//Output: 2
//Explanation: Friend requests are made 17 -> 16, 18 -> 17. 
//
// Example 3: 
//
// 
//Input: [20,30,100,110,120]
//Output: 3
//Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.
// 
//
// 
//
// Notes: 
//
// 
// 1 <= ages.length <= 20000. 
// 1 <= ages[i] <= 120. 
// 
// Related Topics 数组 
// 👍 52 👎 0


import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-10-31 13:59:20
 */
public class FriendsOfAppropriateAges {
    public static void main(String[] args) {
        Solution solution = new FriendsOfAppropriateAges().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numFriendRequests(int[] ages) {
        int[] dict = new int[130];
        for (int age : ages) {
            dict[age]++;
        }
        int res = 0;
        for (int i = 0; i < dict.length; i++) {
            if (dict[i] == 0) {
                continue;
            }
            for (int j = 0; j < dict.length; j++) {
                if (dict[j] == 0) {
                    continue;
                }
                if (hasFriendRequest(i, j)) {
                    if (i == j) {
                        res += (dict[i] - 1) * dict[i];
                    } else {
                        res += dict[i] * dict[j];
                    }
                }
            }
        }
        return res;
    }

    // age[B] <= 0.5 * age[A] + 7
    // age[B] > age[A]
    // age[B] > 100 && age[A] < 100
    private boolean hasFriendRequest(int ageA, int ageB) {
        return (ageB > ageA / 2 + 7) && (ageB <= ageA);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}