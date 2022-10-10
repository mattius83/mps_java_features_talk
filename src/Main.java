import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.stream.Stream;

import mattius.LambdaIntro;
import mattius.IStringFunction;
import mattius.StreamIntro;
import mattius.Student;

public class Main {
    public static void main(String[] args) {
        // lambdaExample();
        // streamFilterExample();
        streamBuilderExample();
    }


    public static void lambdaExample() {
        IStringFunction exclaim = (s) -> s + "!";
        IStringFunction ask = (s) -> s + "?";

        LambdaIntro.printFormatted("Hello", exclaim);
        LambdaIntro.printFormatted("Hello", ask);
    }

    public static void streamBuilderExample() {
        StreamIntro intro = new StreamIntro();
        Stream<Student> myStudents = intro.buildStudents();
        // Print the stream
        myStudents.forEach(s -> System.out.println(s));

    }

    public static void streamFilterExample() {
        StreamIntro intro = new StreamIntro();

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("");
        myList.add("C");
        myList.add("");
        myList.add("D");
        myList.add("F");
        myList.add("");
        myList.add("Q");

        List<String> newList = intro.filterEmptyStrings(myList);
        System.out.println("Filtered list: " + newList);
    }
}