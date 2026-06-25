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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int len = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        } 

        int stepToMove = len - n;

        curr = dummy;

        for(int i = 0; i < stepToMove; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}
