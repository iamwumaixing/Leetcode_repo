/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
  public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
      return reCon(pre,0,pre.length-1,in,0,in.length-1);
  }
  // 递归重建 每次寻找根节点
  private TreeNode reCon (int [] pre,int leftPre,int rightPre,int [] in,int leftIn,int rightIn) {
      // 退出条件
      if (leftPre > rightPre || leftIn > rightIn) return null;
      // 根节点
      TreeNode root = new TreeNode(pre[leftPre]);
      
      // 寻找左右root结点
      for (int i = leftIn;i <= rightIn;i++) {
          if (in[i] == pre[leftPre]) {
              root.left = reCon(pre,leftPre+1,(i-leftIn)+leftPre,in,leftIn,i-1);
              root.right = reCon(pre,(i-leftIn)+leftPre+1,rightPre,in,i+1,rightIn);
          }
      }
      return root;
  }
}