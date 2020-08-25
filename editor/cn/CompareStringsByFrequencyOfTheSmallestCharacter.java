package leetcode.editor.cn;

//Let's define a function f(s) over a non-empty string s, which calculates the f
//requency of the smallest character in s. For example, if s = "dcce" then f(s) = 
//2 because the smallest character is "c" and its frequency is 2. 
//
// Now, given string arrays queries and words, return an integer array answer, w
//here each answer[i] is the number of words such that f(queries[i]) < f(W), where
// W is a word in words. 
//
// 
// Example 1: 
//
// 
//Input: queries = ["cbd"], words = ["zaaaz"]
//Output: [1]
//Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd
//") < f("zaaaz").
// 
//
// Example 2: 
//
// 
//Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
//Output: [1,2]
//Explanation: On the first query only f("bbb") < f("aaaa"). On the second query
// both f("aaa") and f("aaaa") are both > f("cc").
// 
//
// 
// Constraints: 
//
// 
// 1 <= queries.length <= 2000 
// 1 <= words.length <= 2000 
// 1 <= queries[i].length, words[i].length <= 10 
// queries[i][j], words[i][j] are English lowercase letters. 
// 
// Related Topics 数组 字符串 
// 👍 26 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-19 19:56:00
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {
    public static void main(String[] args) {
        Solution solution = new CompareStringsByFrequencyOfTheSmallestCharacter().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int[] wordsFreq = getFreqSorted(words);
        for (int i = 0; i < queries.length; i++) {
            int queryFreq = calcFreq(queries[i]);
            res[i] = getGreaterNumCount(queryFreq, wordsFreq);
        }
        return res;
    }

    private int getGreaterNumCount(int queryFreq, int[] wordsFreq) {
//        System.out.println(queryFreq);
//        System.out.println(Arrays.toString(wordsFreq));
        int left = 0;
        int right = wordsFreq.length;
        // find first num larger than queryFreq
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (wordsFreq[mid] <= queryFreq) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
//        System.out.println(right);
        return wordsFreq.length - right;
    }

    private int[] getFreqSorted(String[] words) {
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            res[i] = calcFreq(words[i]);
        }
        Arrays.sort(res);
        return res;
    }

    private int calcFreq(String word) {
        final int RANGE = 26;
        int[] dict = new int[RANGE];
        for (char ch : word.toCharArray()) {
            dict[ch - 'a']++;
        }
        for (int i = 0; i < RANGE; i++) {
            if (dict[i] != 0) {
                return dict[i];
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}