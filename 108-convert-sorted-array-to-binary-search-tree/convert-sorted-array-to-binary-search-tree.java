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
    static TreeNode helper(int arr[],int l,int h)
    {
        if(l>h)
            return null;
        int mid=l+(h-l)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=helper(arr,l,mid-1);
        root.right=helper(arr,mid+1,h);
        return root;
    }
        
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        if(n==0)
            return null;
        return helper(nums,0,n-1);
    }
}