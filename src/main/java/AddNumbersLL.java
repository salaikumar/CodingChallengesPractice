/*
* You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

import java.util.*;

public class AddNumbersLL{

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sum = null, traversal = null;
    int carry = 0, value = 0;
    while(true){

      // end point
       if (l1 == null || l2 == null) {
         break;
       }

       // sum value calculation at each point
       value = l1.val + l2.val + carry;

       //  carry and final value calculation
       if (value >= 10) {
          carry = 1;
          value = value % 10;
       }
       else
        carry =0;

      // Output Sum value lined list
       if (sum == null) {
         sum = new ListNode(value);
         traversal = sum;
       }else{
         traversal.next = new ListNode(value);
         traversal = traversal.next;
       }

       // move next at source linked lists
       l1 = l1.next;
       l2 = l2.next;
    }
    // find the linkedlist having more elements
    ListNode traversal2 =  (l1 != null) ? l1 : l2 ;

    // add those to the sum linkedlist as well
    while ( traversal2 != null ) {
       value = carry + traversal2.val;
       if (value >= 10) {
          carry = 1;
          value = value % 10;
       }
       else
        carry =0;
       traversal.next = new ListNode(value);
       traversal2 = traversal2.next;
       traversal = traversal.next;
    }

    // Check if carry is > 0, if so, just add carry as well to the new list
    if (carry > 0) {
      traversal.next = new ListNode(carry);
    }

    return sum;
  }
}
