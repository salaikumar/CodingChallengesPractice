/*
* Reverse an array without affecting special characters
* Eg: Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
*/

import java.util.*;

public class ReverseArray{
  //  Method that solves that question
  public String reverseArray(String input){
    char[] inputCharacter    = input.toCharArray();
    char[] output            = new char[inputCharacter.length];
    Stack<Character> letters = new Stack<Character>();
    // Not using  for each for a specific reason - generally for preferred
    for(int i=0; i < inputCharacter.length; ++i){
      char currentChar = inputCharacter[i];
      if (Character.isLetter(currentChar))
        letters.push(currentChar);
      else
        output[i] = currentChar; // Directly pass it to the output
    }

    // Now,pop from stack and push to output
    for (int j = 0; j < output.length ; ++j ) {
      if (output[j] == '\0')
        output[j] = letters.pop();
    }
    return new String(output);
  }
}
