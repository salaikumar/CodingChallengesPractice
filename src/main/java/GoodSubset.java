/*
* Problem Statement source - Hacker Earth.
* I would like to solve more problems on Hacker earth since they always post more
* Hiring challenges
*
* Given an Array of elements, Find a good subset.
* A Subset is considered to be good, if for any pair of elements within the subset,
* one of them is divisible by the other
Constraints:
1≤N≤103 (to the power of)
1≤A[i]≤109 (to the power of)
*/

import java.io.*;
import java.util.*;
public class GoodSubset{
  /*
  * Get the Array.
  * Find multiples of an element
  */
  public int findGoodSubSet(int[] inputArray){
    int maxCount = 0;
    int currentCount = 0;
    HashMap<Integer,Boolean> elementCheck = new HashMap<Integer, Boolean>();
    for (int i = 0; i < inputArray.length-1 ; ++i ) {
      if (elementCheck.containsKey(inputArray[i])) {
        continue;
      }
      currentCount = 0;
      elementCheck.put(inputArray[i],true);
      for (int j = i+1; j < inputArray.length ; ++j ) {
        int lowNumber  = inputArray[i] < inputArray[j] ? inputArray[i] : inputArray[j];
        int highNumber = inputArray[i] > inputArray[j] ? inputArray[i] : inputArray[j];
        if (highNumber % lowNumber == 0 ) {
          ++currentCount;
          elementCheck.put(inputArray[j],true);
        }
      }
      currentCount++;
      // Update the global values
      if (currentCount > maxCount) {
        maxCount = currentCount;
      }
    }
    return maxCount;
  }
}
