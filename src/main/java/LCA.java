
/*
* Least Common Ancestor of a Binary Search tree
*/

import java.util.*;

public class LCA{
  /*
  * Get the path to the nodes and put it in seperate Stack
  * Now, pop from the Stack and compare
  */
  public TreeNode lca(TreeNode root, TreeNode first, TreeNode second){
    if(root == null)
      return null;

    if (root.val > first.val && root.val > second.val) {
      return lca(root.left,first,second);
    }

    if(root.val < first.val && root.val < second.val){
      return lca(root.right, first, second);
    }

    return root;
  }
}
