/* Reverse a singly linked list.
Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both? */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode temp = null, prev =null;
        
        if(head== null || head.next == null){
            return head;
        }
        
        while(head.next!=null){
            temp=prev;
            prev=head;
            head=head.next;
            prev.next=temp;
        }
        head.next= prev;
        return head;
        
}
}
