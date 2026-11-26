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
    public ListNode partition(ListNode head, int x) {

        ListNode newHead = new ListNode(-1);
        ListNode tail = newHead;

        ListNode temp = head;
        //first element smaller than x
        while(temp!=null){

            if(temp.val<x){
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            temp = temp.next;
        }
        //rest temp
        temp = head;
        while(temp!=null){
            if(temp.val>=x){
                tail.next = new ListNode(temp.val);
                tail = tail.next;
            }
            temp = temp.next;
        }
        return newHead.next;
    }
}