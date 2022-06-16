# HashSet in Java

- It stores unique elements and permits nulls
- It's backed by a HashMap
- It doesn't maintain insertion order
- It's not thread-safe

Note that this internal HashMap gets initialized when an instance of the HashSet is created:

```java
public HashSet() {
    map = new HashMap<>();
}
```

**Commonly used methods:**

```java
//The method contract states that an element will be added only when it isn't already present in a set. If an element was added, the method returns true, otherwise – false. Implementation details illustrate how the HashSet works internally and leverages the HashMap's put method
public boolean add(E e) {
    return map.put(e, PRESENT) == null;
}
contains(); //check if an element is present
remove();
clear();
size();
isEmpty();
```
iterator()

The elements are visited in no particular order and iterators are fail-fast. If the set is modified at any time after the iterator is created in any way except through the iterator's own remove method, the Iterator throws a ConcurrentModificationException.







---
*References*

1.[hashSet](https://www.baeldung.com/java-hashset)