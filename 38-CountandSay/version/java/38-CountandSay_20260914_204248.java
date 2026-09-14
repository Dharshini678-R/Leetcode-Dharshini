// Last updated: 9/14/2026, 8:42:48 PM
1import java.util.*;
2
3class Solution {
4    public Node copyRandomList(Node head) {
5
6        if (head == null) {
7            return null;
8        }
9
10        HashMap<Node, Node> map = new HashMap<>();
11
12        Node current = head;
13
14        while (current != null) {
15            map.put(current, new Node(current.val));
16            current = current.next;
17        }
18
19        current = head;
20
21        while (current != null) {
22
23            Node copy = map.get(current);
24
25            copy.next = map.get(current.next);
26            copy.random = map.get(current.random);
27
28            current = current.next;
29        }
30
31        return map.get(head);
32    }
33}