# day1

## Problem solved: 1
---
### Hashmap in Java 

A class very similar to HashMap is Hashtable and both are collections that implement the Map interface. Also, the put(), get(), remove(), and containsKey() methods provide constant-time performance O(1).

1. Hashtable is thread-safe
2. Hashtable doesn't allow null at all
3. HashMap uses Iterator to iterate over values, whereas Hashtable has Enumerator for the same.

The Iterator is a fail-fast iterator. In other words, it throws a ConcurrentModificationException when the underlying collection is modified while iterating. Let's see the example of fail-fast:
```java
HashMap<String, String> map = new HashMap<String, String>();
map.put("key1", "value1");
map.put("key2", "value2");

Iterator<String> iterator = map.keySet().iterator();
while(iterator.hasNext()){ 
    iterator.next();
    map.put("key4", "value4");
}
```
This throws a ConcurrentModificationException exception because we are calling put() while iterating over the collection.

4. We should use HashMap for an unsynchronized or single threaded application.

It is worth mentioning that since JDK 1.8, Hashtable has been deprecated. However, ConcurrentHashMap is a great Hashtable replacement. We should consider ConcurrentHashMap to use in applications with multiple threads.

One might ask why not simply add the value to a list. Why do we need a HashMap? The simple reason is performance. If we want to find a specific element in a list, the time complexity is O(n) and if the list is sorted, it will be O(log n) using, for example, a binary search.

```java
//Create a HashMap(example)
Map<Type1, Type2> hashMapName = new HashMap<>();

//Add an entry to the HashMap
hashMapName.put(key, value);
//Note: If an existing key is passed then the previous value gets replaced by the new value. If a new pair is passed, then the pair gets inserted as a whole.

//Retrieve a value from the map by its key, if we insert a second value with the same key, we'll only get the last inserted value for that key. HashMap also allows us to have null as a key
Type2 xxx = hashMapName.get(key);
hashMapName.put(null, value);

//Remove a key-value mapping
hashMapName.remove(key);

//Check If a Key or Value Exists in the Map. Return boolean. Importantly, the complexity to check if a key exists is O(1), while the complexity to check for an element is O(n), as it's necessary to loop over all the elements in the map.
hashMapName.containsKey(key);
hashMapName.containsValue(value);

//Other functions provided: keySet(); getKey(); getValue(); entrySet();
for(Map.Entry<Type1, Type2> entry : hashMapName.entrySet()) {
    //do something with the entry
}
//OR iterate over all values:
List<Type2> values = new ArrayList<>(hashMapName.values());
```
**We can use any class as the key in our HashMap. However, for the map to work properly, we need to provide an implementation for equals() and hashCode().** Examples shown in the ref2.

getOrDefault()
Using the getOrDefault() method, we can get a value from the map or return a default element in case there is no mapping for the given key

putIfAbsent()
With this method, we can add a new mapping, but only if there is not yet a mapping for the given key

merge(), compute()
Modify the value for a given key if a mapping exists, or add a new value otherwise. It's worth noting that the methods merge() and compute() are quite similar. The compute() method accepts two arguments: the key and a BiFunction for the remapping. And merge() accepts three parameters: the key, a default value to add to the map if the key doesn't exist yet, and a BiFunction for the remapping.

### HashMap Internals

Value are stored in so-called buckets. The structure of buckets is list or balanced trees if a bucket contains 8 or more values.

Default capacity is 16 and load factor is 0.75. If the threshold is reached, the capacity is doubled.







---
*References*

1.[Differences Between HashMap and Hashtable](https://www.baeldung.com/hashmap-hashtable-differences)

2.[hashMap](https://www.baeldung.com/java-hashmap)