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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode prev = null;
       ListNode first = list1;
       ListNode second = list2;
       ListNode next;
       while(first!=null&& second!=null){
        if(first.val<second.val){
            next = first.next;
            first.next = prev;
            prev = first;
            first = next;
        }
        else{
            next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
       }
       while(first!=null){
        next = first.next;
        first.next = prev;
        prev = first;
        first= next;
       }
       while(second!=null){
        next = second.next;
        second.next = prev;
        prev = second;
        second = next;
       }
       ListNode fin = null;
       while(prev!=null){
        next = prev.next;
        prev.next = fin;
        fin = prev;
        prev = next;
       }
         return fin;
    }
}