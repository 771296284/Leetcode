package algorithm.easy;

/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However,
 * flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
 * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 *
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 *
 * Note:
 *
 * The input array won't violate no-adjacent-flowers rule.
 * The input array size is in the range of [1, 20000].
 * n is a non-negative integer which won't exceed the input array size.

 */
public class Solution605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //先排除特殊的数据
        if(n==0) return true;
        if(flowerbed.length==1 && flowerbed[0]==0){
            if(n==1){
                return true;
            }else{
                return false;
            }
        }
        //开始查找合适的位置种花
        for(int i=0;i<flowerbed.length && n>0;i++){
           if(flowerbed[i]==0){
               if(i==0){
                  if(flowerbed[i+1]==0){
                      n--;
                      flowerbed[i] = 1;
                  }
               }else if(i==flowerbed.length-1){
                   if(flowerbed[i-1]==0){
                       n--;
                       flowerbed[i] = 1;
                   }
               }else{
                   if(i+1<flowerbed.length && i-1>=0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                       n--;
                       flowerbed[i] = 1;
                   }
               }
           }
        }
        //判断是否能够全部种完
        if(n==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
       Solution605 solution605 = new Solution605();
       int[] data = {1,0,0,0,0,1};
       int n = 2;
        System.out.println(solution605.canPlaceFlowers(data,n));
    }

}
