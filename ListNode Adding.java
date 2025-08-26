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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Establish a dummy node and tail
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // This integer will be used to carry variables to new nodes when needed
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            // If the nodes are null, default the node value to 0
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            // Add the node values together, along with the carried integer value
            int sum = digit1 + digit2 + carry;

            // newDigit is instantiated and becomes equal to the remainder of the sum after
            // dividing by 10 
            int newDigit = sum % 10;

            // The value however, is carried to the carry integer value
            // Ex: sum = 28; 28 / 10 = 2 R8; so newDigit = 8, and carry = 2
            carry = sum / 10;

            // new Listnode is created witht the value tied as the newDigit calculated before
            ListNode newNode = new ListNode(newDigit);

            // Tail.next is given the newNode created
            tail.next = newNode;

            // Tail then becomes the newNode, and the process continues
            tail = tail.next;

            // l1 and l2 are given their next values, provided they are not already null
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        // The dummyNode created is then assigned to Result, and Dummy.next is set to null
        ListNode result = dummy.next;
        dummy.next = null;

        // Return result
        return result;
    }
}