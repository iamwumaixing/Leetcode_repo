/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
  public ListNode deleteDuplication(ListNode pHead)
  {
      // 使用两个指针去解决问题
      ListNode pre = new ListNode(0);
      pre.next = pHead;
      ListNode res = pre;
      
      while (pHead != null) {
          if (pHead.next != null && pHead.val == pHead.next.val) {
              while (pHead.next != null && pHead.val == pHead.next.val) {
                  pHead = pHead.next;
              }
              pre.next = pHead.next;
              pHead = pHead.next;
          } else {
              pHead = pHead.next;
              pre = pre.next;
          }
      }
      
      return res.next;
  }
}