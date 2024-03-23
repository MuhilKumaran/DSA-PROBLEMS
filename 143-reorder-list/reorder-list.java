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
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            l1.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int i=0;
        int j=l1.size()-1;
        while(i<=j)
        {
            l2.add(l1.get(i));
            l2.add(l1.get(j));
            i++;
            j--;
        }
        int k=0;
        while(temp!=null)
        {
            temp.val=l2.get(k);
            k++;
            temp=temp.next;
        }
    }
}