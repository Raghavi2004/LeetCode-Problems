/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Create a dummy node
        ListNode dummy = new ListNode(-1);

        // Tail pointer to build the merged list
        ListNode tail = dummy;

        // Compare both lists until one becomes empty
        while (list1 != null && list2 != null) {

            // If list1 value is smaller (or equal)
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }
            // Otherwise take node from list2
            else {
                tail.next = list2;
                list2 = list2.next;
            }

            // Move the tail forward
            tail = tail.next;
        }

        // Attach remaining nodes from list1
        if (list1 != null) {
            tail.next = list1;
        }

        // Attach remaining nodes from list2
        if (list2 != null) {
            tail.next = list2;
        }

        // Return the merged list
        return dummy.next;
    }
}