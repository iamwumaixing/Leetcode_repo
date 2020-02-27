/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */

public class Solution {
  public double Power(double base, int exponent) {
      // exponent可能是正数也可能是负数,两种情况要分开考虑
      if (exponent > 0) {
          return getNum(base,exponent);
      }
      if (exponent < 0) {
          exponent *= -1;
          return 1 / getNum(base,exponent);
      }
      return 1;
  }
  
  // 得到某个数的exponent次方
  private double getNum(double base,int exponent) {
      if (exponent == 1) {
          return base;
      } else {
          return base * getNum(base,exponent - 1);
      }
  }
}