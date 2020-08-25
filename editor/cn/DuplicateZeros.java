package leetcode.editor.cn;

//Given a fixed length array arr of integers, duplicate each occurrence of zero,
// shifting the remaining elements to the right. 
//
// Note that elements beyond the length of the original array are not written. 
//
// Do the above modifications to the input array in place, do not return anythin
//g from your function. 
//
// 
//
// Example 1: 
//
// 
//Input: [1,0,2,3,0,4,5,0]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,0
//,0,2,3,0,0,4]
// 
//
// Example 2: 
//
// 
//Input: [1,2,3]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,2
//,3]
// 
//
// 
//
// Note: 
//
// 
// 1 <= arr.length <= 10000 
// 0 <= arr[i] <= 9 
// Related Topics 数组 
// 👍 51 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-19 14:06:49
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        Solution solution = new DuplicateZeros().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                if (i + 2 < arr.length) {
                    System.arraycopy(arr, i + 1, arr, i + 2, arr.length - i - 2);
                }
                if (i + 1 < arr.length) {
                    arr[i + 1] = 0;
                }
                i += 2;
            } else {
                i++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}