package leetcode.utils;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lenovo
 * @create 2020-08-04 10:09
 */
public class ArrayUtils {
    public static void printArray(int[] nums, int len) {
        int[] subArray = Arrays.copyOfRange(nums, 0, len);
        System.out.println(Arrays.toString(subArray));
    }
}
