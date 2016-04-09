import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.*;
public class PalindromePartitionTest{
  @Test
  public void shouldTestPalindromePartition(){
    PalindromicPartition pp = new PalindromicPartition();
    List<String> palindrome = pp.splitForPalindrome("nitin");
    assertThat(palindrome.contains(new String("iti")),is(true));
    assertThat(palindrome.contains("itin"),is(false));

    palindrome  = pp.splitForPalindrome("geeks");
    assertThat(palindrome.contains(new String("ee")),is(true));
    assertThat(palindrome.contains("gee"),is(false));
    assertThat(palindrome.contains(new String("g e e k s ")),is(true));

  }
}
