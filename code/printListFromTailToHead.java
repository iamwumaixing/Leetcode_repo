/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead (ListNode listNode) {
        // 利用栈先入后出实现
        Stack<Integer> stack = new Stack<>();
        // result
        ArrayList<Integer> res = new ArrayList<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            res.add(stack.pop());
        }
        return res;
    }
}