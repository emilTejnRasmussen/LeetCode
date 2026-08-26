void main()
{
    ListNode head1 = new ListNode(1);
    ListNode head2 = new ListNode(1);

    head1.next = new ListNode(2);
    head1.next.next = new ListNode(4);

    head2.next = new ListNode(3);
    head2.next.next = new ListNode(4);

    Solution solution = new Solution();

    ListNode result = solution.mergeTwoLists(head1, head2);
    result.printList();
}