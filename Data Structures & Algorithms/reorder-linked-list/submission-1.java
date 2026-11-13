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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list2 = slow.next;
        slow.next = null;
        ListNode list1 = head;
        // reverse second list
        ListNode curr = list2;
        ListNode prev = null;
        while(curr != null){
            ListNode  temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
        }
        list2 = prev;

        while(list1 != null && list2 != null){
            ListNode next1 = list1.next;
            ListNode next2 = list2.next;

            list1.next = list2;
            list2.next = next1;

            list1 = next1;
            list2 = next2;
        }
    }
}
