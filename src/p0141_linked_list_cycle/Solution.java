package p0141_linked_list_cycle;

import common.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode h1 = head;
        ListNode h2 = head;

        while (h2 != null && h2.next != null) {
            h1 = h1.next;
            h2 = h2.next.next;
            if (h1 == h2) return true;
        }
        return false;
    }
}