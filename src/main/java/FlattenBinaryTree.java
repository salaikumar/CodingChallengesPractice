/*
*
Given a binary tree, flatten it to a linked list in-place.
For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
*/

import java.util.*;

public class FlattenBinaryTree{
  // in place buddy..how u r gonna solve it
  // there was a hint 
  public void flatten(TreeNode root) {

  }

  // without in-place
  public List<Integer> flattenExtraMemory(TreeNode root){
    List<Integer> ll = new LinkedList<Integer>();
    return makeFlat(root,ll);
  }

  private List<Integer> makeFlat(TreeNode current, List<Integer> ll){
    if (current == null) {
      return ll;
    }
    ll.add(current.val);
    makeFlat(current.left, ll);
    return makeFlat(current.right,ll);
  }





}
