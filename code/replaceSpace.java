package code;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。 例如，当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy
 */

public class Solution {
  public String replaceSpace (StringBuffer str) {
    // 先计算出空格的数量，然后从后往前替换
      // ps：从后往前：每个只需要移动一次；从前往后：每个要移动n次
      // 第一次遍历，计算出空格数量
      int spaceNum = 0; // 空格
      int i = 0; // 遍历下标
      int oldLength = str.length();
      while (i < oldLength) {
          if (str.charAt(i++) == ' ') spaceNum++;
      }
      // 对str 设置好长度，然后从后往前遍历
      int newLength = oldLength + 2 * spaceNum;
      str.setLength(newLength);
      oldLength--;
      newLength--;
      while (oldLength >= 0) {
          if (str.charAt(oldLength) == ' ') {
              str.setCharAt(newLength--,'0');
              str.setCharAt(newLength--,'2');
              str.setCharAt(newLength--,'%');
          } else {
              str.setCharAt(newLength--,str.charAt(oldLength));
          }
          oldLength--;
      }
      return str.toString();
  }
}