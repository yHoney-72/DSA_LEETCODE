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
    if(head==null|| left==right){
        return head;
    }
     ListNode temp = head;
     ListNode dummy = new ListNode(0);
     dummy.next = head;
     int i =1;
     ListNode prev = dummy;
     while(i<left){
      prev = prev.next;
      i++;
     }
     ListNode curr = prev.next;
     int j =left;
     while(j<right){
        ListNode ahead = curr.next;
        curr.next = ahead.next;
        ahead.next = prev.next;
        prev.next = ahead;
        j++;
     }
     return dummy.next;
     }
 }
