/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */

public class Solution {
  public void reOrderArray(int [] array) {
      // 类似冒泡排序的办法，找到奇数向右排序
      int i = 0;
      while (i < array.length) {
          // 如果是奇数，向前冒泡
          if (!isEven(array[i])) {
              // i > 0，并且前一位是偶数，则向前替换
              while (i > 0 && isEven(array[i - 1])) {
                  int temp = array[i - 1];
                  array[i - 1] = array[i];
                  array[i] = temp;
                  i--;
              }
              // 移动到最左后，那个位置就不需要再动了
              i++;
          } else {
              // 如果是偶数，指针后移
              i++;
          }
      }
  }
  
  // 判断偶数奇数的函数
  private boolean isEven(int num) {
      if (num % 2 == 0) return true;
      return false;
  }
}