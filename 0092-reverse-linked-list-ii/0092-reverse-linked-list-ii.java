/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head==null|| left ==right){
                  return head;
       }
          int pos = 1;
         ListNode curr = head;
         ListNode start = head;
         while(pos < left - 1){
             start = start.next;
             pos++;
         }
         
         ListNode l;
         if(left == 1){
             l = head;
         }else{
             l = start.next;
         }
         
         ListNode r = l;
         for(int i = left; i < right; i++){
             r = r.next;
         }
         
         
         ListNode end = r.next;
         r.next = null;
         ListNode stLeft = l;
         ListNode prev = null;
          while(stLeft!=null){
            ListNode next = stLeft.next;
            stLeft.next = prev;
            prev = stLeft;
            stLeft = next;
          }
          if(left==1){
            l.next = end;
            return prev;
          }
          start.next = prev;
           l.next = end;
           return head;
        }
 }
