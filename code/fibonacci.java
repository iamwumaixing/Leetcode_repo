/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */

public class Solution {
  public int Fibonacci(int n) {
      // 1 1 2 3 5 8
      // 从第三项开始，n = (n-1) + (n-2)
      int i = 1,j = 1;
      int res = 0;
      if (n == 1 || n == 2) return 1;
      for (int m = 3;m <= n;m++) {
          res = i + j;
          i = j;
          j = res;
      }
      return res;
  }
}