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
    
    static boolean getPath(TreeNode root,List<Integer> li,int sum,int tar)
    {
        if(root!=null)
        {
            sum+=root.val;
            if(root.left==null && root.right==null && sum==tar)
            {
                return true;
            }
            return getPath(root.left,li,sum,tar) || getPath(root.right,li,sum,tar);
        }
        return false;
        

    }


    public boolean hasPathSum(TreeNode root, int tar) {
        List<Integer> li = new ArrayList<>();
        
        
        return getPath(root,li,0,tar);
    }
}