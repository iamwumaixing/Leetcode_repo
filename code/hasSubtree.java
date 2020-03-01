/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
      if (root1 == null || root2 == null) return false;
      boolean res = false;
      // 如果相当则调用比较函数
      if (root1.val == root2.val) {
          res = HasSub(root1,root2);
      }
      // 不相等，看left是否相等
      if (!res) {
          res = HasSubtree(root1.left,root2);
      }
      // left不相等，看right是否相等
      if (!res) {
          res = HasSubtree(root1.right,root2);
      }
      return res;
  }
  
  private boolean HasSub(TreeNode root1,TreeNode root2) {
      // root2比较完成，返回true
      if (root2 == null) return true;
      if (root1 == null) return false;
      if (root1.val != root2.val) return false;
      return HasSub(root1.left,root2.left) && HasSub(root1.right,root2.right);
  }
}