/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
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