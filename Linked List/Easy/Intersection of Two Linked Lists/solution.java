/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        int s1 = 0;
        while(t1!=null){
            t1 = t1.next;
            s1++;
        }


        ListNode t2 = headB;
        int s2 = 0;
        while(t2!=null){
            t2 = t2.next;
            s2++;
        }

        int diff = Math.abs(s1-s2);
        t1 = headA;
        t2 = headB;

        if(s1>s2){
            while(diff>0){
                t1 = t1.next;
                diff--;
            }
        }else{
            while(diff>0){
                t2 = t2.next;
                diff--;
            }
        }
        while(t1!=null && t2!=null){
            if(t1 == t2){
                return t1;
            }
            t1 = t1.next;
            t2 = t2.next;
        } 
        return null;
    }
}