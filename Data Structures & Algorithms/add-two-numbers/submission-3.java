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
        ListNode temp1 = l1;
        ListNode revL1 = temp1;
        ListNode temp2 = l2;
        ListNode revL2 = temp2;
        int sum = 0;
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        boolean carryTrue = false;
        while(revL1 != null && revL2 != null){
            sum = revL1.val + revL2.val + carry;
            carry = sum/10;
            // if(carry > 0){
            //     carryTrue = true;
            // }
            sum = sum%10;
            temp.next = new ListNode(sum);
            temp = temp.next;
            revL1 = revL1.next;
            revL2 = revL2.next;
        }
        while(revL1 != null){
            sum = revL1.val + carry;
            carry = sum/10;
            sum = sum%10;
            temp.next = new ListNode(sum);
            revL1 = revL1.next;
            temp = temp.next;
        }
        while(revL2 != null){
            sum = revL2.val + carry;
            carry = sum/10;
            sum = sum%10;
            temp.next = new ListNode(sum);
            revL2 = revL2.next;
            temp = temp.next;
        }
        if(carry > 0){
            System.out.println("carry : " + carry);
            temp.next = new ListNode(carry);
            return res.next;
        }
        res = res.next;
        return res;
    }
    public ListNode revList(ListNode head){
        System.out.println("reverse");
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}
