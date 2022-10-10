# Java Streams (Java 8)

A Stream in Java can be defined as a sequence of elements from a source. 
The source of elements here refers to a Collection or Array that provides data to the Stream. 
Java streams are designed in such a way that most of the stream operations 
(called intermediate operations) return a Stream.
Terminal operations conclude the Stream.

intermediate operation
: operates on each element of the Stream and returns a Stream

terminal operation
: concludes the stream and returns an answer where an answer may be a primitive value, 
a concrete type, or a void.  terminal operations always conclude the stream and are the 
last operation in the Stream data pipeline

## Some common methods for creating a stream
- from Array
- from Collection
- stream builder
- stream generate
- stream iterate

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
### Using a Supplier and the generate method
note:  generate method takes in Supplier.  The Supplier is a functional interface, so our Lambda defines the function for the supplier.  And, we specify a limit or otherwise the generation will continue indefinately or until memory runs out


```java
Stream<Student> streamGenerated =Stream.generate(() -> new Student("Test Student", 3.5)).limit(size);
```

### Using the iterate method
note:  either choose to limit else the stream will iterate indefinately
```java
Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(max);
```

### Convert lines of file into Stream of Strings
```java
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

        Path path = Paths.get(filePath);
                Stream<String> streamWithCharset =
        Files.lines(path, Charset.forName("UTF-8"));
```