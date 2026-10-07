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
    public int getDecimalValue(ListNode head) {
        int ans = 0 ;
        int counter =0;
        ListNode curr = head;
        while(curr!=null){
            counter++;
            curr = curr.next;
        }
        curr  = head;
        while(curr!=null){
          ans+=curr.val*(int)Math.pow(2,counter-1);
          counter--; 
          curr = curr.next; 
        }
         return ans;
    }
}