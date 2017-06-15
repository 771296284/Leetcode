package algorithm.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数k和一个数组，查找数组中相差的k的数目的个数
 * Created by becky on 2017-06-15.
 */
public class Solution532 {

    public int findPairs(int[] nums, int k) {
        int len = nums.length, result = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> sameSet = new HashSet<Integer>();
        if (k != 0) {
            for (int i = 0; i < len; i++) {
                if (!set.contains(nums[i]) && set.contains(nums[i] - k))
                    result++;
                set.add(nums[i]);
            }
        }
        else {
            for (int i = 0; i < len; i++) {
                if (!sameSet.contains(nums[i]) && set.contains(nums[i])) {
                    result++;
                    sameSet.add(nums[i]);
                }
                set.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
       Solution532 solution532 = new Solution532();
       int[] num = {3,1,4,1,5};
        System.out.println(solution532.findPairs(num,0));
    }
}
