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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode t1 = l1;
       ListNode t2 = l2;
       ListNode l3 = new ListNode(0);
       ListNode t3 = l3;
       int sum = 0;
       int carry =0;
       int saved = 0;
       while(t1!=null&&t2!=null){
         sum = t1.val+t2.val+carry;
         saved = sum%10;
         t3.next= new ListNode(saved);
         carry = sum/10;
         t1 = t1.next;
         t2 = t2.next;
         t3 = t3.next;
       }
        while(t1!=null){
            sum = t1.val+carry;
             saved = sum%10;
            t3.next= new ListNode(saved);
            carry =sum/10;
            t1 = t1.next;
            t3 = t3.next;
        }
        while(t2!=null){
            sum = t2.val+carry;
            saved = sum%10;
            t3.next = new ListNode(saved);
            carry =sum/10;
            t2 = t2.next;
            t3 = t3.next;
        }
        if (carry > 0) {
        t3.next = new ListNode(carry);
        }
       return l3.next;
    }
}