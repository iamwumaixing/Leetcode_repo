/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */

public class Solution {
  public int RectCover(int target) {
      // 非法判断
      if (target < 1) return 0;
      // 这题其实也是斐波那契数列
      if (target == 1 || target == 2) {
          return target;
      } else {
          return RectCover(target - 1) + RectCover(target - 2);
      }
  }
}