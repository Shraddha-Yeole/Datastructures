/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
 
    
void Print(Node head) {
  
   if(head==null || head.next==null)
    return;
    else{
        Node temp = head;
        while(temp!=null){
        System.out.println(temp.data);
        temp = temp.next;
    }  
}
}
