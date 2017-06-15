package algorithm.easy;

/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 */
public class Solution69 {

    public int mySqrt(int x) {
        double pre = 0;
        double cur = x;
        while(Math.abs(cur - pre) > 0.000001){
            pre = cur;
            cur = (pre/2 + x/(2*pre));
        }
        return (int)cur;
    }

    public static void main(String[] args){
        Solution69 solution69 = new Solution69();
        System.out.println(solution69.mySqrt(4));
        System.out.println(solution69.mySqrt(3));
        System.out.println(solution69.mySqrt(7));
        System.out.println(solution69.mySqrt(9));
    }

}
