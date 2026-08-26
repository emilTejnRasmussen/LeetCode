void main()
{
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(3);

    Solution solution = new Solution();
    ListNode result = solution.deleteDuplicates(head);

    printList(result);
}

private void printList(ListNode head)
{
    ListNode current = head;

    while (current != null)
    {
        System.out.print(current.val + " ");

        current = current.next;
    }
}