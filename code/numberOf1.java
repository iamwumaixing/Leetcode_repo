/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */

public class Solution {
  public int NumberOf1(int n) {
      // 利用2进制数 与运算 
      int res = 0;
      int flag = 1;
      // 当 flag 左移32次后会跳出运算(int类型最大位数32)
      while (flag != 0) {
          if ((n & flag) != 0) res++;
          flag = flag << 1;
      }
      return res;
  }
}