/**
 * 输入一个链表，反转链表后，输出新链表的表头
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
  public ListNode ReverseList(ListNode head) {
      // 前驱结点和后驱结点三个结点，注意好边界的问题，不然容易空指针异常或死循环
      ListNode pre = null;
      ListNode next = null;
      while (head != null) {
          next = head.next;
          head.next = pre;
          pre = head;
          head = next;
      }
      return pre;
  }
}