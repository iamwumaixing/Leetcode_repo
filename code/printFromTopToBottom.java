/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        // 用一个数组来存放二叉树的root结点
        ArrayList<TreeNode> list = new ArrayList<>();
        // 结果
        ArrayList<Integer> res = new ArrayList<>();
        
        if (root == null) return res;
        
        list.add(root);
        
        while (!list.isEmpty()) {
            TreeNode temp = list.remove(0);
            if (temp.left != null) list.add(temp.left);
            if (temp.right != null) list.add(temp.right);
            res.add(temp.val);
        }
        
        return res;
    }
}