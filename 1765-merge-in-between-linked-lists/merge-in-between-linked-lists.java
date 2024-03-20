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
    public ListNode mergeInBetween(ListNode l1, int a, int b, ListNode l2) {
        ListNode temp1=l1;
        int c=1;
        while(c<a)
        {
            temp1=temp1.next;
            c++;
        }
        ListNode temp2=l1;
        c=0;
        while(c<=b)
        {
            temp2=temp2.next;
            c++;
        }
        temp1.next=l2;
        temp1=l2;
        while(temp1.next!=null)
        {
            temp1=temp1.next;
        }
        temp1.next=temp2;
        return l1;
    }
}