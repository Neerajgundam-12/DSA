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
        ListNode dummy = new ListNode(45);
        ListNode dummytail = dummy;
        int a=0,b=0,c=0;
        while(l1!=null || l2!=null || c!=0) {
            a = (l1!=null)?l1.val:0;
            b = (l2!=null)?l2.val:0;
           int s = a+b+c;
            dummytail.next = new ListNode(s%10);
            dummytail = dummytail.next;
            c = s/10;
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2 = l2.next;
        }
       return dummy.next;
    }
}