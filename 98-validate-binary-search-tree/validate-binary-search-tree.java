/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static boolean result;
    static boolean isFirst;
    static TreeNode prev;
    static void helper(TreeNode root)
    {
        if(root==null)
            return;
        helper(root.left);
        if(isFirst==true)
            isFirst=false;
        else
        {
            if(root.val<=prev.val)
            {
                result=false;
            }
        }
        prev=root;
        helper(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        result=true;
        isFirst=true;
        prev=null;
        helper(root);
        return result;
    }
}