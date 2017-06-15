package algorithm.easy;

/**
 * 给定一个整数，转换成其在excel文件中的显示方式
 * Created by jiangjl on 2017/6/9.
 */
public class Solution168 {

    public String convertToTitle(int n) {
        if(n==0) return "";
       String tmp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       StringBuilder sb = new StringBuilder();
       while(n>0){
           sb.append(tmp.charAt(((n-1)%26)));
           n = (n-1)/26;
       }
       return sb.reverse().toString();
    }

    public static void main(String[] args){
        Solution168 solution168 = new Solution168();
        for(int i=1;i<100;i++) {
            System.out.println(i + ":" + solution168.convertToTitle(i));
        }
    }
}
