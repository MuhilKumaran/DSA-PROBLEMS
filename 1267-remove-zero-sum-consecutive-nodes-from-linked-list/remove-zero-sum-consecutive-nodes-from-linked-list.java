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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode tempHead =new ListNode(0,head);
        ListNode start = tempHead;
        while(start!=null)
        {
            ListNode end=start.next;
            int preSum=0;
            while(end!=null)
            {
                preSum+=end.val;
                if(preSum==0)
                    start.next=end.next;
                end=end.next;
            }
            start=start.next;
        }
        return tempHead.next;
    


    }
}