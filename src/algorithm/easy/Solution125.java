package algorithm.easy;

/**
 * 判断一个字符串中的字母和数字字符是否构成回文
 * Created by jiangjl on 2017/6/9.
 */
public class Solution125 {

    public boolean isPalindrome(String s) {
       if(s.length()==0) return true;
       int length = 0;
       //过滤数据并统一转换成小写字母
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(c>='a'&&c<='z' || c>='A'&&c<='Z' || c>='0'&&c<='9') length++;
       }
       char[] data = new char[length];
        length = 0;
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(c>='a'&&c<='z' || c>='A'&&c<='Z' || c>='0'&&c<='9'){
               if(c>='A' && c<='Z') c = Character.toLowerCase(c);
               data[length++] = c;
           }
       }
       //采用二分法判断是否是回文
        int mid = length/2;
        int left = 0,right = length-1;
        while(left<right && left<=mid){
            if(data[left]!=data[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
       Solution125 so = new Solution125();
       System.out.println(so.isPalindrome("0P"));
    }

}
