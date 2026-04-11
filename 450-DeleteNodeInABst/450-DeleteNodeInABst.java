// Last updated: 4/11/2026, 12:49:58 PM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.val){
            root.left =  deleteNode(root.left,key);
        }else if(key > root.val){
            root.right =  deleteNode(root.right,key);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }else{
                TreeNode sucessor = findmin(root.right);
                root.val = sucessor.val;
                root.right = deleteNode(root.right,sucessor.val);
            }
        }
        return root;
    }

    private TreeNode findmin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}