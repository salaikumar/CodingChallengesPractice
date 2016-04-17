import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;

public class AddNumbersLLTest{

  @Test
  public void shouldTestAddTwoNumbers(){

    // l1.
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(5);

    ListNode l2 = new ListNode(9);
    l2.next = new ListNode(9);
    l2.next.next = new ListNode(6);
    l2.next.next.next = new ListNode(9);
    l2.next.next.next.next = new ListNode(1);


    ListNode expected = new ListNode(1);
    expected.next = new ListNode(4);
    expected.next.next = new ListNode(2);
    expected.next.next.next = new ListNode(0);
    expected.next.next.next.next = new ListNode(2);

    AddNumbersLL ts = new AddNumbersLL();
    ListNode output = ts.addTwoNumbers(l1,l2);

    while( output != null){
      assertThat(output.val,is(expected.val));
      output = output.next;
      expected = expected.next;
    }
  }
}
