# TreeMap in Java

TreeMap is a map implementation that keeps its entries sorted according to the natural ordering (ascending order and for strings, alphabetical order) of its keys or better still using a comparator if provided by the user at construction time.

TreeMap implements NavigableMap interface and bases its internal working on the principles of red-black trees.

First of all, a red-black tree is a data structure that consists of nodes.
The rule is that starting from the root, any element in the left branch of any node is always less than the element in the node itself. Those on the right are always greater. 

Secondly, a red-black tree is a self-balancing binary search tree. This attribute and the above guarantee that basic operations like search, get, put and remove take logarithmic time O(log n).

