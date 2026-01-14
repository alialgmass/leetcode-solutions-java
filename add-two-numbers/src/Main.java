//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Solution solution = new Solution();

    // Test Case 1
    ListNode l1 = LinkedListUtils.buildList(new int[]{2,4,3});
    ListNode l2 = LinkedListUtils.buildList(new int[]{5,6,4});
    ListNode result1 = solution.addTwoNumbers(l1, l2);
    System.out.print("Test Case 1: ");
    LinkedListUtils.printList(result1); // Expected: 7 -> 0 -> 8

    // Test Case 2
    ListNode l3 = LinkedListUtils.buildList(new int[]{0});
    ListNode l4 = LinkedListUtils.buildList(new int[]{0});
    ListNode result2 = solution.addTwoNumbers(l3, l4);
    System.out.print("Test Case 2: ");
    LinkedListUtils.printList(result2); // Expected: 0

    // Test Case 3
    ListNode l5 = LinkedListUtils.buildList(new int[]{9,9,9,9,9,9,9});
    ListNode l6 = LinkedListUtils.buildList(new int[]{9,9,9,9});
    ListNode result3 = solution.addTwoNumbers(l5, l6);
    System.out.print("Test Case 3: ");
    LinkedListUtils.printList(result3); // Expected: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1

}
