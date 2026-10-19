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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode check = head;
        while(check!=null && count<k){
         check = check.next;
         count++;
        }
        if(count!=k){
            return head;
        }
        ListNode tail = head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(count>0){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
            count--;
        }
        tail.next = reverseKGroup(curr,k);
        return prev;
    }
}