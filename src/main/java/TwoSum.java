/*
*  Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.*;

public class TwoSum{
  // Solution using a hash table
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    int[] indices = new int[2];
    for (int i = 0; i < nums.length ; ++i ) {
        if (map.containsKey(nums[i])) {
          indices[0] = map.get(nums[i]);
          indices[1] = i;
          break;
        }
        int difference = target - nums[i];
        map.put(difference, i);
    }
    return indices;
  }
}
