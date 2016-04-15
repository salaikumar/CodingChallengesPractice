/*
* Problems on Ordered Statistics on BST
*/

import java.util.*;

public class OrderStatistics{

  private List<TreeNode> inOrderTraversalList = new ArrayList<TreeNode>();
  /*
  * Finding the Kth Smallest element in a BST
  */
  public int kthSmallest(TreeNode root, int k) {
    inOrderTraversal(root);
    return inOrderTraversalList.get(k-1).val;
  }

  public void inOrderTraversal(TreeNode root){
    if (root == null) {
        return ;
    }
    inOrderTraversal(root.left);
    inOrderTraversalList.add(root);
    inOrderTraversal(root.right);
  }
}
