/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 */

public class Solution {
  public int JumpFloor(int target) {
      // 因为只有 1 和 2 两种跳法，所以 f(n) = f(n-1) + f(n-2)
      if (target == 1) return 1;
      if (target == 2) return 2;
      // 1级和2级台阶并不符合
      int first = 1;
      int second = 2;
      int res = 0;
      for (int i = 3;i <= target;i++) {
          res = first + second;
          first = second;
          second = res;
      }
      return res;
  }
}