/**
 * 输入一个链表，输出该链表中倒数第k个结点
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
  public ListNode FindKthToTail(ListNode head,int k) {
      // 要求返回倒数第k个结点，这里用两个结点来获得
      ListNode phead = head;
      while (k != 1) {
          if (phead != null) {
              phead = phead.next;
              k--;
          } else {
              // 链表长度不够
              return null;
          }
      }
      // 防止 k = head.length + 1 上面无法判断到的情况
      if (phead == null) return null;
      // head和phead同时移动，phead到达尾部时，head指向倒数第k个结点
      while (phead.next != null) {
          phead = phead.next;
          head = head.next;
      }
      return head;
  }
}