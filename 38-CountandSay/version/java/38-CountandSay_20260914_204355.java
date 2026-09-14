// Last updated: 9/14/2026, 8:43:55 PM
1import java.util.*;
2
3class LRUCache {
4
5    private class Node {
6        int key;
7        int value;
8        Node prev;
9        Node next;
10
11        Node(int key, int value) {
12            this.key = key;
13            this.value = value;
14        }
15    }
16
17    private int capacity;
18    private HashMap<Integer, Node> map;
19
20    private Node head;
21    private Node tail;
22
23    public LRUCache(int capacity) {
24
25        this.capacity = capacity;
26        map = new HashMap<>();
27
28        head = new Node(0, 0);
29        tail = new Node(0, 0);
30
31        head.next = tail;
32        tail.prev = head;
33    }
34
35    public int get(int key) {
36
37        if (!map.containsKey(key)) {
38            return -1;
39        }
40
41        Node node = map.get(key);
42
43        remove(node);
44        add(node);
45
46        return node.value;
47    }
48
49    public void put(int key, int value) {
50
51        if (map.containsKey(key)) {
52            remove(map.get(key));
53        }
54
55        Node node = new Node(key, value);
56        map.put(key, node);
57        add(node);
58
59        if (map.size() > capacity) {
60
61            Node lru = head.next;
62
63            remove(lru);
64            map.remove(lru.key);
65        }
66    }
67
68    private void add(Node node) {
69
70        Node last = tail.prev;
71
72        last.next = node;
73        node.prev = last;
74
75        node.next = tail;
76        tail.prev = node;
77    }
78
79    private void remove(Node node) {
80
81        node.prev.next = node.next;
82        node.next.prev = node.prev;
83    }
84}