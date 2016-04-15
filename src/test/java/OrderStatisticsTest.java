import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class OrderStatisticsTest{

  @Test
  public void shouldTestKthElementBST(){

    // Let's try it for a Binary Search Tree.
    TreeNode root = new TreeNode(7);
    root.left = new TreeNode(5);
    root.right = new TreeNode(9);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(6);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(10);

    OrderStatistics os  = new OrderStatistics();
    assertThat(os.kthSmallest(root, 4),is(7));
    assertThat(os.kthSmallest(root, 7),is(10));
  }
}
