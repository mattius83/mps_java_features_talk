import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.stream.Stream;

import mattius.LambdaIntro;
import mattius.IStringFunction;
import mattius.StreamIntro;
import mattius.Student;
import mattius.Cat;
import mattius.Goose;

public class Main {
    public static void main(String[] args) throws IOException {
        // lambdaExample();
        // streamFilterExample();
        // streamBuilderExample();
        // streamGeneratorExample();
        // streamIterateExample();
        // streamFileReadExample();
        // streamPipelineExample();
        defaultInterfaceExample();
    }


    public static void defaultInterfaceExample() {
        Goose goose = new Goose();
        goose.walk();
        goose.sleep(7);
        goose.migrate(1500);

        Cat cat = new Cat();
        cat.walk();
        cat.sleep(2);
        cat.migrate(0);
    }

    public static void lambdaExample() {
        IStringFunction exclaim = (s) -> s + "!";
        IStringFunction ask = (s) -> s + "?";

        LambdaIntro.printFormatted("Hello", exclaim);
        LambdaIntro.printFormatted("Hello", ask);
    }

    public static void streamGeneratorExample() {
        StreamIntro intro = new StreamIntro();
        Stream<Student> testStudents = intro.generateTestStudents(3);
        testStudents.forEach(s -> System.out.println(s));
    }

    public static void streamIterateExample() {
        StreamIntro intro = new StreamIntro();
        Stream<Integer> sequence = intro.buildIntegerIteration(5);
        sequence.forEach(s -> System.out.println(s));
    }

    public static void streamBuilderExample() {
        StreamIntro intro = new StreamIntro();
        Stream<Student> myStudents = intro.buildStudents();
        // Print the stream
        myStudents.forEach(s -> System.out.println(s));

    }

    public static void streamFileReadExample() throws IOException {

        StreamIntro intro = new StreamIntro();
        String filePath = "./resources/blog.txt";
        Stream<String> lines = intro.buildStreamFromFile(filePath);
        lines.forEach(s -> System.out.println(s));

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

    public static void streamPipelineExample() {
        StreamIntro intro = new StreamIntro();
        Stream<Student> myStudents = intro.buildStudents();

        long countFemaleScholars = myStudents
                .filter( e -> e.getGpa() > 3.7)
                .filter( e-> e.getGender() == "female")
                .count();
        System.out.format("Count of female scholars is: %d", countFemaleScholars);

    }
}