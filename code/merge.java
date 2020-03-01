/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
  public ListNode Merge(ListNode list1,ListNode list2) {
      ListNode pre = new ListNode(0);
      ListNode res = pre;
      while (list1 != null && list2 != null) {
          if (list1.val < list2.val) {
              pre.next = list1;
              list1 = list1.next;
          } else {
              pre.next = list2;
              list2 = list2.next;
          }
          pre = pre.next;
      }
      while (list1 != null) {
          pre.next = list1;
          pre = pre.next;
          list1 = list1.next;
      }
      while (list2 != null) {
          pre.next = list2;
          pre = pre.next;
          list2 = list2.next;
      }
      return res.next;
  }
}