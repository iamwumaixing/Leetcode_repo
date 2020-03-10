/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

public class Solution {
  public boolean VerifySquenceOfBST(int [] sequence) {
      if (sequence == null || sequence.length == 0) return false;
      if (sequence.length == 1) return true;
      return ju(sequence, 0, sequence.length - 1);
  }
  
  boolean ju(int [] a,int start,int root) {
      if (start > root) return true;
      int i = start;
      // 寻找比root小的数
      while (a[i] < a[root] && i < root) {
          i++;
      }
      // i 到 root的数应该是比root大的
      int j = i;
      for (;j < root;j++) {
          if (a[j] < a[root]) return false;
      }
      return ju(a, start, i - 1) && ju(a, i, j - 1);
  }
  
}