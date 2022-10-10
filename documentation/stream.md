# Java Streams

## Methods for creating a stream

### From a collection
```java

Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();
```

### From an Array
```java
String[] arr = new String[]{"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
```

### Using a  builder
While using a Collectiono or an Array to build a stream, use of the builder uses an internal data structure (called SpinedBuffer) that is optimized for insertions with no ability for removal.
```java
        Student jackie = new Student("Jackie", 3.75);
        Student kyle = new Student("Kyle", 2.8);
        Student bob = new Student("Bob", 4.0);
        Student diana = new Student("Diana", 3.92);
        Student ralph = new Student("Ralph", 1.7);

        Stream<Student> streamResult =
                Stream.<Student>builder()
                        .add(jackie)
                        .add(kyle)
                        .add(bob)
                        .add(diana)
                        .add(ralph)
                        .build();
```
