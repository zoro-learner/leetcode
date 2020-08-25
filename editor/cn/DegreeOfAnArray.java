package leetcode.editor.cn;

//Given a non-empty array of non-negative integers nums, the degree of this arra
//y is defined as the maximum frequency of any one of its elements. 
//
// Your task is to find the smallest possible length of a (contiguous) subarray 
//of nums, that has the same degree as nums. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,2,3,1]
//Output: 2
//Explanation: 
//The input array has a degree of 2 because both elements 1 and 2 appear twice.
//Of the subarrays that have the same degree:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//The shortest length is 2. So return 2.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,2,3,1,4,2]
//Output: 6
//Explanation: 
//The degree is 3 because the element 2 is repeated 3 times.
//So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
// 
//
// 
// Constraints: 
//
// 
// nums.length will be between 1 and 50,000. 
// nums[i] will be an integer between 0 and 49,999. 
// 
// Related Topics 数组 
// 👍 155 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-08-12 10:21:24
 */
public class DegreeOfAnArray {
    public static void main(String[] args) {
        Solution solution = new DegreeOfAnArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                map.put(nums[i], indexList);
            }
            degree = Math.max(degree, map.get(nums[i]).size());
        }

        int res = nums.length;
        for (Integer key : map.keySet()) {
            List<Integer> indexList = map.get(key);
            if (indexList.size() == degree) {
                int len = indexList.get(indexList.size() - 1) - indexList.get(0) + 1;
                res = Math.min(res, len);
            }
        }
        return res;
    }
/*
    public int findShortestSubArray2(int[] nums) {
        Map<Integer, Detail> detailMap = new HashMap<>();
        int degree = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!detailMap.containsKey(nums[i])) {
                cnt = 1;
                detailMap.put(nums[i], new Detail(cnt, i, i));
            } else {
                Detail detail = detailMap.get(nums[i]);
                cnt = detail.getCnt() + 1;
                detail.setCnt(cnt);
                detail.setStop(i);
            }
            degree = Math.max(degree, cnt);
        }

        int res = nums.length;
        for (Integer num : detailMap.keySet()) {
            Detail detail = detailMap.get(num);
            if (detail.getCnt() == degree) {
                int len = detail.getStop() - detail.getStart() + 1;
                res = Math.min(res, len);
            }
        }
        return res;
    }

    class Detail {
        int cnt;
        int start;
        int stop;

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getStop() {
            return stop;
        }

        public void setStop(int stop) {
            this.stop = stop;
        }

        public Detail(int cnt, int start, int stop) {
            this.cnt = cnt;
            this.start = start;
            this.stop = stop;
        }
    }
 */
}
//leetcode submit region end(Prohibit modification and deletion)

    
}