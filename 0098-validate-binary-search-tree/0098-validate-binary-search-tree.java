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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> alist = getList(root, new ArrayList<Integer>());
        return isValidBST(alist);
    }

    public ArrayList<Integer> getList(TreeNode root, ArrayList<Integer> alist){
        if(root == null) return alist;
        getList(root.left, alist);
        alist.add(root.val);
        getList(root.right, alist);
        return alist;
    }

    public boolean isValidBST(ArrayList<Integer> alist){

        if(alist.size() <= 1) return true;
        for(int i = 0; i < alist.size()-1; i++){
            if(alist.get(i) >= alist.get(i+1)) return false;
        }

        return true;
    }
}