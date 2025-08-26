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
    public ListNode swapPairs(ListNode head) {
        // If there is 1 node or fewer in the list, there is nothing to swap
        // Return head
        if(head == null || head.next == null)
            return head;

        // Otherwise, establish a dummy node to put at the beginning of the list,
        // this will make the swapping easier for us
        ListNode dummy = new ListNode(0, head);

        // Instantiate prevNode & currNode to point to dummy and head respectively
        ListNode prevNode = dummy;
        ListNode currNode = head;

        // The loop will continue until either currNode or currNode.next is null
        while(currNode != null && currNode.next != null){
            // prevNode needs to point to whatever currNode was pointing to
            prevNode.next = currNode.next;

            // currNode now needs to point to whatever node the next node was pointing to
            currNode.next = prevNode.next.next;

            // the value after prevNode needs to point to currNode
            prevNode.next.next = currNode;

            // The nodes iterate forward
            prevNode = currNode;
            currNode = currNode.next;
        }

        // return the node after dummy
        return dummy.next;

    }
}