// Last updated: 9/14/2026, 8:42:14 PM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3
4        ListNode smallDummy = new ListNode(0);
5        ListNode largeDummy = new ListNode(0);
6
7        ListNode small = smallDummy;
8        ListNode large = largeDummy;
9
10        while (head != null) {
11
12            if (head.val < x) {
13                small.next = head;
14                small = small.next;
15            } 
16            else {
17                large.next = head;
18                large = large.next;
19            }
20
21            head = head.next;
22        }
23
24        large.next = null;
25        small.next = largeDummy.next;
26
27        return smallDummy.next;
28    }
29}