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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // If either of the lists is null, return the other
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }

        // Establish a dummy node, this will serve as the first node in the list
        ListNode dummy = list1;

        // If list2's first val is less than list1's, dummy becomes list2's first value, and list2
        // then points to it's next value. Otherwise, it remains as list1's first value, and list1
        // then points to it's next value
        if(list2.val < list1.val){
            dummy = list2;
            list2 = list2.next;
        }
        else{
            list1 = list1.next;
        }

        // Establisha  new listNode and set it equal to dummy, this will be used to show where the nodes
        // need to be placed in respect to the list
        ListNode curr = dummy;

        // Iterate over both list pointers until one of them is null
        while(list1 != null && list2 != null){

            
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }
            else{
                curr.next = list1;
                list1 = list1.next;
            }

            curr = curr.next;
        }

        if(list1 == null){
            curr.next = list2;
        }
        else
            curr.next = list1;

        return dummy;
    }
}