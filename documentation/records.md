# Records
- preview Java 14 and 15
- official in Java 16
- solves problem of a data class to hold immutable data fields

## Semantic meaning for using keyword 'record' is important
By creating a record you're telling the compiler, your colleagues, the whole wide world 
that this type is about data. Specifically, you intend for data that's immutable 
and transparently accessible. 

*If this semantic doesn't apply to the type you want to create, 
then you shouldn't create a record.*

Interesting article about in-depth design of record keyword in Java
https://nipafx.dev/java-record-semantics/

## Before

```java

public class Person {

    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person)) {
            return false;
        } else {
            Person other = (Person) obj;
            return Objects.equals(name, other.name)
              && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    // standard getters
}
```

## After
```java
public record Person (String name, String address) {}

```

## What you get for free
The compiler will generate for you:
- equals()
- hashCode()
- toString()
- private final fields
- public constructor

## Java Record versus Lombok methods
- records are a good solution for small classes of immutable data
- Lombok @Data and @Builder offer more options
- Lombok @Builder pattern better for objects with many fields
