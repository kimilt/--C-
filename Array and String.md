# Array in java

An array is an object containing a **fixed number** of values of the **same type**.

```java
//Delaration
int[] anArray;

//Initialization. Its default value, here 0. When initializing an array of Object, elements are null by default.
int[] anArray = new int[10];
//OR
int[] anArray = new int[] {1, 2, 3, 4, 5};

//Access elements. We should be careful then not to use a negative index, or an index greater than or equal to the array size.
anArray[0] = 10;

//Varargs. Inside the method body, a varargs parameter turns into an array. But, we can also pass an array directly as the argument. 
void varargsMethod(String... varargs) {}

//Transforming an Array into a List
int[] anArray = new int[] {1, 2, 3, 4, 5};
List<Integer> aList = new ArrayList<>();
for (int element : anArray) {
    aList.add(element);
}

//From an Array to a Stream
String[] anArray = new String[] {"Milk", "Tomato", "Chips"};
Stream<String> aStream = Arrays.stream(anArray);
//OR
Stream<String> anotherStream = Arrays.stream(anArray, 1, 3);

//Sort arrays. The algorithms behind the sort method are quick sort and merge sort for primitive and other arrays, respectively.

//Arrays.binarySearch method
```

---

# String in java

Transforming a Char into a String: `String.valueOf()`

Appending Strings: `String1 + String2`

Getting a Character by Index: `text.charAt()`

Switch between a char and its numerical representation (ASCII): `(int) character; (char) value;`

Removing All Whitespace: `text.replaceAll("\\s+", "");`

Splitting a String: `split()`

Processing All Characters as a Stream: `text.chars();`

---

# Constants in Java

Integer.MIN_VALUE, Integer.MAX_VALUE, Long.MAX_VALUE...



---
*References*

1.[Array](https://www.baeldung.com/java-arrays-guide)

2.[String Operations](https://www.baeldung.com/java-string-operations)