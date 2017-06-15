package algorithm.easy;

/**
 * Created by jiangjl on 2017/6/9.
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {
        //先处理特殊数据
       return haystack.indexOf(needle);
    }

    public static void main(String[] args){
       Solution28 solution28 = new Solution28();
        System.out.println(solution28.strStr("ddd","ds"));
    }

}
