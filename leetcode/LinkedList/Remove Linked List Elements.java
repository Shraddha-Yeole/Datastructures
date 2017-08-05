/* 203. Remove Linked List Elements: Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5 */


public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        
        ListNode fakehead = new ListNode(-1);
        
        if(head==null){
            return head;
        }
        
        else{
            
            fakehead.next= head;
            
            ListNode temp = head;
            ListNode prev = fakehead;
            
            while(temp!= null ){
                
                if(temp.val!=val){
                    prev = temp;
                    
                }
                else{
                    prev.next = temp.next;
                }
                     
                temp = temp.next;
                
        }
            }
        
        return fakehead.next;
        
    }
}
