package algorithm.easy;

/**
 * 查找第一个出错的版本，也就是以下序列找到第一个1出现的位置：
 * 000000111111111
 * Created by jiangjl on 2017/6/9.
 */
public class Solution278 {

    public int firstBadVersion(int n) {
        int low=1, high=n;
        while(low<high) {
            int mid=low + (high-low)/2;
            if(isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    //模拟题目给定的API
    private boolean isBadVersion(int version){return false;}

}
