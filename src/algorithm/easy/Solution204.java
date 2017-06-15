package algorithm.easy;

/**
 * 统计一个数中素数的个数
 * 核心算法思想：厄拉多塞筛法
 * Created by jiangjl on 2017/6/9.
 */
public class Solution204 {

    public int countPrimes(int n) {
        if(n==0 || n== 1 ) return 0;
        int[] map = new int[n+1];
        map[0] = 1;
        for(int i=2;i<n;i++){
            if(map[i]!=1){
                for(int j = 2;j*i<=n;j++){
                    map[j*i] = 1;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(map[i]==0)
                count++;
        }
        return count;
    }


    public static void main(String[] args){
        Solution204 solution204 = new Solution204();
        for(int i=0;i<150;i++){
            System.out.println(i+":"+solution204.countPrimes(i));
        }
    }

}
