package leetcode.editor.cn;

//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one
// sorted array. 
//
// Note: 
//
// 
// The number of elements initialized in nums1 and nums2 are m and n respectivel
//y. 
// You may assume that nums1 has enough space (size that is equal to m + n) to h
//old additional elements from nums2. 
// 
//
// Example: 
//
// 
//Input:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//Output: [1,2,2,3,5,6]
// 
//
// 
// Constraints: 
//
// 
// -10^9 <= nums1[i], nums2[i] <= 10^9 
// nums1.length == m + n 
// nums2.length == n 
// 
// Related Topics 数组 双指针 
// 👍 584 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-08 09:27:43
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new MergeSortedArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = m + n - 1;
        int pm = m - 1;
        int pn = n - 1;
        while (pn >= 0) {
            if (pm < 0 || nums2[pn] >= nums1[pm]) {
                nums1[p] = nums2[pn];
                pn--;
            } else {
                nums1[p] = nums1[pm];
                pm--;
            }
            p--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}