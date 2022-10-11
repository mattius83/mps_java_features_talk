# Default Methods in Interfaces
Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary compatibility with code written for older versions of those interfaces.

Suppose there is an existing interface, but we desire to add some
new methods to this interfaces. 
If we add them to the original interface, then other programmers who have 
implemented those interfaces would have to rewrite their implementations. 
If they add them as static methods, then programmers may regard them 
as utility methods, not as essential, core methods.

## An Example
```java
public interface IAnimal {
    public void sleep(int hours);

    public void walk();

    public void run();

    default void migrate(int miles) {
        System.out.println("I am not going anywhere... I like it right here");
    }
}
```
## Difference between interface with default and abstract class
After the introduction of default methods in Java 8, it seems that interfaces 
and abstract classes are very similar but they both are still very 
much different concepts in Java. 

### Abstract Class
An abstract class can hold the state of an object. 
It can have constructors and member variables. Whereas interfaces with 
default methods cannot hold state and it can neither have constructors 
nor member variables.

You should be using an Abstract class whenever you think your class can have 
the state or you need to add any method in the constructor. 
Whereas the default methods in Java 8 are used for backward compatibility.

### Interface with Default
Whenever you need to add additional functionality to an existing legacy 
interface, you can use default methods without breaking any 
existing implementor classes. 

Hence, both are used for totally different purposes, and choosing between two of them fully depends on the requirements of your code.