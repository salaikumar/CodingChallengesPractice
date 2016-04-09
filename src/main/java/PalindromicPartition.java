/*
Given a string, find all possible palindromic partitions of given string.
Example
input : nitin
Output : n iti n
         n i t i n
         nitin

input geeks
Output : g e e k s
        g ee k s
*/
import java.util.*;

public class PalindromicPartition{
  public List<String> splitForPalindrome(String input){
    List<String> palindromeList = new ArrayList<String>();
    if ((input == null) || (input.length() == 1)){
      palindromeList.add(input);
      return palindromeList;
    }
    char[] inputCharacters = input.toCharArray();
    // All individual characters in the given string formspalindrome
    StringBuilder palinWords = new StringBuilder();
    for ( char c : inputCharacters ) {
      palinWords.append( c + " ");
    }
    palindromeList.add(new String(palinWords));

    for (int i=0; i < inputCharacters.length ; ++i ) {
      for (int j = inputCharacters.length-1; j > i; --j ) {
        int start = i;
        int end   = j;
        while(true){
          if ( inputCharacters[start] == inputCharacters[end] ) {
            if( ( start == end ) || ( end == start + 1 ) ) { // palindrome length can be even and odd
              palindromeList.add(input.substring(i,j+1)); // inclusive, exclusive
              break;
            }
            start++;
            end--;
          }
          else
            break; // At any point no match, break;
        }
      }
    }
    return palindromeList;
  }
}
