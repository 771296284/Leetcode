package algorithm.easy;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution1
{
    public int[] twoSum(int[] nums, int target) {
       int[] answer = new int[2];
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[j]==target-nums[i]){
                   answer[0]=i;
                   answer[1]=j;
                   return answer;
               }
           }
       }
       return answer;
    }

    public static void main(String[] args){
        Solution1 solution1 = new Solution1();
        int[] nums = {3,2,4};
        int[] answer = solution1.twoSum(nums,6);
        System.out.println(answer[0]+"+"+answer[1]);
    }
}
