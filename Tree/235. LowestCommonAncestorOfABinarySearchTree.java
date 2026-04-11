// Last updated: 4/11/2026, 12:50:35 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(p.val < root.val && q.val < root.val){
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            return left;
        }else if(p.val > root.val && q.val > root.val){
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            return right;
        }
        return root;
    }
}