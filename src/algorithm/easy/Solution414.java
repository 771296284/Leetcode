package algorithm.easy;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 查找第三小的元素
 * Created by jiangjl on 2017/6/9.
 */
public class Solution414 {

    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Iterator it = set.iterator();
        int i = 0;
        int answer =0;
        while(it.hasNext()){
            answer = (Integer) it.next();
            if(i==set.size()-3){
                return answer;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,2,1};
        Solution414 so = new Solution414();
        System.out.println(so.thirdMax(nums));
    }

}
