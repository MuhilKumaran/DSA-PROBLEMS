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
    static void helper(TreeNode root,int T,int sum,List<Integer> slate,List<List<Integer>> main)
    {
        if(root==null)
            return;
        slate.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null && sum==T)
        {
            main.add(new ArrayList(slate));
        }
        helper(root.left,T,sum,slate,main);
        helper(root.right,T,sum,slate,main);
        slate.remove(slate.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int T) {
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> slate = new ArrayList<>();
        helper(root,T,0,slate,main);
        return main;
    }
}