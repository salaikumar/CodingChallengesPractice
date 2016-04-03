
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class QueueUsingStackTest{
  @Test
  public void shouldTestQueueOperations(){
    QueueUsingStack<Integer> queue = new QueueUsingStack<Integer>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    assertEquals(queue.size(), 5);
    assertThat(queue.deque(), is(1));
    assertEquals(queue.size(), 4);
  }


}
