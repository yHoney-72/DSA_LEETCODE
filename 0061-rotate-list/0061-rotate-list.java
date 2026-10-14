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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(length ==0){
            return head;
        }
       int rem = k%length;
       if(head==null|| head.next==null||rem==0){
        return head;
       }
       int x = length-rem;
       temp = head;
       int index =1;
        while(temp!=null && x>index){
            temp = temp.next;
            index++;
        }
         ListNode temp2 = temp.next;
        temp.next = null;
        ListNode temp3 = temp2;
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        temp3.next = head;
        return temp2;
    }
}