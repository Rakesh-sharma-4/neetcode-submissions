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
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int remove = size -n;
        temp = head;
        ListNode res = temp;
        if(remove == 0){
            return res.next;
        }
        while(remove > 1){
            temp = temp.next;
            remove--;
        }
        temp.next = temp.next.next;
        return res;
    }
}
