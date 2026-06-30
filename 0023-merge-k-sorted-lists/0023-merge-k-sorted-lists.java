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
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists == null || lists.length==0){
        return null ;
      }
      return mergeLists(lists , 0 , lists.length-1);
    }
    private ListNode merge(ListNode list1 , ListNode list2){
      ListNode dummy = new ListNode(-1);
      ListNode tail = dummy;
      while(list1!=null && list2!= null){
        if(list1.val<=list2.val){
            tail.next = list1;
            list1 = list1.next;
        }else{
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;
      }
      if(list1!=null){
        tail.next = list1;
      }else{
        tail.next = list2;
      }
      return dummy.next;
    }
    private ListNode mergeLists(ListNode[] lists, int left, int right){
        if(left == right){
            return lists[left] ;
        }
        int mid = left+(right - left)/2;
        ListNode leftNode = mergeLists(lists,left , mid);
        ListNode rightNode = mergeLists(lists,mid+1, right);
       return merge(leftNode , rightNode);
    }
}