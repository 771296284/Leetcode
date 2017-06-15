package algorithm.easy;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class Solution190 {

    public int reverseBits(int n) {
        int value = 0;
        // 32位无符号数
        for (int i = 0; i < 32; ++i) {
            if ((n & 1) == 1) {
                value = (value << 1) + 1; // 左移动
                n >>= 1;
            } else {
                value = value << 1;
                n >>= 1; // 右移
            }
        }
        return value;
    }

    public static void main(String[] args){
        int test = 43261596;
        Solution190 solution190 = new Solution190();
        System.out.println(solution190.reverseBits(test));
    }

}
