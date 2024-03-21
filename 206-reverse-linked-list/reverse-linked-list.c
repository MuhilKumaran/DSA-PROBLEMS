/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    struct ListNode *prev;
    struct ListNode *nextnode;
    struct ListNode *curr;
    prev=NULL;
    nextnode=NULL;
    curr=head;
    while(curr!=NULL)
    {
        nextnode=curr->next;
        curr->next=prev;
        prev=curr;
        curr=nextnode;
    }
    return prev;
}