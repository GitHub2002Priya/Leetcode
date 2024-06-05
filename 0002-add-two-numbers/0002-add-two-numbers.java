/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
//         public ListNode reverseList(ListNode head) {
//         ListNode current=head;
//         ListNode prev=null;
//         ListNode next=null;
//         while(current!=null){
//    next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         }
//         head = prev;
//         return head;
//     }
//    public int digit(LisNode head ){

//    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1.head=reverseList(l1.head);
        // l2.head=reverseList(l2.head);

    ListNode result = new ListNode(0);
    ListNode ptr = result;

    int carry = 0;    // Set default carry

    while (l1 != null || l2 != null) {

      int sum = 0 + carry;    // Initialize sum

      if (l1 != null) {    // Use number from first list
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {    // Use number from 2nd list
        sum += l2.val;
        l2 = l2.next;
      }

      carry = sum / 10;    // Get sum and carry
      sum = sum % 10;
      ptr.next = new ListNode(sum);
      ptr = ptr.next;
    }

    if (carry == 1) ptr.next = new ListNode(1);

    return result.next;
  }
}