// Last updated: 9/14/2026, 8:39:54 PM
1class Solution {
2    public void reorderList(ListNode head) {
3
4        if (head == null || head.next == null) {
5            return;
6        }
7
8        // Find middle
9        ListNode slow = head;
10        ListNode fast = head;
11
12        while (fast != null && fast.next != null) {
13            slow = slow.next;
14            fast = fast.next.next;
15        }
16
17        // Reverse second half
18        ListNode second = slow.next;
19        slow.next = null;
20
21        ListNode prev = null;
22
23        while (second != null) {
24            ListNode next = second.next;
25            second.next = prev;
26            prev = second;
27            second = next;
28        }
29
30        second = prev;
31
32        // Merge
33        ListNode first = head;
34
35        while (second != null) {
36
37            ListNode next1 = first.next;
38            ListNode next2 = second.next;
39
40            first.next = second;
41            second.next = next1;
42
43            first = next1;
44            second = next2;
45        }
46    }
47}