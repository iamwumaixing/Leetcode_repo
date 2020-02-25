/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Solution {
  public boolean Find(int target, int [][] array) {
      // int [row][line]
      // 非法判断
      if (array == null || array.length == 0) return false;
      // 行数下标
      int row = 0;
      // 列数下标
      int line = array[0].length - 1;
      // 矩阵的右上角int[0][length-1]和target开始比较，小于target，row+1，大于target，line-1
      while (row < array.length && line >= 0) {
          int co = array[row][line];
          if (co == target) return true;
          if (co > target) line--;
          if (co < target) row++;
      }
      return false;
  }
}