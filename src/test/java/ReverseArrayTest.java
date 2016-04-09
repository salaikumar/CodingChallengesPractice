
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReverseArrayTest{
    @Test
    public void shouldTestReverseArray(){
      ReverseArray ra = new ReverseArray();
      assertThat(ra.reverseArray("a,b$c"),is(new String("c,b$a")));
    }
}
