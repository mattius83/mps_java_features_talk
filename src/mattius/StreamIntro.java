package mattius;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Supplier;



public class StreamIntro {


    public Stream<Student> generateTestStudents(int size) {
        Stream<Student> streamGenerated =
                Stream.generate(() -> new Student("Test Student", 3.5)).limit(size);
        return streamGenerated;
    }

    public Stream<Student> buildStudents() {
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
        return streamResult;
    }

    public  List<String> filterEmptyStrings(List<String> inputList) {

        // create filtered copy of the original list
        List<String> filtered = inputList.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());

        return filtered;
    }

    public Stream<Integer> buildIntegerIteration(int max) {
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(max);
        return streamIterated;
    }

    public Stream<String> buildStreamFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Stream<String> streamWithCharset =
                Files.lines(path, Charset.forName("UTF-8"));
        return streamWithCharset;
    }

}
