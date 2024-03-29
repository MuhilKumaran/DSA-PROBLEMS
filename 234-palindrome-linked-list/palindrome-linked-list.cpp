/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode *th=head;
        stack<int>s;
        while(th!=NULL)
        {
            s.push(th->val);
            th=th->next;
        }
        th=head;
        while(th!=NULL)
        {
            if(th->val != s.top())
            {
                return false;
            }
            th=th->next;
            s.pop();
        }
        return true;

    }
};