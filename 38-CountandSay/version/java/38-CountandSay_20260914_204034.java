// Last updated: 9/14/2026, 8:40:34 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        while (head != null) {
10
11            if (head.next != null &&
12                head.val == head.next.val) {
13
14                int value = head.val;
15
16                while (head != null && head.val == value) {
17                    head = head.next;
18                }
19
20                prev.next = head;
21
22            } else {
23                prev = head;
24                head = head.next;
25            }
26        }
27
28        return dummy.next;
29    }
30}